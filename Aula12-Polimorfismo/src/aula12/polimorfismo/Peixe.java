package aula12.polimorfismo;

public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolhas(){
        System.out.println("Soltou uma bolha!");
    }
    
    public void setCorEscamaPeixe(String cor){
        this.corEscama = cor;
    }
    public String getCorEscamaPeixe(){
        return this.corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som!");
    }

    @Override
    public void setMembros(int zero){
        if(zero!=0){
            System.out.println("Peixes não possuem membros!");
        }
      zero=0; //Peixes não pussuem Membros
        membros = zero;
    }
    
    @Override
    public String toString() {
        return "Peixe{" + "corEscama=" + corEscama + ", peso=" + this.getPeso() + ", idade=" + this.getIdade() + ", membros=" + this.getMembros() + '}';
    }
}
