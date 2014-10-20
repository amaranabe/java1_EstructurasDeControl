 /*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */
public class EjemploBucleAnidado2 
{
    public static void main(String[] args) 
    {
        //Declaro una constante de tipo int
        final int XMAX = 10;
        //Declaro dos variables también de tipo inte x y n 
        int x, n;
        //Muestra la cabecera de la tabla
        //Llama al metodo printf, y escribe en pantalla con un determinado formato
        System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");
        
		/*
		1.-Inicializa la variable x, y toman el valor 1
		2.-Evalúa la condición: si x es menor o igual a 10
		3.-Si la condición se cumple se ejecutan las instrucciones del for (que en este caso es otro for y un prinln). 
		   Si es falsa y no se cumple, finaliza la ejecución del bucle
		4.-En caso de que se cumpla la condición, se actualiza x e incrementa 1
		5.-Repite y vuelve a evaluar la condición
		*/
        for (x = 1; x <= XMAX; x++)
        {   
			/*
			Asigna a n el valor inicial 1, mientras que n sea menor o igual a 4 llama al método printf (e imprime). 
			A continuación incrementa el valor de n y comprueba de nuevo la condición.
			*/
            for (n = 1; n <= 4; n++)
            {   
                //Imprime en pantalla la potencia n de x
                System.out.printf("%10.0f", Math.pow(x,n));
            }
			//Imprime en pantalla un salto de línea y vuelve al primer for
            System.out.println();
        }
    }
}
