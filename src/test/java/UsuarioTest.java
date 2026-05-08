import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.contenidos.Pelicula;
import ar.edu.unahur.obj2.w2j.planes.IPlan;
//import ar.edu.unahur.obj2.w2j.contenidos.Pelicula;
//import ar.edu.unahur.obj2.w2j.planes.PlanBasico;
import ar.edu.unahur.obj2.w2j.planes.Usuario;

public class UsuarioTest {
    @Test
    void dadoUnUsuarioConPlanBasico_SeCalculaCorrectamenteSuCostoMensual(){
        Usuario usuario = new Usuario();
        //Pelicula lamonja = new Pelicula("La Monja", 2.0);
        //usuario.verContenido(lamonja);
        assertEquals(5.0, usuario.costoMensual());
    }

    @Test
    void testGetContenidos(){
        Usuario usuario = new Usuario();
        Pelicula lamonja = new Pelicula("La Monja", 2.0);
        usuario.verContenido(lamonja);
        assertEquals(usuario.getContenido().size(), 1);
    }

    @Test
    void testGetPlan(){
        Usuario usuario = new Usuario();
        IPlan PlanFamiliar = null;
        usuario.cambiarPlan(PlanFamiliar);
        assertEquals(usuario.getPlan(), PlanFamiliar);
    }
}
