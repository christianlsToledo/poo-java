package projetolivro;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    // Metodo teste
    public void status(){
        System.out.println("Nome" + this.getNome());
        System.out.println("Idade" + this.getIdade());
        System.out.println("Sexo" + this.getSexo());
    }
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    public Pessoa(String n,int i, String s){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
