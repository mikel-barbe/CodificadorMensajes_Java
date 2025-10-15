package main;

import utils.Codificador;
import utils.Descodificador;

import java.io.File;

public class Entrada {
    public static void main(String[] args) {

      Codificador codificador = new Codificador();
      codificador.codificarMensaje("C:/ProyectosGithub/Codificador_Mensajes_Java/src/resources/archivo.txt");

      //Descodificador descodificador = new Descodificador();
      //descodificador.descodificarMensaje("C:/ProyectosGitHub/Codificador_Mensajes_Java/src/output/mensaje_codificado.txt");

    }

}
