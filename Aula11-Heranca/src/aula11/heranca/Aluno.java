package aula11.heranca;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso!");
    }

    public Aluno(String nome, int idade, String sexo,int matricula, String curso) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCurso(curso);
        this.setSexo(sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + ", nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + '}';
    }
    
    
}
