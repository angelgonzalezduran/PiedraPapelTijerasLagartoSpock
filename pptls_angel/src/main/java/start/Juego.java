package start;
import java.util.Scanner;

import lombok.Data;
import service.Partidas;
@Data
public class Juego {

public static void main(String[] args) {
// TODO Auto-generated method stub
	Partidas partida = new Partidas();
	
	Scanner sc = new Scanner(System.in);
	
	do {
	System.out.println("Bienvenido al Juego de PIEDRA, PAPEL, TIJERAS, LAGARTO, SPOK!!");
	System.out.println("\nElige el modo de juego:\nJugador vs Máquina(1), Jugador vs Jugador(2).\nModo de Juego: ");
	
	
	int eleccionmenu=sc.nextInt();
	switch (eleccionmenu) {
	case 1:
	partida.jugarVsMaquina();
	break;
	case 2:
	partida.jugarVsJugador();
	break;
	case 3:
	System.exit(0);
	break;
	default:
	System.out.println("La elección escogida es errónea, por favor vuelva a intentarlo.");
	break;
	}
	} while (true);
	
	
	}

}