package Herencia_Polimorfismo_09;

import java.util.Set;

public class RetoHerencia {

    public static void main(String[] args) {

        // creamos un gerente
        Gerente gerente = new Gerente(10L,"Maynor");

        // creamos dos projectManager
        ProjectManager projectManager = new ProjectManager(15L, "David");
        ProjectManager projectManager2 = new ProjectManager(20L, "Yoni");

        // creamos programadores
        Programmer programmer = new Programmer(1L,"Fati", "Javascript");
        Programmer programmer1 = new Programmer(2L,"Deysi", "Java");
        Programmer programmer2= new Programmer(3L,"Damaris", "C++");
        Programmer programmer3 = new Programmer(4L,"Gladys", "phyton");

        // asignamos los programadores que estaran a su cargo
        // projectManager David
        projectManager.addProgrammer(programmer);
        projectManager.addProgrammer(programmer1);

        // asignamos a los programadores que estaran a su cargo
        // projectManager Yoni
        projectManager2.addProgrammer(programmer2);
        projectManager2.addProgrammer(programmer3);

        // asignamos a los projectManager que estaran a su cargo
        gerente.addProjectManager(projectManager);
        gerente.addProjectManager(projectManager2);

    }
}


//clase Empleado <-------------
class Empleado{
    private Long id;
    private String nombre;

    Empleado(Long id, String nombre){
        this.id = id;
    }
    Empleado(){
    }
}

// clase Gerente <---------------
class Gerente extends Empleado{

    private Set<ProjectManager> projectManager;
    private Set<Programmer> programmer;

    public Gerente(Long id, String nombre) {
        super(id, nombre);
    }

    public void addProjectManager(ProjectManager emp){
        projectManager.add(emp);
    }

    public void addProgrammer(Programmer emp){
        programmer.add(emp);
    }



}

// clase Project Manager <-----------
class ProjectManager extends Empleado{
    private Set<Programmer> programmers;

    public ProjectManager(Long id, String nombre) {
        super(id, nombre);
    }

    public void addProgrammer(Programmer emp){
        programmers.add(emp);
    }
}

// clase Programer <-----------
class Programmer extends Empleado {
    private String lenguaje;

    public Programmer(Long id, String nombre, String lenguaje){
        super(id, nombre);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje(){
        return lenguaje;
    }


}

