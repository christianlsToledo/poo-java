package aula11.heranca;
public class Bolsista extends Aluno{
    private float bolsa;
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" Tem uma blosa de "+this.getBolsa()+"%");
    }
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada com sucesso!");
    }
    
    public Bolsista(float bolsa, String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" + " bolsa= " + bolsa + ", Nome: "+this.getNome()+" Idade: "+this.getIdade()+", Sexo: "+this.getSexo()+", Matricula: "+this.getMatricula()+", Curso: "+this.getCurso()+'}';
    }
    
    
}
