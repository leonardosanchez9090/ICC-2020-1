package paquete;

import processing.core.PApplet;

/**
 * Programa para dibujar un tablero de ajedrez.
 * 
 * @author Sanchez Espinoza Leonardo
 * @version 07/10/2019
 */

public class A extends PApplet {

	/**
	 * Invoca a PApplet.main
	 */
	public static void main(String[] args) {
		PApplet.main("paquete.A");
	}


	/**
	 * Método para determinar la resolución del terminal
	 */
	@Override
	public void settings() {
		size(displayWidth, displayHeight);
	}


	/**
	 * Método que define las propiedades del entorno
	 */
	@Override
	public void setup() {

	}


	/**
	 * Método draw que dibujara el tablero
	 */
	@Override
	public void draw() {
		for (int i = 0; i < 8; i++) {
			for (int b = 0; b < 8; b++) {
				if ((i + b) % 2 == 1) {
					fill(0xFF226644);
				} else {
					fill(0xFFFFFFFF);
				}
				rect(i * (displayHeight / 8), b * (displayHeight / 8), (displayHeight / 8), (displayHeight / 8));
			}
		}
	}
}