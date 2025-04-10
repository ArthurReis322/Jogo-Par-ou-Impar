import java.util.Scanner;
import java.util.Random;

public class parimpar{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean repetir = false;
        int opcaoU;
        int escolhaU;
        int resultado;
        int jogarNovamente;

        System.out.println("|--------------------------|\n        PAR OU IMPAR        \n|--------------------------|");
        while (!repetir) {
     
        int escolhaPC = random.nextInt(10) + 1;

        System.out.println("Escolha [1-Par / 2-Impar]");
        opcaoU = scanner.nextInt();
        
        
        if(opcaoU == 1){
            System.out.println("Você escolheu par!");
        }

        else if(opcaoU == 2){
            System.out.println("Você escolheu impar!");
        }

        else{
            System.out.println("Escolha uma opção valida!");

            System.out.println("Escolha [1-Par / 2-Impar]");
            opcaoU = scanner.nextInt();
             
        }

        System.out.print("Escolha um número: ");
        escolhaU = scanner.nextInt();
        
        
        System.out.println("O computador escolheu " + escolhaPC);

        resultado = escolhaU + escolhaPC;

        if(resultado % 2 == 0) {
            System.out.println(resultado + " É par!");
            if (opcaoU == 1) {
                System.out.println("Você ganhou!");
            }

            else if(opcaoU == 2){
                System.out.println("Você perdeu!");

            }
        }
        else{
            System.out.println(resultado + " é impar");

            if (opcaoU == 1) {
                System.out.println("Você perdeu!");
            }

            else if(opcaoU == 2){
                System.out.println("Você ganhou!");
            }

        }
        
        System.out.println("Gostaria de jogar novamente? [1-Sim 2-Não]");
        jogarNovamente = scanner.nextInt();
        

        if (jogarNovamente == 2) {
            System.out.println("Obrigado por Jogar!");
            repetir = true;
        }


        //testando branch
        }
        scanner.close();
    }
}