package ar.edu.unahur.obj2.clubYate;

import java.util.Objects;

public class Yate {

    protected String nombre;
    protected String duenio;
    protected Double manga;
    protected Double calado;
    protected Double eslora;
    protected Integer tripulacion;
    protected Integer peso;

    public Double getEslora() {
        return eslora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yate yate = (Yate) o;
        return Objects.equals(nombre, yate.nombre) && Objects.equals(duenio, yate.duenio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, duenio);
    }
}
