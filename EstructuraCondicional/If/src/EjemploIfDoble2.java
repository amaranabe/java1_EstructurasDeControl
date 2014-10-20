 /*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;//importamos todas las clases de la carpeta util

public class EjemploIfDoble2 
{
    //Linea de arranque que permite que se ejecute el código de forma secuencial	
	public static void main( String[] args ) 
	{
        
        //Declara una variable (objeto) de la clase Scanner
        Scanner sc = new Scanner( System.in ); 
        //Llama al metodo print para que imprima por pantalla el texto "Nota: "
        System.out.print("Nota: ");
        //Declara una variable nota de tipo int y le asigna el valor que recoge por teclado el método nextInt de la clase Scanner .
        int nota = sc.nextInt(); 

        //Estructura condicional la cual dice que si cumple la condicion de que nota es mayor que 5, ejecutará el bloque de instrucciones.
        if (nota >= 5 )
        { 
            //Llama al método println e imprimirá por pantalla "Enhorabuena..." 
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
        //Si no la cumple, es decir nota es menor que 5, imprimirá en pantalla "Lo siento...."
        else
            System.out.println("Lo Siento, has suspendido");
    }
}
