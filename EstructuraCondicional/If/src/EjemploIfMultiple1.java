 /*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;
public class EjemploIfMultiple1
{
  public static void main(String[] args) 
  {

	//Declara un objeto llamado sc de la clase Scanner (para pedirle que recoja lo que entra por teclado, que en este caso es una nota
	Scanner sc = new Scanner(System.in);
	//Declara una variable int
	int hora;
	//Imprime en pantalla (llama al metodo println para que escriba en pantalla ese texto)
	System.out.println("Introduzca una hora (un valor entero): ");
	//Asigna el valor que recoge por teclado el método nextInt de la clase Scanner, a la variable hora
	hora = sc.nextInt();
	
	/*
	Estructura condicional a la que se le añade más de una cóndición. 
	Condicion 1, dice (usando el operador lógico &&) que si cumple que hora es mayor o igual que 0 y menor que 12, ejecutará la siguiente instrucción.
	Cómo sólo hay una instrucción, no está entre llaves.
  	*/
  	if (hora >= 0 && hora < 12)
		//Llama al metodo println e imprime por pantalla "Buenos Días"
		System.out.println("Buenos días");
		
		//Condicion 2, si la hora es >= que 12 y < 21, se imprimirá "Buenas tardes"
		else if (hora >= 12 && hora < 21)
			System.out.println("Buenas tardes");
		
		//Condicion 3, si la hora es >= que 21 y < 24, se imprimirá "Buenas noches"
		else if (hora >= 21 && hora < 24)
			System.out.println("Buenas noches");
	//En caso de que no se cumpla ninguna de las condiciones anteriores, imprimirá por pantalla "Hora no..."
	else 
		System.out.println("Hora no válida");
  }
}
