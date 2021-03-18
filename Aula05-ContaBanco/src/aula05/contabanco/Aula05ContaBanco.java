
package aula05.contabanco;

public class Aula05ContaBanco {
    public static void main(String[] args) {
     
        //Conta c1 = new Conta(1);
        //c1.infConta();
        
        Conta c2 = new Conta(2, "Christian");
//        System.out.println("Teste de Abertura de conta")
//        c2.infConta();
     
        System.out.println("Teste de metodos ...");
        System.out.println("");
        c2.abrirConta("cc");
        c2.depositar(50f);
        c2.sacar(50);
        c2.pgMensalidade();
        c2.infConta();
       
        //c2.setStatus(false);
        c2.pgMensalidade();
        c2.infConta();
        c2.sacar(26f);
        c2.fechaConta();
        
    }
    
}
