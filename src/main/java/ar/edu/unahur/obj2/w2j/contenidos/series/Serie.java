package ar.edu.unahur.obj2.w2j.contenidos.series;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public class Serie extends Contenido{
    
    private List<Temporada> temporadas;
    
    public Serie(String titulo, Double costoBase, List<Temporada> temporadas) {
        super(titulo, costoBase);
        this.temporadas = temporadas;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public Double getCostoBase() {
        return costoBase + temporadas.stream().mapToDouble(t->t.getCosto()).average().orElse(0.0);
    }

    
}
