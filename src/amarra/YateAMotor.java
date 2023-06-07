package amarra;

public class YateAMotor extends Yate{


	private Double pesoEnT;
	private Double desplazamientoEnT;
	private String propulsion;
	private Double potenciaEnKW;
	private String velocidad;
	private Double autonomiaEnMN;
	

	public YateAMotor(String nombre, String dueño, Double mangaAncho, Double calado, Double esloraLargo, Integer tripulacion, Double pesoEnT, Double desplazamientoEnT, String propulsion,
			Double potenciaEnKW, String velocidad, Double autonomiaEnMN) {
		super(nombre, dueño, mangaAncho, calado, esloraLargo, tripulacion);
		this.pesoEnT = pesoEnT;
		this.desplazamientoEnT = desplazamientoEnT;
		this.propulsion = propulsion;
		this.potenciaEnKW = potenciaEnKW;
		this.velocidad = velocidad;
		this.autonomiaEnMN = autonomiaEnMN;
		this.esAMotor = true;
	}


	public Double getPesoEnT() {
		return pesoEnT;
	}


	public void setPesoEnT(Double pesoEnT) {
		this.pesoEnT = pesoEnT;
	}


	public Double getDesplazamientoEnT() {
		return desplazamientoEnT;
	}


	public void setDesplazamientoEnT(Double desplazamientoEnT) {
		this.desplazamientoEnT = desplazamientoEnT;
	}


	public String getPropulsion() {
		return propulsion;
	}


	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}


	public Double getPotenciaEnKW() {
		return potenciaEnKW;
	}


	public void setPotenciaEnKW(Double potenciaEnKW) {
		this.potenciaEnKW = potenciaEnKW;
	}


	public String getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}


	public Double getAutonomiaEnMN() {
		return autonomiaEnMN;
	}


	public void setAutonomiaEnMN(Double autonomiaEnMN) {
		this.autonomiaEnMN = autonomiaEnMN;
	}

	
}
