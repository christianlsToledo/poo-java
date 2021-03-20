package aula06.controleremoto;

public class ControleRemoto implements InterfaceControlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------ Menu ------");
        System.out.println("Ligado: "+(this.getLigado()?"Sim":"Não"));
        System.out.println("Tocando: "+(this.getTocando()?"PLAY >":"PAUSE ||"));
        System.out.print("Volume: "+this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu Fechado");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            if( this.getVolume()<100){
            this.setVolume(this.getVolume()+5);
            }else{
                System.out.println("Volume Maximo!");
            }
        }else{
            System.out.println("Equipamento desligado!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            if(this.getVolume()>0){
            this.setVolume(this.getVolume()-5);
            }else{
                this.onMudo();
            }
        }else{
            System.out.println("Equipamento desligado!");
        }
    }

    @Override
    public void onMudo() {
        if(this.getLigado()){
            this.setVolume(0);
            System.out.println("MUDO!");
        }else{
            System.out.println("Equipamento desligado!");
        }
    }

    @Override
    public void offMudo() {
        if(this.getLigado()){
            this.setVolume(50);
            System.out.println("Volume: "+this.getVolume());
        }else{
            System.out.println("Equipamento desligado!");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
            System.out.println("Play >>> Tocando >>>");
        }else{
            System.out.println("Equipamento desligado!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
            System.out.println("Em Pause.  ||");
        }
  
    }
}
