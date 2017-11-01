package br.com.aluracar.webservice.modelo.geolocalizacao;

public class LatLng {
	private String latitude;
	private String longitude;
	
	public LatLng(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	@Override
	public String toString() {
		return latitude + ", " + longitude;
	}
}
