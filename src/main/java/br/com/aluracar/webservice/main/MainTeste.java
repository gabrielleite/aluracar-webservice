package br.com.aluracar.webservice.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;

import javax.ws.rs.ext.RuntimeDelegate;

import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.glassfish.grizzly.http.server.ServerConfiguration;
import org.glassfish.grizzly.http.util.HttpStatus;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpContainer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.message.internal.ReaderWriter;
import org.glassfish.jersey.server.ResourceConfig;

import br.com.aluracar.webservice.filtro.CORSFilter;

public class MainTeste {
	// Base URI the Grizzly HTTP server will listen on
    public static final String BASE_URI = "0.0.0.0";
    public static final String APP_PATH = "/";
	public static final String API_PATH = "/api/";
	public static final String WEB_ROOT = "/webroot/app";
	public static final String BASE_PACKAGE = "br.com.aluracar.webservice";
	public static final int PORT = 8080;
	
	public static String getAppUri(String ip) {
		return String.format("http://%s:%s", ip, PORT);
	}

    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
     * @return Grizzly HTTP server.
     */
    public static HttpServer startServer() {
        // create a resource config that scans for JAX-RS resources and providers
        // in com.example.rest package
        final ResourceConfig rc = new ResourceConfig()
						        		.register(CORSFilter.class)
										.register(JacksonFeature.class)
        								.packages("br.com.aluracar.webservice");

        // create and start a new instance of grizzly http server
        // exposing the Jersey application at BASE_URI
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create(getAppUri(BASE_URI)), rc);
        
        
        final ServerConfiguration config = server.getServerConfiguration();
		// add handler for serving static content
        config.addHttpHandler(new StaticContentHandler(), APP_PATH);
        
     // add handler for serving JAX-RS resources
		config.addHttpHandler(RuntimeDelegate.getInstance().createEndpoint(
				new ResourceConfig()
					.register(CORSFilter.class)
					.register(JacksonFeature.class)
					.packages(BASE_PACKAGE), GrizzlyHttpContainer.class), API_PATH);
        
		return server;
    }

    /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        System.out.println(String.format("Jersey app started with WADL available at "
                + "%sapplication.wadl\nHit enter to stop it...", BASE_URI));
        System.in.read();
        server.stop();
    }
    
    /**
	 * Simple HttpHandler for serving static content included in web root directory
	 * of this application.
	 */
	private static class StaticContentHandler extends HttpHandler {
		private static final HashMap<String, String> EXTENSION_TO_MEDIA_TYPE;

		static {
			EXTENSION_TO_MEDIA_TYPE = new HashMap<String, String>();
			EXTENSION_TO_MEDIA_TYPE.put("html", "text/html");
			EXTENSION_TO_MEDIA_TYPE.put("js", "application/javascript");
			EXTENSION_TO_MEDIA_TYPE.put("map", "application/javascript");
			EXTENSION_TO_MEDIA_TYPE.put("css", "text/css");
			EXTENSION_TO_MEDIA_TYPE.put("png", "image/png");
			EXTENSION_TO_MEDIA_TYPE.put("jpg", "image/jpg");
			EXTENSION_TO_MEDIA_TYPE.put("ico", "image/png");
			EXTENSION_TO_MEDIA_TYPE.put("json", "text/json");
			EXTENSION_TO_MEDIA_TYPE.put("geojson", "text/geojson");
			EXTENSION_TO_MEDIA_TYPE.put("pdf", "application/pdf");
			EXTENSION_TO_MEDIA_TYPE.put("gif", "image/gif");
		}

		@Override
		public void service(Request request, Response response) throws Exception {
			String uri = request.getRequestURI();

			int pos = uri.lastIndexOf('.');
			String extension = uri.substring(pos + 1);
			String mediaType = EXTENSION_TO_MEDIA_TYPE.get(extension);

			if (!uri.equals("/") && (uri.contains("..") || mediaType == null)) {
				response.sendError(HttpStatus.NOT_FOUND_404.getStatusCode());
				return;
			}

			final String resourcesContextPath = request.getContextPath();
			if (resourcesContextPath != null && !resourcesContextPath.isEmpty()) {
				if (!uri.startsWith(resourcesContextPath)) {
					response.sendError(HttpStatus.NOT_FOUND_404.getStatusCode());
					return;
				}

				uri = uri.substring(resourcesContextPath.length());
			}

			uri = uri.equals("/") ? uri.concat("index.html") : uri;
//			System.out.println(uri);
			InputStream fileStream;

			fileStream = MainServer.class.getResourceAsStream(WEB_ROOT + uri);
			
			if (fileStream == null) {
				response.sendError(HttpStatus.NOT_FOUND_404.getStatusCode());
			} else {
				response.setStatus(HttpStatus.OK_200);
				response.setContentType(mediaType);
				ReaderWriter.writeTo(fileStream, response.getOutputStream());
			}
		}
	}
}
