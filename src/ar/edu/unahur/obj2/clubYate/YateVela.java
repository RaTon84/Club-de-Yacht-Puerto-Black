package ar.edu.unahur.obj2.clubYate;

public class YateVela extends Yate{

    private Double alturaMastil;
    private Double velicaMayor;
    private Double superficieTotal;

    public YateVela(String nombre, String duenio, Double manga,
                    Double calado, Double eslora, Integer tripulacion, Integer peso,
                    Double alturaMastil, Double velicaMayor, Double superficieTotal) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.manga = manga;
        this.calado = calado;
        this.eslora = eslora;
        this.tripulacion = tripulacion;
        this.peso = peso;
        this.alturaMastil = alturaMastil;
        this.velicaMayor = velicaMayor;
        this.superficieTotal = superficieTotal;
    }

}
