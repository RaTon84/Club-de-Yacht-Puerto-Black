package ar.edu.unahur.obj2.clubYate;
import java.util.HashSet;
import java.util.Set;

public class Fondeadero {

    private Integer maximoAmarras;
    private Set<Yate> amarras = new HashSet<Yate>();

    public Fondeadero(Integer maximoAmarras) {
        this.maximoAmarras = maximoAmarras;
    }

    public void amarrarYate(Yate yate) throws SinDisponibilidadAmarraException {
        if (this.amarras.size() < this.maximoAmarras) {
            amarras.add(yate);
        }else{
            throw new SinDisponibilidadAmarraException("No hay lugar disponible");
        }
    }

    public void desamarrarYate(Yate yate) {
        if (this.amarras.contains(yate)) {
            amarras.remove(yate);
        }
    }

    public Integer getMaximoAmarras() {
        return maximoAmarras;
    }

    public Set<Yate> getAmarras() {
        return amarras;
    }

    public Integer getAmarrasDisponibles(){
        return maximoAmarras - amarras.size();
    }

    public Integer obtenerPrecioDeAmarre(Yate yate) {
        Integer costoMensual;
        if (yate instanceof YateMotor) {
            costoMensual = 10_000;
        }else{
            costoMensual = 9_000;
        }
        if (yate.getEslora() > 20) {
            costoMensual += 3_000;
        } else {
            costoMensual += 2_000;
        }
        return costoMensual;
    }

    public Integer obtenerRecaudacionTotal() {
        return amarras.stream()
                .mapToInt(this::obtenerPrecioDeAmarre)
                .sum();
    }
}
