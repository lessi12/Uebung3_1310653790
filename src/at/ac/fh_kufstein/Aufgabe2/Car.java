/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.Aufgabe2;

/**
 *
 * @author lessi
 */
public class Car extends Vehicle 
{
    private boolean aircondition;
    private short airbag;
    

    
    void startAircondition()
    {
        if(aircondition==false)
        {
            aircondition=true;
        }
        else
        {
            System.out.println("Klimaanlage läuft bereits!");
        }
    }
    void stopAircondition()
    {
        if(aircondition==true)
        {
            aircondition=false;
        }
        else
        {
            System.out.println("Klimaanlage ist bereits aus!");
        }
    }

    public boolean isAircondition()
    {
        return aircondition;
    }

    public void setAircondition(boolean aircondition)
    {
        this.aircondition = aircondition;
    }

    public short getAirbag()
    {
        return airbag;
    }

    public void setAirbag(short airbag)
    {
        this.airbag = airbag;
    }

    public Car( short airbag, short wheels, color color, short ps, short doors, short speed)
    {
        super(wheels, color, ps, doors, false, (short)0);
        this.aircondition = false;
        this.airbag = airbag;
    }
    
    public String toString()
    {
        return "Mein Auto hat " + getPs() + "und fährt mit " + getSpeed() + " km/h ";
    }

    public Car()
    {
      super();  
    }
    
    
    
}
