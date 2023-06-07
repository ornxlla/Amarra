package amarra;

public class YateAVela extends Yate {

	private Double pesoEnKg;
	private Double alturaMastil;
	private Double superficieVelicaMayor;
	private Double superficieTotalVelaMayorYFoque;

	public YateAVela(String nombre, String dueño, Double mangaAncho, Double calado, Double esloraLargo, Integer tripulacion, Double pesoEnKg, Double alturaMastil, Double superficieVelicaMayor,
			Double superficieTotalVelaMayorYFoque) {
		super(nombre, dueño, mangaAncho, calado, esloraLargo, tripulacion);
		this.pesoEnKg = pesoEnKg;
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotalVelaMayorYFoque = superficieTotalVelaMayorYFoque;
		this.esAMotor = false;
	}

	public Double getPesoEnKg() {
		return pesoEnKg;
	}

	public void setPesoEnKg(Double pesoEnKg) {
		this.pesoEnKg = pesoEnKg;
	}

	public Double getAlturaMastil() {
		return alturaMastil;
	}

	public void setAlturaMastil(Double alturaMastil) {
		this.alturaMastil = alturaMastil;
	}

	public Double getSuperficieVelicaMayor() {
		return superficieVelicaMayor;
	}

	public void setSuperficieVelicaMayor(Double superficieVelicaMayor) {
		this.superficieVelicaMayor = superficieVelicaMayor;
	}

	public Double getSuperficieTotalVelaMayorYFoque() {
		return superficieTotalVelaMayorYFoque;
	}

	public void setSuperficieTotalVelaMayorYFoque(Double superficieTotalVelaMayorYFoque) {
		this.superficieTotalVelaMayorYFoque = superficieTotalVelaMayorYFoque;
	}

	
}
