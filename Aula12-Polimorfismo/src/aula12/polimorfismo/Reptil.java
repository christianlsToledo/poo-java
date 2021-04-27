package aula12.polimorfismo;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    @Override
    public String toString() {
        return "Reptil{" + "corEscama=" + corEscama + ", peso=" + this.getPeso() + ", idade=" + this.getIdade() + ", membros=" + this.getMembros() + '}';
    }
}
