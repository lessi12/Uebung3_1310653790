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
public class Boat extends Vehicle
{
    private double draft;
    private short propeller;
    private double cargo;

    public double getDraft()
    {
        return draft;
    }

    public void setDraft(double draft)
    {
        this.draft = draft;
    }

    public short getPropeller()
    {
        return propeller;
    }

    public void setPropeller(short propeller)
    {
        this.propeller = propeller;
    }

    public double getCargo()
    {
        return cargo;
    }

    public void setCargo(double cargo)
    {
        this.cargo = cargo;
    }

    public Boat(double draft, short propeller, double cargo, short wheels, color color, short ps, short doors, short speed)
    {
        super(wheels, color, ps, doors, false, (short)0);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }
    
    
}
