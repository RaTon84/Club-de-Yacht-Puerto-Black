package ar.edu.unahur.obj2.clubYate;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Optional;


public class fondeaderoTest {
    Fondeadero yachtPuertoBlack = new Fondeadero(70);
    YateMotor yateMotor = new YateMotor(
            "AZ2",
            "Andres Borgeat",
            18.87,
            5.15,
            119.0,
            37,
            5500,
            5959,
            "1 x motores diesel MAN RK2805",
            9000,
            23,
            6500
    );
    YateVela yateVela = new YateVela(
            "XXR",
            "Sebastián Pardo",
            6.9,
            2.7,
            13.45,
            5,
            1400,
            21.5,
            85.0,
            133.0
    );

    @Test
    public void maximoAmarras(){
        assertNotNull(yachtPuertoBlack);
        assertEquals(Integer.valueOf(70), yachtPuertoBlack.getMaximoAmarras());
    }

    @Test
    public void amarrarYate() throws SinDisponibilidadAmarraException {
        yachtPuertoBlack.amarrarYate(yateMotor);
        assertTrue(yachtPuertoBlack.getAmarras().contains(yateMotor));
    }

    @Test (expected = SinDisponibilidadAmarraException.class)
    public void noExisteAmarraDisponible() throws SinDisponibilidadAmarraException {
        Fondeadero yachtPuertoBlackTest = new Fondeadero(1);
        yachtPuertoBlackTest.amarrarYate(yateMotor);
        yachtPuertoBlackTest.amarrarYate(yateVela);
    }

    @Test
    public void desamarrarYate() throws SinDisponibilidadAmarraException {
        yachtPuertoBlack.amarrarYate(yateMotor);
        yachtPuertoBlack.desamarrarYate(yateMotor);
        assertFalse(yachtPuertoBlack.getAmarras().contains(yateMotor));
    }

    @Test
    public void cantidadDeYatesAmarrados() throws SinDisponibilidadAmarraException {
        yachtPuertoBlack.amarrarYate(yateMotor);
        yachtPuertoBlack.amarrarYate(yateVela);
        assertEquals(2, yachtPuertoBlack.getAmarras().size());
    }

    @Test
    public void cantidadDeAmarrasDisponibles() throws SinDisponibilidadAmarraException {
        yachtPuertoBlack.amarrarYate(yateMotor);
        yachtPuertoBlack.amarrarYate(yateVela);
        assertEquals(Integer.valueOf(68), yachtPuertoBlack.getAmarrasDisponibles());
    }

    @Test
    public void obtenerPrecioDeAmarre() throws SinDisponibilidadAmarraException {
        assertEquals(Integer.valueOf(13_000), yachtPuertoBlack.obtenerPrecioDeAmarre(yateMotor));
    }

    @Test
    public void obtenerRecaudacionTotal() throws SinDisponibilidadAmarraException {
        yachtPuertoBlack.amarrarYate(yateMotor);
        yachtPuertoBlack.amarrarYate(yateVela);
        assertEquals(Integer.valueOf(24_000), yachtPuertoBlack.obtenerRecaudacionTotal());
    }

}
