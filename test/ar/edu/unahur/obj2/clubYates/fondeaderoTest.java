package ar.edu.unahur.obj2.clubYates;
import static org.junit.Assert.*;
import org.junit.Test;


public class fondeaderoTest {
    Fondeadero yachtPuertoBlack = new Fondeadero(70);
    YateMotor yateMotor = new YateMotor(
            "AZ1",
            "Andres Borgeat",
            18.87,
            5.15,
            119,
            37,
            5500,
            5959,
            "2 x motores diesel MAN RK2805",
            9000,
            23,
            6500
    );
    YateMotor yateMotor2 = new YateMotor(
            "AZ2",
            "Andres Borgeat",
            18.87,
            5.15,
            119,
            37,
            5500,
            5959,
            "1 x motores diesel MAN RK2805",
            9000,
            23,
            6500
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
        yachtPuertoBlackTest.amarrarYate(yateMotor2);
    }
}
