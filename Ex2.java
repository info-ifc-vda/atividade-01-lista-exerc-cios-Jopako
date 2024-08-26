//2. Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
//que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
//residência, calcule e mostre:
//• o valor de cada quilowatt;
//• o valor a ser pago por essa residência;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        float salMin=0;
        int quilowatts=0;

        String a = JOptionPane.showInputDialog("Salário Mínimo:");
        salMin = Float.parseFloat(a);

        

        String b = JOptionPane.showInputDialog("Quilowatts consumidos:");
        quilowatts = Integer.parseInt(b);

        float valorKW =  (salMin * 0.01f);
        float valor = valorKW * quilowatts;

        

        String mensagem = String.format("Valor de cada quilowatt: R$ %.2f \n Valor a ser pago: R$ %.2f", valorKW, valor);

        JOptionPane.showMessageDialog(null, mensagem);
        





    } 
}