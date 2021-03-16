package aula04.metodosacessores;

public class Caneta{
    private String modelo;
    private float ponta;
    private boolean tampada;
    
    public Caneta(String m, float p){
        modelo = m;
        ponta = p;
        tampada = true;
    }
    public void status(){
        System.out.println("Info Caneta");
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ponta: "+getPonta());
        System.out.println("Tampada: "+getTampada());
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String m){
        modelo = m;
    }
    public float getPonta(){
        return ponta;
    }
    public void setPonta(float p){
        ponta = p;
    }
    public boolean getTampada(){
        return tampada;
    }
    public void tampar(){
        tampada = true;
    }
    public void destampar(){
        tampada = false;
    }
    public void rabiscar(){
        if(this.getTampada()){
            System.out.println("Impossivel! Estou tampada.");
        }else{
            System.out.println("Estou rabiscando ...");
        }
    }
}
