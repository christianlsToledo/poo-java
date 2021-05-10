package projetoyoutube;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;      // Recebe a soma de todas as avaliações
    private int views;          // Contabiliza a quantidade de visualizações 
    private int curtidas;       // 
    private boolean reproduzindo;

    @Override
    public void play() {    //Teste OK
        this.setReproduzindo(true);
    }
    @Override
    public void pause() {   //Teste OK
        this.setReproduzindo(false);
    }
    @Override
    public void like() {    //Teste OK
        this.setCurtidas();
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    public float getMediaAvaliacao(){
        float media = ((float)this.getAvaliacao()/this.getViews());// (float) Converte os numeros inteiros para float sem perda
        return media;                                               //Calcula a media de avaliações em relação as visualizações
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = (this.getAvaliacao()+ avaliacao);
        this.setReproduzindo(false);        //Termina a reprodução
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas() {     // Chamado diretamente ou no metodo avaliar em visualização
        this.curtidas ++;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", Avaliacao=" + this.getMediaAvaliacao() + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
}