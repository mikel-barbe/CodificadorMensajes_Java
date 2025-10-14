package utils;

import java.io.*;

public class Codificador {

    public void codificarMensaje(String path){
        File file = new File(path);
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("C://Proyectos_GitHub//Codificador_Java//src//output//mensaje_codificado.txt"));
            reader = new BufferedReader(new FileReader(file));
            int lectorCodigo = 0;
            /*Devuelve un valor en codigo ASCII y se guarda en la variable lectorCodigo
            * Cuando devuelve -1, es decir no hay caracter(fin del archivo),
            se ejecuta el break y se detiene el while*/
            while((lectorCodigo = reader.read()) !=-1){
                writer.write((char)(lectorCodigo*5));
            }
            System.out.println("--- Archivo codificado correctamente ---");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero: " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado del archivo");
            }
        }

    }

}
