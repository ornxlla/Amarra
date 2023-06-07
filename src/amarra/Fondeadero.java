package amarra;

import java.util.LinkedList;

public class Fondeadero {

	private Integer cantidadMaximaDeAmarras;
	private Integer contadorDeAmarras = 0;
	private Integer amarrasDisponibles;
	private Double precioTipo = 0.0;
	private Double precioEslora = 0.0;
	private Double precioAmarre = 0.0;
	private Double recaudacionTotal = 0.0;
	private LinkedList <Yate> yates = new LinkedList <Yate>();
	
	public Fondeadero(Integer cantidadMaximaDeAmarras) {
		this.cantidadMaximaDeAmarras = cantidadMaximaDeAmarras;
		this.amarrasDisponibles = cantidadMaximaDeAmarras;
	}

	public Integer getCantidadMaximaDeAmarras() {
		return cantidadMaximaDeAmarras;
	}

	
	public Integer getContadorDeAmarras() {
		return contadorDeAmarras;
	}


	public Double getPrecioAmarre() {
		return precioAmarre;
	}


	public LinkedList<Yate> getYates() {
		return yates;
	}

	public void setYates(LinkedList<Yate> yates) {
		this.yates = yates;
	}

	
	public Boolean amarrarYate(Yate yate) {
		if(this.contadorDeAmarras < this.cantidadMaximaDeAmarras) {
			this.yates.add(yate);
			this.contadorDeAmarras++;
			return true;
		}
		return false;
	}

	public Boolean desarramarYate(Yate yate) {
		if(this.yates.contains(yate)) {
			this.yates.remove(yate);
			this.contadorDeAmarras--;
			return true;
		}
		return false;
	}

	public Integer getAmarrasDisponibles() {
		for(Yate y:yates) {
			if(this.yates.contains(y)) {
			this.amarrasDisponibles--;
			}
		}
		return this.amarrasDisponibles;
	}

	public Double obtenerPrecioDelAmarre(Yate yate) {
		if(yate.getEsAMotor() == true) {
			this.precioTipo = 10000.0;
		}	else {
				this.precioTipo = 9000.0;
			}
		
		if(yate.getEsloraLargo() <= 20) {
			this.precioEslora = 2000.0;
		} else {
			this.precioEslora = 3000.0;
		}
		return this.precioAmarre = this.precioTipo + this.precioEslora;
	}

	public Double obtenerRecaudacionFinal() {
		for(Yate y :yates) {
			this.recaudacionTotal += this.obtenerPrecioDelAmarre(y);
		}
		return this.recaudacionTotal;
	}
}
