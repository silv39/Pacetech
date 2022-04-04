package Projeto07;
/**
 * @author CB RODRIGO SILVA
 */
class Funcionario {
    private String primeiroNome, sobrenome;
        private float salarioMensal;
    
             Funcionario(String primeiroNome, String sobrenome, float salarioMensal){
                this.setPrimeiroNome(primeiroNome);
             this.setSobrenome(sobrenome);
          this.setSalarioMensal(salarioMensal);
        }
     public void darAumento(){
  salarioMensal = salarioMensal * 1.1f;
}
  public float getSalarioAnual(){
     return salarioMensal * 12;
       }
         public String getPrimeiroNome() {
            return primeiroNome;
              }

                 public void setPrimeiroNome(String primeiroNome) {
                    this.primeiroNome = primeiroNome;
                 }
                public String getSobrenome() {
             return sobrenome;
           }
        public void setSobrenome(String sobrenome) {
     this.sobrenome = sobrenome;
   }
public float getSalarioMensal() {
   return salarioMensal;
     }
       public void setSalarioMensal(float salarioMensal) {
          if ( salarioMensal < 0 ){
             this.salarioMensal = 0.0f;
                 } else {
             this.salarioMensal = salarioMensal;    
         }
     }
}
    

