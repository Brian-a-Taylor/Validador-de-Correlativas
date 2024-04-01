package Clases;

import java.util.List;

public class Inscripcion {

    public List<Materia> materias;
    public Alumno alumno;

    public Inscripcion (List<Materia>materias,Alumno alumno){
        this.materias = materias;
        this.alumno = alumno;
    }

    public boolean Aprobada(){

        for(Materia materia: materias){
            if(!alumno.aprobadas.containsAll(materia.correlativas)){
                return false;
            }
        }
        return true;
    }

}
