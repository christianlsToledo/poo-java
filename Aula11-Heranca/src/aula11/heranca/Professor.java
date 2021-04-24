package aula11.heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + " nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() +'}';
    }
    
    
}
