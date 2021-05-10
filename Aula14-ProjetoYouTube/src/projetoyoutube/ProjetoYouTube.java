package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[3];
        
        
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video ("Aula 12 PHP");
        v[2] = new Video ("Aula 10 HTML5");
        
        g[0] = new Gafanhoto("Jubileu", 33, "M","Juba");
        g[1] = new Gafanhoto ("Maria", 25, "F", "MAMA");
        g[2] = new Gafanhoto ("Christian", 37,"M", "Chris");
        //Açoes video
//            v[0].play();          //Teste OK
//            v[0].pause();         //Teste OK
//            v[0].like();          //Teste OK

    Visualizacao vis[] = new Visualizacao[3];//Criação de visualizações
    
        vis[0] = new Visualizacao(g[0],v[0]); // Jubileu - POO //Teste OK
        vis[0].avaliar();                       //Teste OK
       // v[0].like();                            //Teste OK
        System.out.println(vis[0].toString());  //Teste OK
        
        vis[1] = new Visualizacao(g[0],v[1]);   // Jublieu - PHP //Teste OK
        vis[1].avaliar(6);                     //Teste OK
        System.out.println(vis[1].toString());
        
        vis[2] = new Visualizacao(g[1],v[0]);   //Maria - POO //Teste OK
        //v[0].like();                            //Teste OK
        vis[2].avaliar(60.0f);                  //Teste OK
        System.out.println(vis[2].toString());
        
        System.out.println("Avaliação: "+v[0].getAvaliacao());
        System.out.println("Views: "+v[0].getViews());
        System.out.println("Media: "+v[0].getMediaAvaliacao());
    }
}
