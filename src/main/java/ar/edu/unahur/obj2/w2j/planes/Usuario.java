package ar.edu.unahur.obj2.w2j.planes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;


public class Usuario {
    private List<Contenido> contenidos = new ArrayList<>();
    private IPlan plan = new PlanBasico(10);

    public Usuario(IPlan plan) {
        this.plan = plan;
    }
    public Usuario(){}

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void verContenido(Contenido contenido){
        contenidos.add(contenido);
    }

    public void cambiarPlan(IPlan planNuevo){
        this.plan = planNuevo;
    }

    public Double costoMensual(){
        return plan.costoPlan(this);
    }
    public List<Contenido> getContenido() {
        return this.contenidos;
    }

    public IPlan getPlan(){
        return plan;
    }
}
