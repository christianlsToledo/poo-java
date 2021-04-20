package aula10.extencoes;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    //Metode proprietário
    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    //Metodo Construtor
    public Professor(String nome, int idade, String sexo, String especialidade, float salario){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
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
        return "Professor{"+" Nome " +this.getNome()+ ", Idade "+this.getIdade()+", Sexo " +this.getSexo() + ",  especialidade= " + especialidade + ", salario= " + salario + '}';
    }
    
    
}
