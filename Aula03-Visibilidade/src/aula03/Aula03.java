
package aula03;

public class Aula03 {
    
    public static void main(String[] args) {
        float pt = 1.2f;
        
        Caneta c1 = new Caneta();
            c1.modelo = "Bic Cristal";
            c1.cor = "Azul";
          //c1.ponta = 0.5f;      Valor PRIVADO, deve ser passado via metodo de acesso com o parametro pt
            c1.carga = 100;
        //Chamada para metodos...
            c1.nPt(pt);
            c1.destampar();
            c1.status();
            System.out.println(); // Uma quebra de linha na imprição...
            c1.rabiscar();
          
    }
}
