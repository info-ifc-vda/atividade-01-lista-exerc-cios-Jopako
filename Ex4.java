import java.util.Scanner;
import javax.swing.JOptionPane;
// //4. Faça um programa que receba
// //• O código do produto comprado;
// //• A quantidade comprada do produto
// //Calcule e mostre:
// • O preço unitário do produto comprado, seguindo a Tabela I;
// • O preço total da nota;
// • O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
// • O preço final da nota depois do desconto.
//Tabela I
//Código Preço
//1 a 10 R$ 10,00
//11 a 20 R$ 15,00
//21 a 30 R$ 20,00
//31 a 40 R$ 40,00

//Tabela II
//Preço Total da Nota % de Desconto
//Até R$ 250,00 5%
//Entre R250, 00eR 500,00 10%
//Acima de R$ 500,00 15%

public class Ex4
{
    public static void main (String[] args)
    {
        int codigo;
        int quantidade;
        float precototal=0;
        float desconto5;
        float desconto10;
        float desconto15;
        float totalfinal=0;
          
        String a = JOptionPane.showInputDialog("Código do produto:");
        codigo = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog("Quantidade comprada:");
        quantidade = Integer.parseInt(b);
         
         

        if (codigo <= 10)
        {
            precototal = quantidade * 10f;
        
            if (precototal < 250)
            {
                desconto5 = precototal * 0.95f;
                totalfinal = desconto5;
            }
            else if (precototal < 500)
            {
                desconto10 = precototal * 0.90f;
                totalfinal = desconto10;
            }

            else 
            {
                desconto15 = precototal * 0.85f;
                totalfinal = desconto15;
            }
           
            JOptionPane.showMessageDialog(null, ("Preço unitário do produto comprado: R$10"));
            JOptionPane.showMessageDialog(null, ("Preço Total da Nota: R$"+precototal));
            JOptionPane.showMessageDialog(null, ("Valor do desconto: R$" +(precototal - totalfinal)));
            JOptionPane.showMessageDialog(null, ("Preço Total da Nota com Desconto: R$" +(totalfinal)));


        }
        
        else if (codigo <= 20)
        {
            precototal = quantidade * 15f;
        
            if (precototal < 250)
            {
                desconto5 = precototal * 0.95f;
                totalfinal = desconto5;
            }
            else if (precototal < 500)
            {
                desconto10 = precototal * 0.90f;
                totalfinal = desconto10;
            }

            else 
            {
                desconto15 = precototal * 0.85f;
                totalfinal = desconto15;
            }
           
            JOptionPane.showMessageDialog(null, ("Preço unitário do produto comprado: R$15"));
            JOptionPane.showMessageDialog(null, ("Preço Total da Nota: R$"+precototal));
            JOptionPane.showMessageDialog(null, ("Valor do desconto: R$" +(precototal - totalfinal)));
            JOptionPane.showMessageDialog(null, ("Preço Total da Nota com Desconto: R$" +(totalfinal)));
        }
        
        else if (codigo <= 30)
        {
            precototal = quantidade * 20f;
        
            if (precototal < 250)
            {
                desconto5 = precototal * 0.95f;
                totalfinal = desconto5;
            }
            else if (precototal < 500)
            {
                desconto10 = precototal * 0.90f;
                totalfinal = desconto10;
            }

            else 
            {
                desconto15 = precototal * 0.85f;
                totalfinal = desconto15;
            }
           
            JOptionPane.showMessageDialog(null, ("Preço unitário do produto comprado: R$20"));
            JOptionPane.showMessageDialog(null, ("Preço Total da Nota: R$"+precototal));
            JOptionPane.showMessageDialog(null, ("Valor do desconto: R$" +(precototal - totalfinal)));
            JOptionPane.showMessageDialog(null, ("Preço Total da Nota com Desconto: R$" +(totalfinal)));
        }
        
        else if (codigo <= 40)
        {
            precototal = quantidade * 40f;
        
            if (precototal < 250)
            {
                desconto5 = precototal * 0.95f;
                totalfinal = desconto5;
            }
            else if (precototal < 500)
            {
                desconto10 = precototal * 0.90f;
                totalfinal = desconto10;
            }

            else 
            {
                desconto15 = precototal * 0.85f;
                totalfinal = desconto15;
            }
           
            JOptionPane.showMessageDialog(null, ("Preço unitário do produto comprado: R$40"));
            JOptionPane.showMessageDialog(null, ("Preço Total da Nota: R$"+precototal));
            JOptionPane.showMessageDialog(null, ("Valor do desconto: R$" +(precototal - totalfinal)));
            JOptionPane.showMessageDialog(null, ("Preço Total da Nota com Desconto: R$" +(totalfinal)));
        }


    }
} 