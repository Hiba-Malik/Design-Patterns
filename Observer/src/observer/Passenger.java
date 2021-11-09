/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author fa18-bse-019
 */
public class Passenger implements Observer{
    String myDepartureTime;
    
    @Override
    public void update(Subject s) {
        System.out.println("Change communicated to passenger");
        if(myDepartureTime !=departureTime){
            System.out.println("Change in departure time acknowledged");
        }
    }
    
    @Override
    public void setTime(String s){
        myDepartureTime=s;
    }
}
