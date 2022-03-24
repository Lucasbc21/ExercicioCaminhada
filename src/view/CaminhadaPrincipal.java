package view;

import java.util.concurrent.Semaphore;

import controller.Caminhada;

public class CaminhadaPrincipal {
	public static void main(String [] args) {
		Semaphore semaforo = new Semaphore(4);
		
		for(int pessoas = 1;pessoas < 4; pessoas++) {
			Caminhada thread = new Caminhada(pessoas, semaforo);
			thread.start();
		}
	}

}
