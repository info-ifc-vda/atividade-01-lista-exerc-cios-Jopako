//1. Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. Calcule e mostre o salário a receber seguindo estas regras:
//• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
//hora trabalhada;
//• o imposto equivale a 30% do salário bruto;
//• o salário a receber equivale ao salário bruto menos o imposto.
import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {

        int horas;
        float valorHora=0;
        float imposto=0;
        float bruto =0;
        float salario=0;

        Scanner scanf = new Scanner (System.in);


        System.out.println("Horas trabalhadas:");
        horas = scanf.nextInt();

        System.out.println("Valor Hora:");
        valorHora = scanf.nextFloat();

        bruto = horas * valorHora;
        imposto = (bruto * 0.30f);
        salario = bruto - imposto;
        
        System.out.printf("Salário: %.2fR$ ",salario);

        
    }
} 