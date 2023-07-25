/*Desarrolle un programa que realice la sumatoria de los números enteros múltiplos de 5, 
 *comprendidos entre dos números dados al azar. 
 *El programa deberá imprimir los números en cuestión.
 *Luego haga la suma de los múltiplos de 5 y verifique si el total es un numero perfecto.
 */
//Josue Leiva Mora

import java.util.Scanner; //se importa la libreria para usar la consola o Scanner

public class Parcial{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
	//declaracion de variables
	int numero1; //primer numero a introducir
	int numero2; //segundo numero a introducir
	int suma = 0; //suma de sus multiplos
	int evaluar;
	evaluar = suma%5;
	
	//El usuario introduce los valores y el sistema los guarda en las variables
	System.out.print("Digite primer numero: ");
	numero1 = sc.nextInt();
	System.out.print("Digite segundo numero ");
	numero2 = sc.nextInt();
	System.out.print("Los multiplos de 5 entre: "+ numero1 + " y "+ numero2 + " son:" );
	System.out.println(" ");
	//Se crea un ciclo que va a contar, comparar y detectar los multiplos de cinco
	for (int i=1; i <= numero2; i++) 
		{
	if (i %	5 == 0)
		{
		System.out.print(i + "  Es un multiplo de entre: "+ numero1 + " y " + numero2);
		System.out.println(" ");
		suma+=i;
		}
		}
	System.out.print("La sumatoria de los numero es igual a: "+ suma);
	System.out.println(" ");
	//Sintaxis del numero perfecto: Si la sumatoria de sus multiplos es igual al numero final entonces es perfecto
	//Los numeros perfectos son una lista de numeros cuya suma de sus multiplos y NO solo los de cinco sumados da como resultado el mismo numero.
	if (suma == numero2) 
	{                          
        System.out.println("Es perfecto");
    } else {
        System.out.println("No es perfecto");

    }
	
	
}
}