package service;
import java.util.Random;
import java.util.Scanner;

import lombok.Data;
import model.Jugador;

@Data
public class Partidas {

	
private static final int maxRondas = 3;
    private int roundCount;

Jugador jugador1 = new Jugador();
private int puntuacionMaquina=0;
private int puntuacionJugador=0;
private int puntuacionJugador1=0;
private int puntuacionJugador2=0;

    public void jugarVsMaquina() {

    System.out.println("Introduce tu nombre: ");
    Scanner scanner = new Scanner(System.in);
    String nombre= scanner.nextLine();
    jugador1.setNombre(nombre);
   
        roundCount = 0;
     

        while (roundCount < maxRondas) {
       
            // Mostrar opciones de jugada con emoji
                System.out.println("Selecciona tu jugada:");
                System.out.println("1. Piedra \u270A");
                System.out.println("2. Papel \u270B");
                System.out.println("3. Tijeras \u270C");
                System.out.println("4. Lagarto \uD83E\uDD8E");
                System.out.println("5. Spok \uD83D\uDD96");
                System.out.println("Jugada: ");
             // Leer jugada del jugador
                int eleccionJugador = scanner.nextInt();
               

                if (eleccionJugador < 1 || eleccionJugador > 5) {
                    System.out.println("Selección inválida. Por favor, elige una opción válida.");
                    continue;
                }
               
                // Generar jugada aleatoria de la máquina
                int eleccionMaquina = new Random().nextInt(5) + 1;
               
                System.out.println("Tu jugada: " + movName(eleccionJugador));
                System.out.println("Jugada de la máquina: " + movName(eleccionMaquina));
               
                int resultado = jugadasVictoria(eleccionJugador, eleccionMaquina);

                if (resultado == 0) {
                    System.out.println("Empate");
                } else if (resultado == 1) {
                    System.out.println("¡Ganaste!");
                    puntuacionJugador=puntuacionJugador+1;
                    jugador1.setResultado(puntuacionJugador);
                } else {
                   System.out.println("Perdiste!!");
                    puntuacionMaquina=puntuacionMaquina+1;
               
                }

            roundCount++;
        }
 
System.out.println("Total: Jugador: "+ jugador1.getResultado()+" - Máquina:" + puntuacionMaquina);
        System.out.println("Deseas continuar jugando? (s/n)");
        String continuar = scanner.next();
        if (continuar.equalsIgnoreCase("s")) {
        jugarVsMaquina();
        } else {
            System.out.println("Gracias por jugar. ¡Hasta luego!");
        }
    }
   
   
   
    public void jugarVsJugador() {
   
     
       Jugador jugador1 = new Jugador();
       Jugador jugador2 = new Jugador();
      Scanner scanner = new Scanner(System.in);
     
      System.out.println("Introduce el nombre del jugador 1: ");
      String nombreJugador1= scanner.nextLine();
      jugador1.setNombre(nombreJugador1);
     
      System.out.println("Introduce el nombre del jugador 2: ");
      String nombreJugador2= scanner.nextLine();
  jugador2.setNombre(nombreJugador2);
 
  while (roundCount < maxRondas) {
 
   System.out.println("Selecciona tu jugada:");
        System.out.println("1. Piedra \u270A");
        System.out.println("2. Papel \u270B");
        System.out.println("3. Tijeras \u270C");
        System.out.println("4. Lagarto \uD83E\uDD8B");
        System.out.println("5. Spok \uD83D\uDD96");
 
        // Leer jugada del jugador
        System.out.println("Jugador 1:");
        int eleccionJugador1 = scanner.nextInt();
        System.out.println("Jugador 2:");
        int eleccionJugador2 = scanner.nextInt();

        if (eleccionJugador1 < 1 || eleccionJugador2 > 5) {
            System.out.println("Selección inválida. Por favor, elige una opción válida.");
            continue;
        }
       
        System.out.println("Jugada de Jugador1: " + movName(eleccionJugador1));
        System.out.println("Jugada de Jugador2: " + movName(eleccionJugador2));
        int resultado = jugadasVictoria(eleccionJugador1, eleccionJugador2);
       
       
        if (resultado == 0) {
            System.out.println("Empate");
        } else if (resultado == 1) {
            System.out.println("¡Ganaste!");
            puntuacionJugador1=puntuacionJugador1+1;
            jugador1.setResultado(puntuacionJugador1);
        } else {
           System.out.println("Perdiste!!");
           puntuacionJugador2=puntuacionJugador2+1;
           jugador2.setResultado(puntuacionJugador2);
        }

        roundCount++;
       
  }
 
  System.out.println("Total: "+jugador1.getNombre()+ ": "+ jugador1.getResultado()+" - " +jugador2.getNombre()+":"+ jugador2.getResultado());
       System.out.println("Deseas continuar jugando? (s/n)");
       String continuar = scanner.next();
       if (continuar.equalsIgnoreCase("s")) {
        jugarVsJugador();
       } else {
           System.out.println("Gracias por jugar. ¡Hasta luego!");
           System.exit(0);
       }
     
    }
   
    private String movName(int move) {
        switch (move) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijeras";
            case 4:
                return "Lagarto ";
            case 5:
                return "Spok";
            default:
                return "";
        }
    }
   
    private int jugadasVictoria(int eleccionJugador, int eleccionMaquina) {
        // Implementa la lógica para calcular el resultado del juego
        // 0 para empate, 1 para jugador ganador, -1 para máquina ganadora
        // Puedes basarte en las reglas del juego de Piedra, Papel o Tijeras
    if (eleccionJugador == eleccionMaquina) {
             return 0; // Empate
         } else if ((eleccionJugador == 1 && (eleccionMaquina == 3 || eleccionMaquina == 4))
                 || (eleccionJugador == 2 && (eleccionMaquina == 1 || eleccionMaquina == 5))
                 || (eleccionJugador == 3 && (eleccionMaquina == 2 || eleccionMaquina == 4))
                 || (eleccionJugador == 4 && (eleccionMaquina == 2 || eleccionMaquina == 5))
                 || (eleccionJugador == 5 && (eleccionMaquina == 1 || eleccionMaquina == 3))) {
             return 1; // Jugador ganador
         } else {
             return -1; // Máquina ganadora
         }
     }
    
    
    
}