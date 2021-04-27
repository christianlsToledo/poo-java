package aula12.polimorfismo;
public class Canguru extends Mamifero{
    
    public void usarBolca(){
        System.out.println("Usando a bolça!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
