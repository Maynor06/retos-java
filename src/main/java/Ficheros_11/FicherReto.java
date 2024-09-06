package Ficheros_11;

import java.io.*;
import java.util.Scanner;

public class FicherReto {

    public static Scanner sc = new Scanner(System.in);

    public static void crear(File file) {

        try {

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Cual es el nombre del producto? ");
            String nombre = sc.nextLine();
            System.out.println("Ingresa la cantidad vendida");
            int cantidad = Integer.parseInt(sc.nextLine());
            System.out.println("Ingresa el valor del producto");
            double valor = Double.parseDouble(sc.nextLine());

            String linea = nombre + " , " + cantidad + " , " + valor;
            bw.write(linea);
            bw.newLine();
            bw.close();
            System.out.println("el producto a sido insertado con exito!!! ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void mostrarProductos(File file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String buscar(String linea, String nombrePrducto) {
        String[] datos = linea.split(" , ");
        if (datos[0] == nombrePrducto) {
            System.out.println("Ingresa el nuevo nombre del producto");
            String nombre = sc.nextLine();
            System.out.println("Ingresa la nueva cantidad vendida");
            int cantidad = Integer.parseInt(sc.nextLine());
            System.out.println("Ingresa el nuevo valor del producto");
            double valor = Double.parseDouble(sc.nextLine());
            String nuevaLinea = nombre + " " + cantidad + " " + valor;

            return nuevaLinea;
        } else {
            return linea;
        }
    }

    public static File actualizar(File file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("Cual es el nombre del producto que desea actualizar? ");
            String nombre = sc.nextLine();
            String[] lineas = new String[100];
            int contador = 0;
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas[contador] = linea;
                contador++;
            }
            br.close();

            File fichero = new File("productos.txt");
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < contador; i++) {
                bw.write(buscar(lineas[i], nombre));
            }
            bw.close();
            return fichero;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {

        File fichero;

        try {
            fichero = new File("C:/Users/Maynor/Documents/Productos.txt");
            if(!fichero.exists()) {
                fichero.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int opcion = 0;

        do {
            System.out.println("---------------------> Bienvenido al programa <---------------------");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Salir");
            System.out.println(" ");
            System.out.println("Ingresa una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    crear(fichero);
                    break;
                    case 2:
                        mostrarProductos(fichero);
                        break;
                        case 3:
                            // pendiente
                            break;
                            case 4:
                                fichero = actualizar(fichero);
                                break;
                                case 5:
                                    // pendiente
                                    break;
                                    case 6:
                                        fichero.delete();
                                        break;
                default: System.out.println("Opcion no valida");
            }

        }while (opcion != 6);
    }

}
