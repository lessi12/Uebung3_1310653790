/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.Aufgabe2;
import at.ac.fh_kufstein.*;
import at.ac.fh_kufstein.Aufgabe2.Benennbar;
import at.ac.fh_kufstein.Aufgabe2.Boat;
import at.ac.fh_kufstein.Aufgabe2.Car;
import static at.ac.fh_kufstein.Aufgabe2.Vehicle.color.BLACK;
import static at.ac.fh_kufstein.Aufgabe2.Vehicle.color.BLUE;
import static at.ac.fh_kufstein.Aufgabe2.Vehicle.color.SILVER;

/**
 *
 * @author lessi
 */
public class Aufruf
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Car bmw=new Car((short)4, (short)4, SILVER, (short)220, (short)5, (short)0);
        Car audi=new Car((short)8, (short)4, BLACK, (short)180, (short)5, (short)0);
        Boat titanic=new Boat(10.54, (short)3, 100000, (short)0, BLUE, (short)51000, (short)0, (short)0);
        
        bmw.toString();
        audi.toString();
        
        Benennbar namedCar=new Car();
        namedCar.setName("nhgnhg");
        System.out.println(namedCar.getName());
    }
    
}
