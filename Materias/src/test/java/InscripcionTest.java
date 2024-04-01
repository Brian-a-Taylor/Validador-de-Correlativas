import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import Clases.Materia;
import Clases.Alumno;
import Clases.Inscripcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InscripcionTest {
    Materia am1 = new Materia(new ArrayList<Materia>(), "am1");
    Materia am2 = new Materia(List.of(am1),"am2");
    Materia quimica = new Materia(new ArrayList<Materia>(), "quimica");

    ArrayList<Materia> aprobadasBrian = new ArrayList<Materia>(List.of(am1));

    Alumno fulbo = new Alumno(new ArrayList<>(), "fulbo");
    Alumno brian = new Alumno(aprobadasBrian,"brian");

    Inscripcion inscripcionFulbo = new Inscripcion(List.of(am2,quimica),fulbo);
    Inscripcion inscripcionBrian = new Inscripcion(List.of(am2,quimica),brian);

    @Test
    public void testInscripcionAprobada(){

        Assert.assertEquals(true,inscripcionBrian.Aprobada());

    }
    @Test
    public void testInscripcionDesaprobada(){
        Assert.assertEquals(false,inscripcionFulbo.Aprobada());
    }

}
