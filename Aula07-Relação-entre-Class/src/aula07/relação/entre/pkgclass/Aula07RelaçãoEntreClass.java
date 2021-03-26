package aula07.relação.entre.pkgclass;

public class Aula07RelaçãoEntreClass {

    public static void main(String[] args) {
                            //Instanciando os objetos
        ClasseLutador l[] = new ClasseLutador[8];
                            
        l[0] = new ClasseLutador("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
        l[1] = new ClasseLutador("Pustscript","Brasil",29,1.68f,57.8f,14,2,3);
        l[2] = new ClasseLutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        l[3] = new ClasseLutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        l[4] = new ClasseLutador("Ufocobol","Brasil",37,1.70f,119.3f,5,4,3);
        l[5] = new ClasseLutador("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);
        l[6] = new ClasseLutador("Christian","Brasil",36,1.78f,89.5f,0,0,0);
        l[7] = new ClasseLutador("Alex","Brasil",42,1.75f,123f,0,0,0);
        
        l[0].apresentar();
        l[0].status();
        
//        l[6].empatarLuta();
//        l[6].ganharLuta();
//        l[6].perderLuta();
//        
//        l[6].apresentar();
//        l[6].status();
    }
}