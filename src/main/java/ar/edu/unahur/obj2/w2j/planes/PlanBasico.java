package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public class PlanBasico implements IPlan{
    private Integer limite = 10;
    private Double costoBase = 5.0;

    public PlanBasico(Integer limite2) {
        
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        List<Contenido> contenidos = usuario.getContenido();
        Double costoExcedentes = contenidos.stream().skip(limite).mapToDouble(Contenido::getCostoBase).sum();

        return this.costoBase + costoExcedentes;
    }

}
