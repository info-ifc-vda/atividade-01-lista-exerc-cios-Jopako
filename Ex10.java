/*10. Faça um programa que receba dez números inteiros e mostre a quantidade de números//
primos dentre os número que foram digitados*/
import java.util.Scanner;
public class Ex10
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);    
        int vetor[] = new int[10];

        for (int i=0;i < 10;i++)
        {
        System.out.print("Informe o "+(i+1)+ "º número inteiro: ");
         vetor[i] = scanf.nextInt();
        }
        System.out.print("\nVetor:");

        System.out.print("\n{");
        for (int i = 0; i < vetor.length; i++) 
        {
            System.out.print(vetor[i] + ",");
        }
        System.out.println("}");

        System.out.println("\n");

        for(int i=0;i<vetor.length;i++)
        {
            if (priminho(vetor[i])) 
            {
                System.out.println("["+vetor[i] + "] é primo.");
            } else {
                System.out.println(vetor[i] + " não é primo.");
            }
        }
        scanf.close();

    }
    

        public static boolean priminho(int num)
        {
            if (num < 2)
            {
                return false;
            }
            if (num == 2)
            {
                return true;
            }
            if (num % 2 ==0)
            {
                return false;
            }
            if (num % 3 == 0 && num != 3)
            {
                return false;
            }
            if (num % 5 == 0 && num != 5)
            {
                return false;
            }
            if (num % 7 == 0 && num != 7)
            {
                return false;
            }
            return true;
        }
    }
    

