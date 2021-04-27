package aula12.polimorfismo;
public class Cachorro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("Enterrou um osso!");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o Rabo!");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latido");
    }
}
