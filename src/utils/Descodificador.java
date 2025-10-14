package utils;

import java.io.*;

public class Descodificador {

    public void descodificarMensaje(String path){
        File file = new File(path);
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            writer = new BufferedWriter(new FileWriter("C://Proyectos_GitHub//Codificador_Java//src//output//mensaje_descodificado.txt"));
            int lectorCodigo = 0;
            while((lectorCodigo = reader.read()) !=-1){
                writer.write((char)(lectorCodigo/5));
            }
            System.out.println("--- Mensaje descodificado correctamente ---");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero: " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado del archivo");
            }

        }
    }
}
