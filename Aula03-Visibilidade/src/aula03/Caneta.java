package aula03;

public class Caneta {
    public String modelo;   //Definições de visibilidade dos atributos.
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){       //Impreção dos valores passados aos atributos
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta :" + this.ponta);
        System.out.println("Carga : " + this.carga);
        System.out.println("Está tampada : " + this.tampada);
    }
    
    public void rabiscar(){     //Metodo de usabilidade do objeto.
        if (this.tampada == true){
            System.out.println("Impossível! estou tampada.");
        }else{
            System.out.println("Estou rabiscando...");
        }
    }
    public void tampar(){       //Metodo publico de usabilidade, faz acesso ao atributo privado "tampada".
        this.tampada = true;
    }
    
    public void destampar(){       //Metodo de usabilidade, faz acesso ao atributo privado "tampada".
        this.tampada = false;
    }
    public void nPt(float x){       //Valor da ponta recebido pelo parametro pt na chamada ao método
        this.ponta = x;
    }
}