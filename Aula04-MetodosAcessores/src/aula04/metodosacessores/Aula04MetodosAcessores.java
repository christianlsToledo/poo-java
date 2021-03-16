package aula04.metodosacessores;
public class Aula04MetodosAcessores {
    public static void main(String[] args) {
     String m = "KKKKK";    //Parametros passados ao metodo construtor da classe
     float  p = 0.5f;
     
     Caneta c1 = new Caneta(m,p);   //Instanciando novo objeto
      c1.destampar();
      c1.rabiscar();      
      c1.status();
      
      Caneta c2 = new Caneta(m,p);
      c2.setModelo("Bic Cristal");
      c2.setPonta(1.2f);
      c2.rabiscar();
      c2.status();
    }
    
}
