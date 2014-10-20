 /* Programa que lea dos números por teclado y los muestre por pantalla.
 */
import java.util.*; //Decirle a mi programa que busque en el paquete java.util
public class MuestraDosNumerosInt 
{
//Inicia la ejecución del programa
public static void main(String[] args)
{
		
        //Declara variables de tipo int int
        int n1, n2;
        //Declara una variable (objeto) llamado sc de la clase Scanner
		Scanner sc = new Scanner(System.in);
		//Llama al metodo println para que imprima en pantalla el texto entrecomillado
        System.out.println("Introduce un número entero: ");
		//Instruccion de asignación: llamamos al metodo nextInt para que recoja el numero introducido y se lo asigne a la variable n1
        n1 = sc.nextInt();
		//Llama al metodo println para que imprima en pantalla el texto entrecomillado
        System.out.println("Introduce otro número entero: ");
		//Llama al metodo nextInt para que recoja el numero introducido y se lo asigna a la variable n2
        n2 = sc.nextInt(); 
		       
		//Llama al metodo println para que imprima en pantalla el texto concatenado "n1 y n2"
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
    }
}
