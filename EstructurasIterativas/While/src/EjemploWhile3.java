 /*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
//Crea la clase EjemploWhile3
 public class EjemploWhile3 
{
    //Línea de arranque
	public static void main(String[] args) 
	{
        //Declara 3 constantes de tipo entero
		final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento
        //Declara una variable de tipo entero y otra de tipo real
		int fahrenheit;
        double celsius;
		//Asigna el valor de la variabla VALOR_INICIAL a fahrenheit
        fahrenheit = VALOR_INICIAL;
		//Llama al método printf para que dé formato al dato de salida que es el string "Fahrenheit..."
        System.out.printf("Fahrenheit \t Celsius \n");
        //Evalúa la condición si VALOR_FINAL es igual o mayor que fahrenheit. Si la cumple ejecuta el bloque de instrucciones. En caso contrario, sale.
		while (fahrenheit <= VALOR_FINAL )
		{
               //Asigna a celsius el resultado de la siguiente operación aritmética
			   celsius = 5*(fahrenheit - 32)/9.0;
			   /* Imprime en pantalla con un determinado formato: %7d indica que en la posición 7 se va a escribir el valor del entero (d) fahrenheit.
			   Y en la posición 8 se escribirá con tres decimales (.3)  el valor de tipo float (f) celsius, y luego hará un salto de línea.*/
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
			   //Asigna a fahrenheit el valor de fahrenheit más PASO (=10)
               fahrenheit += PASO;
			   //Cuando fahrenheit adquiera un valor mayor que 100, se saldrá del bucle.
        }
    }
}
