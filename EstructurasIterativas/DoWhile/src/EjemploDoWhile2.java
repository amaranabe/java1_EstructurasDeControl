/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;

public class EjemploDoWhile2 
{
    public static void main(String[] args) 
    {
        //Declaro una variable n de tipo entero
		int n;
		//Declara un objeto llamado sc de la clase Scanner
        Scanner sc = new Scanner( System.in );
		//Se ejecutan por primera vez las instrucciones del do.
        do 
        {
            //Imprime por pantalla "Escribe un número entre 1 y 10"
			System.out.print("Escribe un numero entre 1 y 10: ");
            //Asigna el valor que recoge el metodo nextInt a n, 
			n = sc.nextInt();
        }
		/*
		Evalúa la condición de que n sea menor que 1 o que sea mayor que 10. Si se cumple esta condición, itera y pide de nuevo un número.
        Si se cumple lo contrario, que n está entre 1 y 10 inclusive, sale del bucle.
		*/
        while (n<1 || n >10);
		//Al salir del while, imprime en pantalla el siguiente string
        System.out.println("Ha introducido: " + n);
    }
}
