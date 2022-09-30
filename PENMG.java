import java.util.Scanner;

public class PENMG

{ // Abre clase Deitel_4_21

Scanner entrada = new Scanner(System.in);

private int numero;
private int contador = 1;
private int mayor;

public void Recibe()
{ 


System.out.printf("\nEste programa recibe 10 numeros e imprime cual de ellos es el mayor.\n");
System.out.printf("\nPor favor introduzca el numero %d: ", contador++);
mayor = entrada.nextInt();

while ( 10 >= contador)
{ 

System.out.printf("\nPor favor introduzca el numero %d: ", contador++);
numero = entrada.nextInt();

if ( numero > mayor)
mayor = numero;
} 

System.out.printf("\nEl numero mayor es: %d\n\n", Retorna());
} 

public int Retorna()
{ 
return mayor;
}
}
