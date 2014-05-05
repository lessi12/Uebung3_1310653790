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
public class Vehicle implements Benennbar
{
    private short wheels;
    private color color;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;
    private String name;

    @Override
    public String getName()
    {
       return name; 
    }

    @Override
    public void setName(String n)
    {
        name=n; 
    }
    
    
    public enum color
    {
        BLACK, SILVER, RED, GREY, YELLOW, BLUE;
    }
    
    void start()
    {
        started=true;
    }
    void stop()
    {
        started=false;
    }
    void accelerate(short speed)
    {
        if (started==true && speed <=250)
        {
            speed += speed;
        }
        else
        {
            System.out.println("Die Geschwindigkeit kann nicht erhöht werden!");
        }
    }
    void Break(short speed)
    {
        if (started==true && speed >0)
        {
            speed -= speed;
        }
        else
        {
            System.out.println("Die Geschwindigkeit kann nicht verringert werden!");
        }
    }

    public short getWheels()
    {
        return wheels;
    }

    public void setWheels(short wheels)
    {
        this.wheels = wheels;
    }

    public color getColor()
    {
        return color;
    }

    public void setColor(color color)
    {
        this.color = color;
    }

    public short getPs()
    {
        return ps;
    }

    public void setPs(short ps)
    {
        this.ps = ps;
    }

    public short getDoors()
    {
        return doors;
    }

    public void setDoors(short doors)
    {
        this.doors = doors;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void setStarted(boolean started)
    {
        this.started = started;
    }

    public short getSpeed()
    {
        return speed;
    }

    public void setSpeed(short speed)
    {
        this.speed = speed;
    }

    public Vehicle(short wheels, color color, short ps, short doors, boolean started, short speed)
    {
        this.wheels = wheels;
        this.color = color;
        this.ps = ps;
        this.doors = doors;
        this.started = started;
        this.speed = speed;
        
    }

    public Vehicle()
    {
    }
    
    
    
    
    
    
    
}
