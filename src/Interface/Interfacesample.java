/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Rizky17
 */
public class Interfacesample {
    
    public static void main(String[] args) {
        
        Interfacebujursangkar obyek1 = new Interfacebujursangkar(10)
        {};
        System.out.println("Luas bujur sangkar dengan sisi 10 = "+obyek1.hitungluas());
        System.out.println("Kelilingnya = " +obyek1.hitungkeliling());
        System.out.println("\n");
        
        Interfacebangundatar obyek2 = new Interfacesegitiga(6,8){};
        System.out.println("Luas segitiga dengan alas 6 , dan tinggi 8 = "+obyek2.hitungluas());
        System.out.println("Kelilingnya = "+obyek2.hitungkeliling());
    }   
}
