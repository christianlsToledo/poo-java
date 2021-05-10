package projetoyoutube;
public class Gafanhoto extends Pessoa{      // Esspecialização de tipo de cliente (Espectador)
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
                //  Impreção direta do toString
    @Override
    public String toString() {
        return "Gafanhoto{"+ "nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", experiencia=" + this.getExperiencia() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
                //  Importação do toString da Super Classe
    public String toString(String geral) {
    return "Gafanhoto{"+ super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
}