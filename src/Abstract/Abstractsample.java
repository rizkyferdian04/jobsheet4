/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Rizky17
 */
public class Abstractsample {
    public static void main(String[] args) {
        
        bangunDatar obyek1 = new bujurSangkar(10);
        
        System.out.println("Luas bujur sangkar dengan sisi 10 = " +obyek1.hitungluas());
        System.out.println("Keliling 10 = "+obyek1.hitungkeliling());
        System.out.println("\n");
        
        bangunDatar obyek2 = new Lingkaran(7);
        
        System.out.println("Luas Lingkaran dangan jari-jari 7 = "+obyek2.hitungluas());
        System.out.println("Keliling = "+ obyek2.hitungkeliling());
    }
    
}
