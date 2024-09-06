package Excepciones_10;

public class ExtraException {

    public static void lanzarExcepcion(int[] numeros) throws MiException {

        if (numeros.length < 2) {
            throw new RuntimeException("El array tiene que tener mas de dos elementos");
        } else if (numeros[5] != 0 ) {
            throw new MiException("Excepcion creada por mi xd ");
        }else {
            throw new ArithmeticException("No se puede realizar la operacion");
        }
    }

    public static void main(String[] args)  {

        try {

            lanzarExcepcion(new int[]{2, 5, 1});
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }catch (MiException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("el programa esta finalizado");
        }

    }


}

class MiException extends Exception {
    public MiException(String mensaje) {
        super(mensaje);
    }
}
