package amarra;

public class Yate {
	protected String nombre;
	protected String dueño;
	protected Double mangaAncho;
	protected Double calado;
	protected Double esloraLargo;
	protected Integer tripulacion;
	protected Boolean esAMotor;
	
	public Yate(String nombre, String dueño, Double mangaAncho, Double calado, Double esloraLargo, Integer tripulacion){
		this.nombre = nombre;
		this.dueño = dueño;
		this.mangaAncho = mangaAncho;
		this.calado = calado;
		this.esloraLargo = esloraLargo;
		this.tripulacion = tripulacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public Double getMangaAncho() {
		return mangaAncho;
	}

	public void setMangaAncho(Double mangaAncho) {
		this.mangaAncho = mangaAncho;
	}

	public Double getCalado() {
		return calado;
	}

	public void setCalado(Double calado) {
		this.calado = calado;
	}

	public Double getEsloraLargo() {
		return esloraLargo;
	}

	public void setEsloraLargo(Double esloraLargo) {
		this.esloraLargo = esloraLargo;
	}

	public Integer getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}

	public Boolean getEsAMotor() {
		return esAMotor;
	}

	public void setEsAMotor(Boolean esAMotor) {
		this.esAMotor = esAMotor;
	}
	
	
}
