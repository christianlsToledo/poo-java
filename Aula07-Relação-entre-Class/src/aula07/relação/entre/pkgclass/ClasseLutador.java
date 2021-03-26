package aula07.relação.entre.pkgclass;
public class ClasseLutador implements InterfaceLutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public ClasseLutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso()<=52.2){
            this.categoria = "Invalida!";
        }else if(this.getPeso()<=70.3){
            this.categoria = "Peso Pena";
        }else if(this.getPeso()<=83.9){
            this.categoria = "Peso Médio";
        }else if(this.getPeso()<=120.2){
            this.categoria = "Peso Pesado";
        }else{
            this.categoria = "Invalida!";
        }
    }
    private int getVitorias() {
        return vitorias;
    }
    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    private int getDerrotas() {
        return derrotas;
    }
    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    private int getEmpates() {
        return empates;
    }
    private void setEmpates(int empates) {
        this.empates = empates;
    }
    @Override
    public void apresentar() {  //                  Métodos Abstratos
        System.out.println("Informações do lutador");
        System.out.println("----------------------------------------------------");
        System.out.println("Nome:"+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+" anos");
        System.out.println("Altura: "+this.getAltura()+" metros");
        System.out.println("Peso: "+this.getPeso()+"Kg");
        System.out.println("Categpria: "+this.getCategoria());
        System.out.println("Vitórias = "+this.getVitorias());
        System.out.println("Derrotas = "+this.getDerrotas());
        System.out.println("Empates = "+this.getEmpates());
    }
    @Override
    public void status() {
        System.out.println("O lutador "+this.getNome()+" da categoria "+this.getCategoria()+", pesando "+this.getPeso()+" acumula neste campeonato "+this.getVitorias()+" vitórias, "+this.getEmpates()+" empates e "+this.getDerrotas()+" derrotas.");
    }
    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }
    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }
    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
}
