/**
* Practica 07
* @author Sanchez Espinoza Leonardo
* @version 10-09-2019
*/
public class Libro {
	String titulo;
	String autor;
	int año;

/**
* Constructor default
* @param titulo titulo del libro
* @param autor autor del libro
* @param año año de publicacion del libro
*/
public Libro () {
	String titulo = "   ";
	String autor = "   ";
	int año = 0;
}

/**
* Constructor con parametros 
* @param titulo titulo del libro
* @param autor autor del libro
* @param año año de publicacion del libro
*/
	
public Libro (String titulo, String autor, int año){
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
	}
	

	
/**
* Asignar el valor del titulo
* @param titulo titulo del libro
*/
public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
	
	
/**
* Asignar el valor del autor
* @param autor autor del libro
*/
public void setAutor(String Autor)
    {
        this.autor = autor;
    }
	
	
	/**
* Asignar el año del titulo
* @param año año del libro
*/
public void setAño(int titulo)
    {
        this.año = año;
    }
	
	

/**
* Devuelve el valor del titulo
* @return titulo titulo del libro
*/	
public String getTitulo()
    {
        return titulo;
    }
	
	
/**
* Devuelve el valor del autor
* @return autor autor del libro
*/	
public String getAutor()
    {
        return autor;
    }
	
	
/**
* Devuelve el valor del año
* @return año año del libro
*/	
public int getAño()
    {
        return año;
    }


}