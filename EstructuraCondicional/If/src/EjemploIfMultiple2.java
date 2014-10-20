/*
 * Programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;

public class EjemploIfMultiple2 
{
  public static void main(String[] args) 
  {

	//Declara un objeto llamado sc de la clase Scanner
	Scanner sc = new Scanner(System.in);
	//Declara una variable de tipo double
	double nota;
	//Llama al metodo println para que escriba en pantalla ese texto
	System.out.println("Introduzca una nota entre 0 y 10: ");
	//Asigna el valor que recoge por teclado el método nextInt de la clase Scanner, a la variable nota
	nota = sc.nextDouble();
	//Llama al metodo println para que escriba en pantalla ese texto
	System.out.println("La calificación del alumno es ");

	/*
	* Estructura condicional a la que se le añade más de una cóndición. 
	Condicion 1, dice (usando el operador lógico ||) que si cumple la condicion de que nota es menor que O mayor que 10, ejecutará el bloque de instrucciones siguiente.
	*/
	if(nota < 0 || nota > 10)
		//Si cumple la condición 1, imprime por pantalla "Nota no válida"
		System.out.println("Nota no válida");
		//Condicion 2, si la nota igual 10, ejecutará la instrucción para que imprima "Matricula de Honor"
		else if(nota==10)
			System.out.println("Matrícula de Honor");
		//Condicion 3, si la nota igual 10, ejecutará la instrucción para que imprima "Matricula de Honor"
		else if (nota >= 9)
			System.out.println("Sobresaliente");
		else if (nota >= 7)
			System.out.println("Notable");
		else if (nota >= 6)
			System.out.println("Bien");
		else if (nota >= 5)
			System.out.println("Suficiente");
	//Si la nota es menor o igual que 4 se ejecutará la siguiente instrucción
	else
		System.out.println("Suspenso");
    }
}

