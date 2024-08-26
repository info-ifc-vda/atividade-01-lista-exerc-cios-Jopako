/*import java.util.Scanner;
public class Ex8 
{
    
    public static void main(String[] args) 
    {
        double[] CEDULAS = {200,100, 50, 20, 10, 5, 2, 1,0.50,0.25,0.10};

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de compra: ");
        double valorCompra = scan.nextDouble();

        
        System.out.println("Informe o valor recebido: ");
        double valorRecebido = scan.nextDouble();

        if (valorRecebido < valorCompra) 
        {
            System.out.println("Valor pago é menor que o valor da compra. Não é possível calcular o troco.");
            return;
        }

        
        double trocoNecessario = 0;


        trocoNecessario = valorRecebido - valorCompra;
        
        System.out.println("Troco: R$ "+trocoNecessario);
       
        for (double cedulas : CEDULAS)
        {
            if (trocoNecessario >= cedulas) 
            {
                int quantidadeCedulas = (int) (trocoNecessario / cedulas);
                trocoNecessario %= cedulas;
                System.out.println(quantidadeCedulas + " x R$ " + String.format("%.2f", cedulas));
            }
        }
        
    }
    
  

    }*/
    import java.util.Scanner;
public class Ex82
{
    public static void main(String[] args) 
    {
      Scanner scanf = new Scanner(System.in); 

      System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanf.nextDouble();
        System.out.print("Digite o valor pago: R$");
        double valorPago = scanf.nextDouble();

        double troco = valorPago - valorCompra;
        System.out.print("Troco: R$"+ troco + "\n");

        int[] cedulas = {200,100,50,20,10,5,2};

        int contaCedulas = 0;

        for (int cedula : cedulas)
        {
            contaCedulas = (int)troco/cedula;

            if (contaCedulas > 0)
            {
                System.out.println("O troco tem " + contaCedulas + " nota(s) de R$"+ cedula+".");

                troco = troco%cedula;
            }
        }
        
        /*contaCedulas = (int)troco/200;
        System.out.println("\nO troco tem " + contaCedulas + " notas de R$200.");
        troco = troco % 200;

        contaCedulas = (int)troco/100;
        System.out.println("\nO troco tem " + contaCedulas + " notas de R$100.");
        troco = troco % 100;
        
        contaCedulas = (int)troco/50;
        System.out.println("\nO troco tem " + contaCedulas + " notas de R$50.");
        troco = troco % 50;

        contaCedulas = (int)troco/20;
        System.out.println("\nO troco tem " + contaCedulas + " notas de R$20.");
        troco = troco % 20;
        
        contaCedulas = (int)troco/10;
        System.out.println("\nO troco tem " + contaCedulas + " notas de R$10.");
        troco = troco % 10;

        contaCedulas = (int)troco/5;
        System.out.println("\nO troco tem " + contaCedulas + " notas de R$5.");
        troco = troco % 5; */


    }
}



        
    

    

