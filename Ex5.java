import java.util.Scanner;

public class Ex5 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int IdadeMenor18 = 0;
        float MediaIdadeTimeum = 0;
        float MediaAlturaTimeum = 0;
        float MediaIdadeTimedois = 0;
        float MediaAlturaTimedois = 0;
        float MediaIdadeTimetres = 0;
        float MediaAlturaTimetres = 0;
        float MediaIdadeTimequatro = 0;
        float MediaAlturaTimequatro = 0;
        float MediaIdadeTimecinco = 0;
        float MediaAlturaTimecinco = 0;

        int jogtimeum = 1;
        int jogtimedois = 1;
        int jogtimetres = 1;
        int jogtimequatro = 1;
        int jogtimecinco = 1;

        float totaljogadores = jogtimeum + jogtimedois + jogtimetres + jogtimequatro + jogtimecinco;

        float oitentakilosmais = 0;
        
        System.out.println("\nTime 1");
        for (int i = 0; i < jogtimeum; i++) 
        {
            System.out.print("Informe a idade do " + (i + 1) + "º jogador: ");
            int idade = scanner.nextInt();
            System.out.print("Informe a altura do " + (i + 1) + "º jogador: ");
            float altura = scanner.nextFloat();
            System.out.print("Informe o peso do " + (i + 1) + "º jogador: ");
            float peso = scanner.nextFloat();

            MediaAlturaTimeum += altura;
            MediaIdadeTimeum += idade;

            if (idade < 18) {
                IdadeMenor18++;
            }
            if (peso > 80) {
                oitentakilosmais++;
            }
        }

        
        System.out.println("\nTime 2");
        for (int i = 0; i < jogtimedois; i++) 
        {
            System.out.print("Informe a idade do " + (i + 1) + "º jogador: ");
            int idade = scanner.nextInt();
            System.out.print("Informe a altura do " + (i + 1) + "º jogador: ");
            float altura = scanner.nextFloat();
            System.out.print("Informe o peso do " + (i + 1) + "º jogador: ");
            float peso = scanner.nextFloat();

            MediaAlturaTimedois += altura;
            MediaIdadeTimedois += idade;

            if (idade < 18) {
                IdadeMenor18++;
            }
            if (peso > 80) {
                oitentakilosmais++;
            }
        }

    
        System.out.println("\nTime 3");
        for (int i = 0; i < jogtimetres; i++) 
        {
            System.out.print("Informe a idade do " + (i + 1) + "º jogador: ");
            int idade = scanner.nextInt();
            System.out.print("Informe a altura do " + (i + 1) + "º jogador: ");
            float altura = scanner.nextFloat();
            System.out.print("Informe o peso do " + (i + 1) + "º jogador: ");
            float peso = scanner.nextFloat();

            MediaAlturaTimetres += altura;
            MediaIdadeTimetres += idade;

            if (idade < 18) {
                IdadeMenor18++;
            }
            if (peso > 80) {
                oitentakilosmais++;
            }
        }

        
        System.out.println("\nTime 4");
        for (int i = 0; i < jogtimequatro; i++) 
        {
            System.out.print("Informe a idade do " + (i + 1) + "º jogador: ");
            int idade = scanner.nextInt();
            System.out.print("Informe a altura do " + (i + 1) + "º jogador: ");
            float altura = scanner.nextFloat();
            System.out.print("Informe o peso do " + (i + 1) + "º jogador: ");
            float peso = scanner.nextFloat();

            MediaAlturaTimequatro += altura;
            MediaIdadeTimequatro += idade;

            if (idade < 18) {
                IdadeMenor18++;
            }
            if (peso > 80) {
                oitentakilosmais++;
            }
        }

        
        System.out.println("\nTime 5");
        for (int i = 0; i < jogtimecinco; i++) 
        {
            System.out.print("Informe a idade do " + (i + 1) + "º jogador: ");
            int idade = scanner.nextInt();
            System.out.print("Informe a altura do " + (i + 1) + "º jogador: ");
            float altura = scanner.nextFloat();
            System.out.print("Informe o peso do " + (i + 1) + "º jogador: ");
            float peso = scanner.nextFloat();

            MediaAlturaTimecinco += altura;
            MediaIdadeTimecinco += idade;

            if (idade < 18) 
            {
                IdadeMenor18++;
            }
            if (peso > 80) 
            {
                oitentakilosmais++;
            }
        }

        
        
        System.out.println("\n|Médias de Idade|");
        System.out.println("Time 1: " + (MediaIdadeTimeum / jogtimeum));
        System.out.println("Time 2: " + (MediaIdadeTimedois / jogtimedois));
        System.out.println("Time 3: " + (MediaIdadeTimetres / jogtimetres));
        System.out.println("Time 4: " + (MediaIdadeTimequatro / jogtimequatro));
        System.out.println("Time 5: " + (MediaIdadeTimecinco / jogtimecinco));

        System.out.println("\n|Médias de Altura|");
        System.out.println("Time 1: " + (MediaAlturaTimeum / jogtimeum));
        System.out.println("Time 2: " + (MediaAlturaTimedois / jogtimedois));
        System.out.println("Time 3: " + (MediaAlturaTimetres / jogtimetres));
        System.out.println("Time 4: " + (MediaAlturaTimequatro / jogtimequatro));
        System.out.println("Time 5: " + (MediaAlturaTimecinco / jogtimecinco));

        System.out.println("\n-Jogadores com a idade inferior a 18 anos: " + IdadeMenor18);
        System.out.println("-Porcentagem de jogadores com mais de 80Kg: " + ((oitentakilosmais / totaljogadores) * 100) + "%");

        scanner.close();
    }
}
