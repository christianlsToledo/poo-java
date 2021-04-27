package aula12.polimorfismo;

abstract public class Animal {
    private float peso;
    private int idade;
    public int membros;
    
    abstract public void locomover();
    abstract public void alimentar();
    abstract public void emitirSom();

    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return this.membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
}
