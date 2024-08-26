/*6. Faça um programa que leia um número e calcule o fatorial desse número */
import java.util.Scanner;
public class Ex6
{
public static void main (String[] args)
{
    Scanner scanner = new Scanner(System.in);

    System.out.println("Calculando Fatorial!\n");
    System.out.println("Informe o número desejado:");       
    int numero = scanner.nextInt();


    int i=1;
    int resultado=1;

        for (i=1;i<=numero;i++)
        {
            resultado *= i;
        }


  System.out.printf("\nFatorial de " +(numero)+ " é: "+resultado);

}

}