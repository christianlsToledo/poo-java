package aula07.relação.entre.pkgclass;
import java.util.Random;
public class Luta {
    private ClasseLutador desafiado;
    private ClasseLutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int l1=0,l2=0;
    
    public void marcarLuta(ClasseLutador l1,ClasseLutador l2, int rounds){
        this.setDesafiado(l1);
        this.setDesafiante(l2);
        this.setRounds(rounds);       
        if ((l1.getCategoria()).equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
        } else {
            System.out.println("Incompatibilidade entre "+this.getDesafiado().getNome()+" e "+this.getDesafiante().getNome());
        }
    }
    private int favorito(){
        int venc, l1=0,l2=0;
        Random sorteio = new Random();
        int sorte = sorteio.nextInt(10);
        switch(sorte){
            case 1:
                l1++;
            break;
            case 2:
                l2++;
            break;
            case 3:
                l1=l2;
            break;
            case 4:
                l1 = l1+2;
            break;
            case 5:
                l2 = l2+2;
            break;
            case 6:
                l2=l1;
            break;
            case 7:
                l1--;
            break;
            case 8:
                l2--;
            break;
            case 9:
                int troca = l1>l2?l1:l2;
                if(l1>l2){
                    l1=l2;
                    l2=troca;
                } else {
                    l2=l1;
                    l1=troca;
                }
            break;
        }
        if (this.getDesafiado().getVitorias() > this.getDesafiante().getVitorias()){
            l1++;
        } else {
            l2++;
        }
        if (this.getDesafiado().getDerrotas() > this.getDesafiante().getDerrotas()){
            l1--;
        } else {
            l2--;
        }
        if(l1>l2){
            venc = 2;
        }else if(l1<l2){
            venc = 3;
        } else {
            venc = 1;
        }
        return venc;
    }
    private int ganhador(){
                int rFim = 1;
                if (l1>l2){
                    rFim = 2;
                } else if (l1<l2){
                    rFim = 3;
                }else if (l1==l2){
                    rFim = 1;
                }
                return rFim;
            }
    public void lutar(){
        if (this.getAprovada()){
            System.out.println("###### Desafiado ######");
            this.getDesafiado().apresentar();
            System.out.println("###### Desafiante ######");
            this.getDesafiante().apresentar();
            System.out.println("########################");
            for (int i = 1; i <= this.getRounds(); i++){
                String resp;
                switch (favorito()) {
                    case 2:
                        l1++;
                        resp = this.getDesafiado().getNome();
                        break;
                    case 3:
                        l2++;
                        resp = this.getDesafiante().getNome();
                        break;
                    default:
                        resp = "Empate!";
                        break;
                }
                System.out.println("Round " + i + " "+ resp);
            }

            switch(ganhador()){
                case 1:     //Empate
                    System.out.println("Empatado !!!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 2:        //Desafiado Ganha
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 3:         //Desafiante Ganha
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer !");
        }
        this.getDesafiado().status();
        this.getDesafiante().status();
    }
    
        //  ######      Geters e Seters
    public ClasseLutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(ClasseLutador desafiado) {
        this.desafiado = desafiado;
    }
    public ClasseLutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(ClasseLutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}