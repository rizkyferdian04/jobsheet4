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
public class Interfacesegitiga implements Interfacebangundatar{
    private double alas;
    private double tinggi;
    
    public Interfacesegitiga(double alas, double tinggi)
    {
        this.alas = alas;
        this.tinggi= tinggi;
    }
    @Override
    public double hitungkeliling()
    {
        return 2 * alas +tinggi;
    }
    
    @Override
    public double hitungluas()
    {
        return ((alas*tinggi)/2);
    }
}
