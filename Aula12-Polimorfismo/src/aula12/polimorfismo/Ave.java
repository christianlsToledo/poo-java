package aula12.polimorfismo;

public class Ave extends Animal{
    private String corPena;
    
    public void construirNinho(){
        System.out.println("Construindo um ninho");
    }
    
    public void setCorPena(String cor){
        this.corPena = cor;
    }
    public String getCorPena(){
        return this.corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas e sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public String toString() {
        return "Ave{" + "corPena=" + corPena + ", peso=" + this.getPeso() + ", idade=" + this.getIdade() + ", membros=" + this.getMembros() + '}';
    }
}
