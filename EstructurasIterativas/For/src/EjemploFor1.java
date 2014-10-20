
/*
 * programa que muestra los números del 1 al 10
 */
//Crea la clase EjemploFor1
 public class EjemploFor1 
 {
    //Línea de arranque
	public static void main(String[] args) 
    {
        //Declara una variable de tipo entero
		int i;
		//Inicializa i, y toma el valor 1. 
		/*Evalúa la condicion si i es menor o igual a 10 y si se cumple, se ejecutan las instrucciones y después se incrementa i=i+1.
		  Después se evalúa de nuevo la condición. Si la condición es falsa se saldrá del for.*/
        for(i=1; i<=10;i++)
			//La instrucción que se ejecutará si la condicion se cumple, es imprimir por pantalla el siguiente texto concatenado
            System.out.println("7x"+i+"="+ 7*i + " ");
    }
}

