package Clases_08;

public class Clases {

    public static void main(String[] args) {
        // creamos un objeto de la clase Clases_08.Empleado y le asignamos datos
        Empleado empleadoMaynor = new Empleado("Maynor", "Semeyá", "Tecnologia", 3500);
        // imprimimos lod datos del empleado
        empleadoMaynor.datos();

        // modificamos los datos del empleado
        empleadoMaynor.updateEmpleado("Maynor", "Curruchiche", "Tecnologia", 4500);
        // imprimimos los nuevos datos del empleado
        empleadoMaynor.datos();
    }

}

class Empleado{
    private String nombre;
    private String apellido;
    private String area;
    private int sueldo;

    public Empleado(String nombre, String apellido, String area, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.sueldo = sueldo;
    }

    public void updateEmpleado(String nombre, String apellido, String area, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.sueldo = sueldo;
    }
    public void datos(){
        System.out.println("Datos del empleado");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Area: " + area);
        System.out.println("Sueldo: " + sueldo);
    }

}
