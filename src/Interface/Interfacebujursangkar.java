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
public class Interfacebujursangkar implements Interfacebangundatar{
private double sisi;


public Interfacebujursangkar(double sisi)
{
    this.sisi = sisi;
}
@Override
public double hitungkeliling()
{
    return sisi * 4;
}

@Override
public double hitungluas()
{
return sisi * sisi;
}
}
