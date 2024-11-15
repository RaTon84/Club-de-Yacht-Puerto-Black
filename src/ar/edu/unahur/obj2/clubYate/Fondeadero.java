package ar.edu.unahur.obj2.clubYate;
import java.util.HashSet;
import java.util.Set;

public class Fondeadero {

    private Integer maximoAmarras;
    private Set<Yate> amarras = new HashSet<Yate>();

    public Fondeadero(Integer maximoAmarras) {
        this.maximoAmarras = maximoAmarras;
    }

    public Integer getMaximoAmarras() {
        return maximoAmarras;
    }

    public void amarrarYate(YateMotor yateMotor) throws SinDisponibilidadAmarraException {
        if (this.amarras.size() < this.maximoAmarras) {
            amarras.add(yateMotor);
        }else{
            throw new SinDisponibilidadAmarraException("No hay lugar disponible");
        }
    }

    public Set<Yate> getAmarras() {
        return amarras;
    }
}
