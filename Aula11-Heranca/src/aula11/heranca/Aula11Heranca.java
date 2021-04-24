package aula11.heranca;

public class Aula11Heranca {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); <-- Classe Abstrata não instanciavel
        Visitante v1 = new Visitante();
        v1.setNome("Jetulio");
        v1.setIdade(66);
        v1.setSexo("M");
        
        Aluno a1 = new Aluno        ("Christian", 37, "M",003, "POO Java");
        Bolsista b1 = new Bolsista  (15.5f,"Juvenal", 33, "M", 121212, "Contabilidade");
        Tecnico t1 = new Tecnico    ("Bruno G", 39, "M", 004, "POO em PHP");
        Professor p1 = new Professor("Guanabara", 54, "F", "Programação POO", 550.00f);
        
        //p1.fazerAniversario();        // Função OK
        //b1.pagarMensalidade();        // Pagar mensalidade OK
        //b1.renovarBolsa();            //Renovar bolsa OK
        //t1.praticar(3);
        //t1.praticar(4);               //Praticar OK
        //p1.receberAumento(1000.45f);  //Receber aumento OK
        
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
        System.out.println(p1.toString());
    }
    
}
