package ConversorPacetech;

import java.util.Scanner;

public class Main {
       
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
          int opcao;
            float tempIn = 0.0f;
              float tempOut = 0.0f;
                float cotacao = 0.0f;
                  float valoIn = 0.0f;
                    float valoOut = 0.0f;
                      char desCont = 'S';

                      System.out.println("Bem vindo a melhor calculadora do mundo!");

                        while (desCont == 'S' || desCont == 's') {
                   System.out.println("==========OPCAO============");
               System.out.println("1 - Conversão de C para F");
            System.out.println("2 - Conversão de F para C");
         System.out.println("3 - Conversão de R para D");
       System.out.println("4 - Conversão de D para R");
     System.out.println("5 - Sair                  ");
   System.out.println("===========FIM=============");  
opcao = leitor.nextInt();

  switch (opcao) {
    case 1: 
       System.out.println("Informe o valor em °C:");
         tempIn = leitor.nextFloat();
           tempOut = ((tempIn * 1.8f) + 32);
              System.out.println("O valor tranformado é de " + tempOut + "°F");
                break;

                   case 2: 
                      System.out.println("Informe o valor em °F:");
                        tempIn = leitor.nextFloat();
                          tempOut = ((tempIn - 32) / 1.8f);
                            System.out.println("O valor tranformado é de " + tempOut + "°C");
                              break;
                               
                            case 3: 
                        System.out.println("Informe qual é o valor do dólar do dia:");
                    cotacao = leitor.nextFloat();
                System.out.println("Informe o valor em R:");
            valoIn = leitor.nextFloat();
        valoOut = valoIn / cotacao;
    System.out.println("O valor tranformado é de US$" + valoOut);
break;

    case 4:
        System.out.println("Informe qual é o valor do dólar do dia:");
            cotacao = leitor.nextFloat();
                System.out.println("Informe o valor em D:");
                    valoIn = leitor.nextFloat();
                       valoOut = cotacao * valoIn;
                          System.out.println("O valor tranformado é de R$" + valoOut);
                             break;

                             case 5:                 
                          System.out.println("Obrigado por usar nosso conversor!");
                        System.out.println("O senhor e meu pastor e nada me faltara- Sal-cap,23"); 
                       break;

                    default:
                 System.out.println("Opção inválida, tente novamente.");
              }
          System.out.println("Deseja realizar uma nova conversão? S - Sim / N - Não");
     desCont = leitor.next().charAt(0);
    }
  }
}