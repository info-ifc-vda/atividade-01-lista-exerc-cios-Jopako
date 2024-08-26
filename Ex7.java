import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int n2 = scanner.nextInt();

        int inicio, fim;
        if (n1 < n2) {
            inicio = n1;
            fim = n2;
        } else {
            inicio = n2;
            fim = n1;
        }

        int tamanho = fim - inicio + 1;
        double[] fatoriall = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            fatoriall[i] = inicio + i;
        }

        System.out.println("\nFatoriais dos números no intervalo:");
        for (int i = 0; i < fatoriall.length; i++) {
            int numero = (int) fatoriall[i];
            long fatorial = calcularFatorial(numero);
            System.out.println("Fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O fatorial não está definido para números negativos.");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
