package aula12.polimorfismo;

public class Aula12Polimorfismo {

    public static void main(String[] args) {
         //  Animal a = new Animal();// Classe abstrata não instanciavel
         
         Cachorro teste = new Cachorro();       //Objeto teste
         
         
                //  Teste de funções 
                //Generalização Class Animal
         teste.setPeso(2.5f);
         teste.setIdade(2);
         teste.setMembros(4);
//         System.out.print("Se alimentão "); teste.alimentar();
//         System.out.print("Se locomovem "); teste.locomover();
//         System.out.print("Se comunicam por "); teste.emitirSom();
                //Especializações
        //Mamiferos
//            teste.setCorPelo("Marrom");
        //Reptil
//            teste.setCorEscama("Verde");
        //Peixe
//            teste.setCorEscamaPeixe("Prateada");
//            teste.soltarBolhas();
        //Ave
//            teste.setCorPena("Branca");
//            teste.construirNinho();
            
        //Especializações 
        //Mamifero Canguru
//            teste.usarBolca();
//            teste.locomover();
        //Mamifero Cachorro
//              teste.enterrarOsso();
//              teste.abanarRabo();
                teste.reagir(false);
//                teste.reagir("Bom garoto");
//                teste.reagir("Vai deitar");
//                teste.reagir(true);//Dono
//                teste.reagir(false);//não dono
//                teste.reagir(3, 2.5f);//Idastede Peso
//                teste.reagir(4,12f);
//                teste.reagir(6, 9f);
//                teste.reagir(7, 12f);
//                teste.reagir(11, 45);
//                teste.reagir(13, 0);
//                teste.reagir(19, 0);
        //Reptil Cobra
//            //Sem implementações adicionais
        //Reptil Tartaruga
//              teste.locomover();
        //Peixe GoodFish
//            //Sem implementações adicionais
        //Ave Arara
//            //Sem implementações adicionais
         System.out.println(teste.toString());
    }
    
}
