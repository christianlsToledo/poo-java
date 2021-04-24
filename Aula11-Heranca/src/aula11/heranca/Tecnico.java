package aula11.heranca;

public class Tecnico extends Aluno{
    private int registroProficional;
    
    public void praticar(int horas){
        this.setRegistroProficional(this.getRegistroProficional()+horas);
    }

    public Tecnico( String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
        this.setRegistroProficional (0);
    }

    public int getRegistroProficional() {
        return registroProficional;
    }

    public void setRegistroProficional(int registroProficional) {
        this.registroProficional = registroProficional;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "registroProficional=" + registroProficional + " horas, nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + '}';
    }
}
