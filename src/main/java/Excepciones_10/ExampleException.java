package Excepciones_10;

public class ExampleException {

    public static void main(String[] args) {

        try {
            float division = 10/0;
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
