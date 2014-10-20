 /*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*; //importa el paquete util con todas sus clases

//Crea la clase EjemploDoWhile1
public class EjemploDoWhile1 
{
    public static void main(String[] args) 
	{
        //Declaro una variable de tipo int
        int valor;
        //Declaro una variable del tipo de la clase Scannner
        Scanner in = new Scanner( System.in );
        /*
		Inicia la estructura de control, y ejecuta por primera vez las instrucciones del do.
		*/
        do 
        {
            //Imprime por pantalla "Escribe..."
			System.out.print("Escribe un entero < 100: ");
            //Asigna el valor que recoge el metodo nextInt a valor, 
			valor = in.nextInt();
        }
        /*
		Evalúa la condición de que valor sea mayor o igual que 100. Si se cumple esta condición, repite (itera) y pide de nuevo un entero.
        Si no es mayor que 100, sale del bucle.
		*/
        while (valor >= 100);
		//Al salir del while, imprime en pantalla el siguiente string
        System.out.println("Ha introducido: " + valor);
    }
}
