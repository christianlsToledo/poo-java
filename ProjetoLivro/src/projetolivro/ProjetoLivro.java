package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Christian",37,"M");
        p[1] = new Pessoa("Juliana",38,"F");
        
        l[0] = new Livro("Aprendendo Java","José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado","Maria Candido",800,p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        l[0].fechar();
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
        
    }
    
}
