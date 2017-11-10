package br.com.aluracar.webservice.modelo.geolocalizacao;

public class LimitesExtremos {
	private LatLng nordeste;
	private LatLng sudoeste;
	
	public LimitesExtremos(LatLng nordeste, LatLng sudoeste) {
		this.nordeste = nordeste;
		this.sudoeste = sudoeste;
	}
	
	public LatLng getNordeste() {
		return nordeste;
	}
	public void setNordeste(LatLng nordeste) {
		this.nordeste = nordeste;
	}
	public LatLng getSudoeste() {
		return sudoeste;
	}
	public void setSudoeste(LatLng sudoeste) {
		this.sudoeste = sudoeste;
	}
}
