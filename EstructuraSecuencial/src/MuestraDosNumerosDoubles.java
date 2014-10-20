 /*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*; //importa el paquete util
public class MuestraDosNumerosDoubles 
{
	//Línea de arranque. Iniciamos la ejecución del programa
  public static void main(String[] args)
	{

		//Declara un objeto sc de la clase Scanner (para que luego podamos llamar a un método de la clase Scanner)
		Scanner sc = new Scanner(System.in);
		//Declara dos variables tipo double (numeros reales)
    double numero1, numero2;


		//Llama al metodo println para escribir en pantalla (salida estandar) la petición de un numero
    System.out.println("Introduce el primer número:");
    //Asigna el valor que devuelve el metodo nextDouble a la variable numero1
		numero1 = sc.nextDouble();
    //Llama al metodo println para escribir en pantalla (salida estandar)
		System.out.println("Introduce el segundo número:");
		//Asigna el valor que devuelve el metodo nextDouble a la variable numero 2
    numero2 = sc.nextDouble();
       
		    //Llamada al metodo println para escribir en pantalla los textos entrecomillados
        System.out.println("Números introducido: " + numero1 + "  " + numero2);
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);
    }
}
