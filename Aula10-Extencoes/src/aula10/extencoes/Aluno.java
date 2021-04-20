package aula10.extencoes;
public class Aluno extends Pessoa{
    private int matr;
    private String curso;
    
    // Metodo proprietário
    public void cancelarMatricula(){
        System.out.println("Matricula de "+this.getNome()+" cancelada com sucesso!");
    }
    
    //Construtor
    public Aluno(String nome, int idade, String sexo, int matricula, String curso){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setMatr(matricula);
        this.setCurso(curso);
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Metodo teste de resposta
    @Override 
    public String toString() {
        return "Aluno{"+" Nome " +this.getNome()+ ", Idade "+this.getIdade()+", Sexo " +this.getSexo() + ", matricula= " + matr + ", curso= " + curso +'}';
    }
    
    
}
