package aula12.polimorfismo;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return this.corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    @Override
    public String toString() {
        return "Mamifero{" + "corPelo=" + corPelo + ", peso=" + this.getPeso() + ", idade=" + this.getIdade() + ", membros=" + this.getMembros() + '}';
    }
}
