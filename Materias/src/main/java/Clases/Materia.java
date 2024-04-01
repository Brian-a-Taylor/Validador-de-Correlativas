package Clases;

import java.util.List;

public class Materia {
    public List<Materia> correlativas;
    public String nombre;

    public Materia (List<Materia> Materias, String nombre ){
        this.correlativas = Materias;
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
