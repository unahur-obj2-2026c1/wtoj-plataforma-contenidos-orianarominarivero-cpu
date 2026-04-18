package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido {
    private String titulo;
    protected Double costoBase;
    
    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    } 
}
