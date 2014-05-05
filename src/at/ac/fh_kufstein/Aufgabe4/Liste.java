/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.Aufgabe4;

/**
 *
 * @author lessi
 */
public class Liste <T>
{
    T [] array;
    
    public Liste(int size)
    {
        array=(T[]) (new Object [size]);
    }
    public void save(T value)
    {
        
        for (int i = 0; i < array.length; i++)
        {
            if(array[i]==null)
            {
                array[i] = value;
                System.out.println("Wurde gespeichert");
                break;
            }
           
        }
    }

    @Override
    public String toString()
    {
        String listeninhalt="";
        for(T a: array)
        {
            listeninhalt += a + "\n";
        }
        return listeninhalt; 
    }
    
}
