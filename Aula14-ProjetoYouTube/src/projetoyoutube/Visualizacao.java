package projetoyoutube;
public class Visualizacao {                 //Integração de Classe tipo muitos p Muitos
        private Gafanhoto espectador;
        private Video filme;
        
        public void  avaliar(){
            this.filme.setAvaliacao(10);
            this.filme.setCurtidas();
        }
        public void avaliar (int nota){         //Avaliação por passagem direta da nota
            if (nota >= 6){
                this.filme.setCurtidas();
            }
            this.filme.setAvaliacao(nota);
        }
        public void avaliar (float porc){       //Avaliar por percentual de video assistido
            int nota;
            if (porc <= 20){
                nota = 3;
            }else if (porc <= 50){
                nota = 5;
            }else if (porc <=90){
                nota = 8;
                this.filme.setCurtidas();
            }else{
                nota = 10;
                this.filme.setCurtidas();
            }
            this.filme.setAvaliacao(+ nota);
        }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.filme.setViews(this.filme.getViews()+1);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setReproduzindo(true);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ",assistindo filme=" + filme + '}';
    }
}
