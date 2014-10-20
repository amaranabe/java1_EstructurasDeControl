/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class EjemploFor3 
{
    public static void main(String[] args) 
	{
        //Declara 3 constantes de tipo entero
		final int VALOR_INICIAL = 10; // limite inf. tabla
        final int VALOR_FINAL = 100; // limite sup. tabla
        final int PASO = 10 ; // incremento
        ////Declara una variable de tipo entero y otra de tipo double
		int fahrenheit;
        double celsius;
		////Asigna el valor de la variabla VALOR_INICIAL a fahrenheit
        fahrenheit = VALOR_INICIAL;
		//Llama al método printf para que dé formato al string "Fahrenheit..."
        System.out.printf("Fahrenheit \t Celsius \n");
		/*
		1.-Inicializa fahrenheit, y toma el valor 10 (=VALOR_INICIAL). 
		2.-Evalúa la condicion si fahrenheit es menor o igual a 100 (=VALOR_FINAL)
		3.-Si se cumple, se ejecuta el bloque de instrucciones. Si la condición es falsa se saldrá del for.
		4.-Actualiza la variable y se incrementa en 10.
		5.-Después se evalúa de nuevo la condición. 
		*/
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) 
        {
             //Asigna a celsius el resultado de la operación aritmética siguiente
			 celsius = 5*(fahrenheit - 32)/9.0;
			 /* 
			 Imprime en pantalla con un determinado formato: en la posición 7 escribe el valor fahrenheit. 
			 Y en la posición 8 se escribirá con tres decimales (.3) el valor de celsius, y luego hará un salto de línea con /n.
			 */
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}

