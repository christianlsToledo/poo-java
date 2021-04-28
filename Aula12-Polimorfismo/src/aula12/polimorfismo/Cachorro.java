package aula12.polimorfismo;
public class Cachorro extends Lobo{

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
    
    public void reagir(String frase){
        if(frase.equals("Bom garoto")||frase.equals("Meu Menino")){
            System.out.println("Abanar o rabo e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int h, int m){
        if(h<12){
            System.out.println("Abanar o rabo");
        }else if(h>18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanando o rabo (dono)");
            this.emitirSom();
        }else{
            System.out.println("Rosnando e latindo (não dono)");
            this.emitirSom();
        }
    }
    public void reagir(int idade, float peso){
        if(idade<5){
            if(peso<10){
                System.out.println("Abanar(idade e peso<5)");
            }else{
                System.out.println("Latir (idade<5peso>10)");
            }
        }else if (peso<10){
            System.out.println("Rosnar (idade>5peso<10)");
        }else{
            System.out.println("Ignorar (idadepeso>10)");
        }
    }
}
