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
public class Demo {
    public static void main(String[] str){
        DaewooBus bus = new DaewooBus();
        Passenger hiba = new Passenger();
        Drivers saad = new Drivers();
        
        bus.attach(hiba);
        bus.attach(saad);
        
        bus.timeChange("9:00");
        
    }
    
}
