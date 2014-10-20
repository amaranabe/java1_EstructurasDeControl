 /*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
import java.util.*;
public class EjemploIfSimple
{
    //Linea de arranque que permite que se ejecute el siguiente código
	public static void main( String[] args )
	{

        //Declara un objeto llamado sc de la clase Scanner
        Scanner sc = new Scanner( System.in );
        //Imprime por pantalla el texto "Nota: "
        System.out.print("Nota: ");
        //Declara una variable de tipo int (nota) y le asigna el valor que devuelve el método nextInt de la clase Scanner.
        int nota = sc.nextInt();
    
    //If, estructura condicional, mediante la cual se indica que si cumple la condicion de que nota es mayor que 5, ejecutará las instrucciones entre llaves       
	if (nota >= 5 )
	{
            //Si la condicion se cumple imprime por pantalla "Enhorabuena..." 
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
    }
    }
}
