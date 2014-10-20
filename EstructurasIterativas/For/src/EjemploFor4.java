/*
 * Programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class EjemploFor4 
{
    public static void main(String[] args) 
    {
        //Declara las variables a y b de tipo entero
		int a, b;
		/*
		1.-Inicializa la variable a y b, y toman el valor 1
		2.-Evalúa la condición: si la suma de a y b es menor que 10
		3.-Si la condición se cumple se ejecutan las instrucciones del for. Si es falsa y no se cumple (a+b es >10), finaliza la ejecución del bucle
		4.-Se actualiza la variable, a incrementa 1 y b incrementa 2
		5.-Itera y vuelve a evaluar la condición
		*/
        for(a = 1, b = 1; a + b < 10; a++, b+=2)
        {
			//Al cumplirse la condición se imprimirá en pantalla el siguiente string concatenado
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}

