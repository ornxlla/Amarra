package amarra;

import static org.junit.Assert.*;

import org.junit.Test;

public class YatchtPuertoBlackTest {

	@Test
	public void queSeCreeElFondeaderoYTengaElMaximoDeAmarras() {
		Fondeadero f = new Fondeadero(70);
		Integer valorEsperado = 70;
		Integer valorObtenido = f.getCantidadMaximaDeAmarras();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaAmarrarElYate() {
		Fondeadero f = new Fondeadero(70);
		YateAMotor ym = new YateAMotor("AZ1", "Andres Borgeat", 18.87, 5.51, 119.0, 37, 5500.0, 5959.0, "2 x motores diesel MAN RK2805", 9000.0, "23 nudos", 6500.0);
		YateAVela yv = new YateAVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		assertTrue(f.amarrarYate(ym));
		assertTrue(f.amarrarYate(yv));
	}
	
	@Test
	public void queNoSePuedaAmarrarElYate() {
		Fondeadero f = new Fondeadero(70);
		YateAMotor ym = new YateAMotor("AZ1", "Andres Borgeat", 18.87, 5.51, 119.0, 37, 5500.0, 5959.0, "2 x motores diesel MAN RK2805", 9000.0, "23 nudos", 6500.0);
		YateAVela yv = new YateAVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		for(int i = 0; i<70; i++) {
			assertTrue(f.amarrarYate(yv));
		}
		assertFalse(f.amarrarYate(ym));
	}
	
	@Test
	public void queSePuedaDesamarrarElYate() {
		Fondeadero f = new Fondeadero(70);
		YateAMotor ym = new YateAMotor("AZ1", "Andres Borgeat", 18.87, 5.51, 119.0, 37, 5500.0, 5959.0, "2 x motores diesel MAN RK2805", 9000.0, "23 nudos", 6500.0);
		YateAVela yv = new YateAVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		assertTrue(f.amarrarYate(yv));
		assertTrue(f.amarrarYate(ym));
		
		assertTrue(f.desarramarYate(yv));
		
	}
	
	@Test
	public void obtenerLaCantidadDeYatesAmarrados() {
		Fondeadero f = new Fondeadero(70);
		YateAMotor ym = new YateAMotor("AZ1", "Andres Borgeat", 18.87, 5.51, 119.0, 37, 5500.0, 5959.0, "2 x motores diesel MAN RK2805", 9000.0, "23 nudos", 6500.0);
		YateAVela yv = new YateAVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		assertTrue(f.amarrarYate(ym));
		assertTrue(f.amarrarYate(yv));
		Integer valorEsperado = 2;
		Integer valorObtenido = f.getContadorDeAmarras();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void obtenerLaCantidadDeAmmarrasDisponibles() {
		Fondeadero f = new Fondeadero(70);
		YateAMotor ym = new YateAMotor("AZ1", "Andres Borgeat", 18.87, 5.51, 119.0, 37, 5500.0, 5959.0, "2 x motores diesel MAN RK2805", 9000.0, "23 nudos", 6500.0);
		YateAVela yv = new YateAVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		assertTrue(f.amarrarYate(ym));
		assertTrue(f.amarrarYate(yv));
		Integer valorEsperado = 68;
		Integer valorObtenido = f.getAmarrasDisponibles();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void obtenerPrecioDelAmarre() {
		Fondeadero f = new Fondeadero(70);
		YateAMotor ym = new YateAMotor("AZ1", "Andres Borgeat", 18.87, 5.51, 119.0, 37, 5500.0, 5959.0, "2 x motores diesel MAN RK2805", 9000.0, "23 nudos", 6500.0);
		YateAVela yv = new YateAVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		assertTrue(f.amarrarYate(ym));
		assertTrue(f.amarrarYate(yv));
		

		Double valorEsperado = 13000.0;
		assertEquals(valorEsperado, f.obtenerPrecioDelAmarre(ym), 0.01);
		Double valorEsperadoDos = 11000.0;
		assertEquals(valorEsperadoDos, f.obtenerPrecioDelAmarre(yv), 0.01);
	}
	
	@Test
	public void obtenerRecaudacionTotal() {
		Fondeadero f = new Fondeadero(70);
		YateAMotor ym = new YateAMotor("AZ1", "Andres Borgeat", 18.87, 5.51, 119.0, 37, 5500.0, 5959.0, "2 x motores diesel MAN RK2805", 9000.0, "23 nudos", 6500.0);
		YateAVela yv = new YateAVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		YateAVela yv2 = new YateAVela("XXR", "Sebastian Pardo", 6.90, 2.7, 50.0, 5, 1400.0, 21.5, 85.0, 133.0);
		assertTrue(f.amarrarYate(ym));
		assertTrue(f.amarrarYate(yv));
		assertTrue(f.amarrarYate(yv2));
		
		
		Double valorEsperado = 36000.0;
		assertEquals(valorEsperado, f.obtenerRecaudacionFinal(), 0.01);
	}
}
