package Projeto07;

public class Emprego {

public static void main(String[] args) {
    
Funcionario Rodrigo = new Funcionario("Rodrigo de Oliveira ", "Silva", 2250);

 System.out.println("===================TABELA SEM REAJUSTE================");
     System.out.println("Salario anual de " + Rodrigo.getPrimeiroNome() + 
         ": R$" + String.format("%.2f",Rodrigo.getSalarioAnual()));
           
              Funcionario Isaac = new Funcionario("Isaac ", "Silva", 1750);
                  System.out.println("Salario anual de " + Isaac.getPrimeiroNome() + 
                     ": R$" + String.format("%.2f",Isaac.getSalarioAnual()));
                         System.out.println("======================================================");
                              System.out.println("(((((((((((OBRIGADO POR USAR NOSSO SISTEMA)))))))))))");
                                  System.out.println("======================================================");
                                       System.out.println();
        
                                       Rodrigo.darAumento();
                                  Isaac.darAumento();
        
                              System.out.println();
                         System.out.println("======================TABELA COM REAJUSTE===================");
                     System.out.println("Salario anual de " + Rodrigo.getPrimeiroNome() +
                  "com aumento: R$" + String.format("%.2f",Rodrigo.getSalarioAnual()));
               System.out.println("Salario anual de " + Isaac.getPrimeiroNome() +
           "com aumento: R$" + String.format("%.2f",Isaac.getSalarioAnual())); 
       System.out.println("============================================================");     
    System.out.println("(((((((((((OBRIGADO POR USAR NOSSO SISTEMA)))))))))))");
 System.out.println("============================================================"); 
  
    }    
}

    
    

