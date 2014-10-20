 /*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;

public class EjemploWhile2 
{
	//Inicio de ejecución de un programa
    public static void main(String[] args) 
	{
        //Declara un objeto de tipo de la clase Scanner
		Scanner sc = new Scanner(System.in);
        //Declara dos variables de tipo entero n y contador. A contador le asigna valor 0
		int n, contador = 0;
        //Llama al método print para que imprima por pantalla "Introduzca..."
		System.out.print("Introduce un número: ");
        //Asigna el valor que recoge el método nextInt a la variable n
		n = sc.nextInt();
		//Evalúa la condición: si contador es menor que n, entra, ejecuta las dos instrucción y vuelve al paso 1
        while (contador < n)
		{
               //Imprime por pantalla "*"
			   System.out.println(" * ");
               //Le asigna a contador el resultado de contador + 1 (lo que significa el operador ++)
			   contador++;
			   //Imprimirá tantos * como valga n, y luego saldrá del while porque contador será mayor que n
        }
    }
}
