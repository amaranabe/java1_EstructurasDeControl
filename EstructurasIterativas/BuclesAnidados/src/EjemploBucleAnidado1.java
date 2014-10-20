 /*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
import java.util.*;

public class EjemploBucleAnidado1 
{
    public static void main(String[] args) 
    {
        //Declaro un objeto del tipo de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Declaro dos variables de tipo int
        int filas, columnas;
        //Se ejecutan por primera vez las instrucciones del do.
		do
        {
           //Imprime por pantalla el string siguiente
		   System.out.print("Introduce número de filas: ");
		   //Asigna el valor que recoge nextInt a filas
           filas = sc.nextInt();
        }
        //Evalúa la condición. Si filas es menor que 1 sigue en el bucle. De lo contrario continúa con la siguiente instrucción
		while(filas<1);
        
        do
        {
           //Imprime por pantalla el string siguiente
		   System.out.print("Introduce número de columnas: ");
           //Asigna el valor que recoge nextInt a columnas
		   columnas = sc.nextInt();
        }
		//Evalúa la condición. Si columnas es menor que 1 sigue en el bucle. De lo contrario continúa con la siguiente instrucción
        while(columnas<1);
		
		/*
		1.-Inicializa la variable i, y toman el valor 1
		2.-Evalúa la condición: si i es menor o igual a filas
		3.-Si la condición se cumple se ejecutan las instrucciones del for. Si es falsa y no se cumple, finaliza la ejecución del bucle
		4.-En caso de que se cumpla la condición, se actualiza i e incrementa 1
		5.-Repite y vuelve a evaluar la condición
		*/
        for(int i = 1; i<=filas; i++)
        {    
			/*
			En este caso las instrucciones del for, es un nuevo for y un println. En este for también se inicializa la variable j y toma el valor 1.
			Se evalúa si j es menor a columnas y si es así imprime un asterisco. Despues incrementa j en 1, 
			evalúa y si cumple la condición imprime otro asterisco y vuelve a incrementar... así hasta que al evaluar la condición de falso.
			*/
            for(int j = 1; j<=columnas; j++)
            {   
                 System.out.print(" * ");
            }
			//Imprime en pantalla un salto de línea y vuelve al primer for
			System.out.println();
        }
       
    }
}
