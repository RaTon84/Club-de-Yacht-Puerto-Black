package ar.edu.unahur.obj2.clubYate;
import org.junit.Test;
import static org.junit.Assert.*;

public class yateMotorTest {
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

    @Test
    public void test() {
        assertNotNull(yateMotor);
    }
}
