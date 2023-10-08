/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Pruebas;

import CrearMazo.*;
import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class PruebasTiempo {

    public static void main(String[] args) {/*
       // Crear una instancia de MazoDificil
        MazoDificil<Integer> mazo = new MazoDificil<>();
        long contador = 0;

        // Generar y procesar los datos en lotes
        int totalDatos = 1000000000;
        int batchSize = 10000000; // Procesar 1,000,000 de datos en cada lote
        int batches = totalDatos / batchSize;

        Random random = new Random();

        // Procesar los datos en lotes
        for (int batch = 0; batch < batches; batch++) {
            // Generar y encolar datos en el lote actual
            for (int i = 0; i < batchSize; i++) {
                int dato = random.nextInt(1000); // Números aleatorios del 0 al 999
                mazo.enqueue(dato, dato, 0);
            }

            // Desencolar y procesar datos en el lote actual
            long startTime = System.currentTimeMillis();
            while (!mazo.empty()) {
                mazo.dequeue();
            }
            long endTime = System.currentTimeMillis();

            // Calcular y mostrar el tiempo transcurrido para el lote actual
            long tiempoTranscurrido = endTime - startTime;
            System.out.println("Lote " + (batch + 1) + ": Tiempo transcurrido - " + tiempoTranscurrido + " milisegundos");
            contador += tiempoTranscurrido;
          
        }
      System.out.println("Tiempo transcurrido - " + contador + " milisegundos");
         */

        //ENQUEUE

        // Crear una instancia de MazoDificil
        /*
        MazoDificil<Integer> mazo = new MazoDificil<>();
        long contador = 0;

        // Generar y encolar los datos en lotes
        int totalDatos = 90000000;
        int batchSize = 10000000; // Encolar 10,000,000 de datos en cada lote
        int batches = totalDatos / batchSize;

        Random random = new Random();

        // Encolar los datos en lotes y medir el tiempo
        for (int batch = 0; batch < batches; batch++) {
            // Generar y encolar datos en el lote actual
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < batchSize; i++) {
                int dato = random.nextInt(1000); // Números aleatorios del 0 al 999
                mazo.enqueue(dato, dato, 0);
            }
            long endTime = System.currentTimeMillis();

            // Calcular y mostrar el tiempo transcurrido para encolar el lote actual
            long tiempoTranscurrido = endTime - startTime;
            System.out.println("Lote " + (batch + 1) + ": Tiempo transcurrido al encolar - " + tiempoTranscurrido + " milisegundos");
            contador += tiempoTranscurrido;
        }

        System.out.println("Tiempo total transcurrido al encolar - " + contador + " milisegundos");*/
        //ENQUEUE INTERMEDIO
        // Crear una instancia de MazoDificil
        MazoDificil<Integer> mazo = new MazoDificil<>();
        long contador = 0;

        // Generar y encol1000000ar los datos en lotes
        int totalDatos = 100;
        int batchSize = 100; // Encolar 10,000,000 de datos en cada lote
        int batches = totalDatos / batchSize;

        Random random = new Random();

        // Encolar los datos en la mitad del mazo y medir el tiempo
        for (int batch = 0; batch < batches; batch++) {
            // Generar y encolar datos en el lote actual
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < batchSize; i++) {
                int dato = random.nextInt(1000); // Números aleatorios del 0 al 999
                int posicion = mazo.size() / 2; // Calcular la posición en la mitad del mazo
                mazo.enqueue(dato, dato, posicion); // Encolar en la mitad del mazo
            }
            long endTime = System.currentTimeMillis();

            // Calcular y mostrar el tiempo transcurrido para encolar en la mitad del mazo
            long tiempoTranscurrido = endTime - startTime;
            System.out.println("Lote " + (batch + 1) + ": Tiempo transcurrido al encolar en la mitad - " + tiempoTranscurrido + " milisegundos");
            contador += tiempoTranscurrido;
        }

        System.out.println("Tiempo total transcurrido al encolar en la mitad - " + contador + " milisegundos");

    }
}
