package Clases;

import java.util.List;

public class Alumno {
    public List<Materia> aprobadas;
    public String nombre;

    public Alumno (List<Materia> aprobadas, String nombre){
        this.aprobadas = aprobadas;
        this.nombre = nombre;
    }

    public List<Materia> getAprobadas() {
        return aprobadas;
    }
}
