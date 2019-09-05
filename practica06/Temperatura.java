public class Temperatura{
	public static int CELSIUS =2;
	public static int FARENHEIT =1;

	double valor;
	int escala;
 

	public Temperatura (double valor, int escala){
		this.valor = valor;
		this.escala = escala;
	}
	
	
	// Mi programa java
	//Temperatura t= new Temperatura(30,Temperatura.CELCIUS)
	public double convertirACelsius(double valorF){
		return (valorF-32)/1.8;
	}
	
	public double convertirAFarenheit(double valorC){
		return (valorC*1.8)+32;
	}
	
	public double obtenerTemperaturaenCelsius(){
		if(escala == CELSIUS){
			return valor;
		}else{
			return convertirACelsius(valor);
		}
	}
	
	public double obtenerTemperaturaenFarenheit(){
		if(escala == FARENHEIT){
			return valor;
		}else{
			return convertirAFarenheit(valor);
		}
	}
	
	public boolean esIgual (Temperatura temp){
	//t2=new Temperatura(86,Temp FARENHEIT)
	//t1.es igual(t2)	
		return escala == temp.escala && valor == temp.valor;
			//if (escala == temp.escala && valor == temp.valor){
			//	return true;
			//}else{
			//	return false;
		//}
	}
	
	public boolean esMayor (Temperatura temp){
		//t2.esMayor(t1)
		//if(escala == CELSIUS && temp.escala == CELSIUS){
		//	return valor > temp.valor;
		//}
		return obtenerTemperaturaenCelsius() > temp.obtenerTemperaturaenCelsius(); 
	}
	
	public boolean esMenor (Temperatura temp){
		//t2.esMayor(t1)
		//if(escala == CELSIUS && temp.escala == CELSIUS){
		//	return valor > temp.valor;
		//}
		return obtenerTemperaturaenCelsius() < temp.obtenerTemperaturaenCelsius(); 	
	}
}

