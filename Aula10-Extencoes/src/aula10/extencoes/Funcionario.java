package aula10.extencoes;
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    //Metodo proprietário
    public void mudarTrabalhando(){
        this.setTrabalhando(!(trabalhando));
    }
    
    // Metodo construtor
    public Funcionario(String nome, int idade, String sexo, String setor){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setSetor(setor);
        this.setTrabalhando(false);
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean setTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario {"+" Nome " +this.getNome()+ ", Idade "+this.getIdade()+", Sexo " +this.getSexo() + ", setor= " + setor + ", trabalhando= " + trabalhando + '}';
    }
    
    
}
