import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n = scanf.nextInt();

        if (priminho(n)) 
        {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }

        scanf.close();
    }

    public static boolean priminho(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }

        if (num == 2) 
        {
            return true;
        }

        if (num % 2 == 0) 
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
