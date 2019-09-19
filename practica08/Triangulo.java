package geometria;

/**
  @author Sanchez Espinoza Leonardo  
  @version 17/09/19
  @see     Triangulo
*/


/**
	*Representa un poligono de tres lados. Esta definido por
	*tres puntos en el plano cartesiano
	*/
public class Triangulo {
	private Punto a;
	private Punto b;
	private Punto c;
	
	public static final int EQUILATERO  = 0;  	//Triángulo con todos sus lados de la misma longitud.
	public static final int ESCALENO = 2;	 //Triángulo con todos sus lados de longitud distinta.
	public static final int ISOSCELES = 1; 	//Triángulo con exactamente dos lados de la misma longitud.
	
	
	/**
	*Metodo con parametros
	*@param a - primer punto
	*@param b - segundo punto
	*@param c - tercer punto
	*/
	public Triangulo() {  //Crea un triángulo con los tres puntos dados.
		a = new Punto(0,0); 	// Crea un punto con coordenadas (0, 0).
		b = new Punto(1,0); 	// Crea un punto con coordenadas (1, 0).
		c = new Punto(0.5,  Math.sin(Math.PI / 3)); 	// Crea un punto con coordenadas (0.5, sin(π / 3))
	}
	
	
/**
 * Crea un triángulo con los tres puntos dados. 
 * @param a punto a
 * @param b punto b
 * @param c punto c
 */
	public Triangulo (Punto a, Punto b, Punto c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
/**
 * Metodo con parametros 	
 * Determina si los vértices de este triángulo están alineados.
 * @param a punto a
 * @param b punto b
 * @param c punto c
 * @return 	true si los vértices están alineados
 */
	public boolean tieneVerticesAlineados(){ //Determina si los vértices de este triángulo están alineados.
		return a.estanAlineados(b, c); //true si los vértices están alineados
	} 
	
	
	public int tipo(){ //Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
		if (a.distancia(b) == b.distancia(c) && b.distancia(c) == a.distancia(c)){
			return EQUILATERO; //el tipo de este triángulo
		}else if(a.distancia(b) != b.distancia(c) && b.distancia(c) != a.distancia(c) && a.distancia(b) != a.distancia(c)){	
			return ESCALENO; //el tipo de este triángulo
		}else{
			return ISOSCELES; //el tipo de este triángulo
		}
	}
}