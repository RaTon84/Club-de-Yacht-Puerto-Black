package ar.edu.unahur.obj2.clubYate;

public class YateMotor extends Yate {

    private Integer desplazamiento;
    private String propulsion;
    private Integer potencia;
    private Integer velocidad;
    private Integer autonomia;

    public YateMotor(String nombre, String duenio, Double manga,
                     Double calado, Double eslora, Integer tripulacion, Integer peso, Integer desplazamiento,
                     String propulsion, Integer potencia, Integer velocidad, Integer autonomia) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.manga = manga;
        this.calado = calado;
        this.eslora = eslora;
        this.tripulacion = tripulacion;
        this.peso = peso;
        this.desplazamiento = desplazamiento;
        this.propulsion = propulsion;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.autonomia = autonomia;
    }
}
