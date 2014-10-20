 /*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*; //importa el paquete util y todo lo que tenga
//Crea la clase EjemploWhile1
public class EjemploWhile1 
{
    //Línea de arranque, inicio de ejecución de un programa
	public static void main(String[] args) 
	{
        //Declara 2 variables de tipo int, y a la variable suma le asigna valor 0
		int suma = 0, num;
		//Declara el objeto sc del tipo de la clase Scanner
		Scanner sc = new Scanner(System.in);
		//Llama al método print para que imprima por pantalla "Introduzca..."
        System.out.print("Introduzca un número: ");
        //Asigna el valor que recoge el método nextInt a la variable num
		num = sc.nextInt();
        //Estructura de control, que evalúa los posibles valores que tome num. Si num es mayor o igual que 0, entonces entra y ejecuta las instrucciones
		while (num >= 0)
		{
               //Asigna a suma el resultado de suma más el valor de num
			   suma = suma + num;
			   //Imprime por pantalla "introduzca un número"
               System.out.print("Introduzca un numero: ");
               //Y le asigna el valor que recoge el método nextInt a la variable num. Itera de nuevo al principio de la instrucción
			   num = sc.nextInt();
        }
		//Cuando num sea menor que 0, cuando introduzcamos un numero negativo, imprimirá por pantalla "La suma es 0"
        System.out.println("La suma es: " + suma );
    }
}
