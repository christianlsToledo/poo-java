package aula10.extencoes;
public class Aula10Extencoes {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Christian");
        
        Aluno  p2 = new Aluno("Juliana", 37, "F", 2, "POO em Java");
        Professor p3 = new Professor("Gustavo", 48, "M", "Programação", 2500.00f);
        Funcionario p4 = new Funcionario("Ivonete",55, "F", "Limpesa");
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println("####################################");
        
        p2.cancelarMatricula();
        p3.receberAumento(250.45f);
        p4.mudarTrabalhando();
        
        p1.setNome("Christina LS Toledo");
        p1.setIdade(37);
        p1.setSexo("M");
        p2.setMatr(1);
        p2.setCurso("Programação orientada a objetos");
        p3.setSexo("F");
        p4.setIdade(99);
        
        System.out.println("####################################");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
