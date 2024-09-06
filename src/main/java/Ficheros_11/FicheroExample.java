package Ficheros_11;

import java.io.*;

public class FicheroExample {
    public static void main(String[] args) {

        try {
            //hacemos enfasis de donde estaria el fichero
            File file = new File("C:/Users/Maynor/Documents/Maynor06.txt");

            // pregunta si el archivo existe y si no lo crea
            if(!file.exists()){
                file.createNewFile();
                System.out.println("Fichero creado " + file.exists());
            }

            // para escribir en el fichero
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Nombre: Maynor David");
            bw.newLine();
            bw.write("Edad: 20");
            bw.newLine();
            bw.write("Lenguaje favorito: Java");
            bw.close();

            // para leer el fichero
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String contenido;

            //lee cada linea del fichero y la imprime si esta es diferente a null
            while((contenido = br.readLine()) != null){
                System.out.println(contenido);
            }

            //cerramos la conexion
            br.close();
            // eliminamos el fichero
            file.delete();
        }catch (Exception e){
            System.out.println("Fichero creado" + e);
        }
    }


}
