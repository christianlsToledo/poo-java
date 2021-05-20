/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetçãocambalhota;

import java.util.Scanner;

/**
 *
 * @author computador
 */
public class RepetçãoCambalhota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int n, soma=0;
        String resp;
        
        do {
            System.out.print("Digite um numero: ");
            n = t.nextInt();
            soma += n;
            System.out.println("Quer continuar?  [s/n]");
            resp = t.next();
           
        } while (resp.equals("s"));
        System.out.println("Total = "+soma);
    }
    
}
