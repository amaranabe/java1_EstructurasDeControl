
/*
 * programa que muestra los números del 10 al 1
 */
//Crea la clase EjemploFor2
public class EjemploFor2 
{
    public static void main(String[] args) 
	{
        //Declara una variable i de tipo entero
		int i;
		//Inicializa i, y toma el valor 10. 
		/*Evalúa la condicion si i es mayor que 10. Si se cumple, se ejecuta la instruccion y después decrementa la variable i=i-1.
		  Después evalúa de nuevo la condición. Si la condición es falsa (i<=0) se saldrá del for.*/
        for(i=10; i>0;i--)
			//Imprimirá por pantalla de forma concatenada i con espacio
            System.out.println(i + " ");
    }
}

