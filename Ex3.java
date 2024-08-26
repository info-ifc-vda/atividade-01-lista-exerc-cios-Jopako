//3. Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
//obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.
import java.security.spec.DSAGenParameterSpec;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex3
{
    public static void main (String[] args)
{
    int a1;
    int a2;
    int a3;
    float l1;
    float l2;
    float l3;

    String A = JOptionPane.showInputDialog("1º Ângulo:");
    a1 = Integer.parseInt(A);
    String B = JOptionPane.showInputDialog("2º Ângulo:");
    a2 = Integer.parseInt(B);
    String C = JOptionPane.showInputDialog("3º Ângulo:");
    a3 = Integer.parseInt(C);

    String D = JOptionPane.showInputDialog("1º Lado:");
    l1 = Float.parseFloat(D);
    String E = JOptionPane.showInputDialog("2º Lado:");
    l2 = Float.parseFloat(E);
    String F = JOptionPane.showInputDialog("3º Lado:");
    l3 = Float.parseFloat(F);

    if((a1 == 90) || (a2 == 90) || (a3==90))
    {
    
        
        JOptionPane.showMessageDialog(null, ("É um Retângulo!"));

    }
    else if ((a1 > 90) || (a2 > 90) || (a3 > 90))
    {
        JOptionPane.showMessageDialog(null, ("É um Obtusângulo!"));

    }
    else if ((a1 < 90) || (a2 < 90) || (a3 < 90))
    {
        JOptionPane.showMessageDialog(null, ("É um Acutângulo!"));

    }
    
    if ((a1 == a2) && (a1 == a3))
    {
        JOptionPane.showMessageDialog(null, ("É um Triângulo Equilátero!"));

    }
    else if((l1 == l2) && (l1 == l3))
    {
        JOptionPane.showMessageDialog(null, ("É um Triângulo Equilátero!"));

    }
    else if((l1 != l2) && (l1 != l3)) 
    {
        JOptionPane.showMessageDialog(null, ("É um Triângulo Escaleno!"));

    }
    if ((a1 == a2) || (a1 == a3) || (a2 == a3))
    {
        JOptionPane.showMessageDialog(null, ("É um Triângulo Isósceles!"));

    }
    else if  ((l1 == l2) || (l1 == l3) || (l2 == l3))
    {
        JOptionPane.showMessageDialog(null, ("É um Triângulo Isósceles!"));

    }
    


    
}
}
