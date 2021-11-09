/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author fa18-bse-019
 */
public class DaewooBus implements Subject{
    String departureTime;
    ArrayList<Observer> obs = new ArrayList<Observer>();
    
    DaewooBus(){
        departureTime="8:00";
    }

    @Override
    public void attach(Observer observer) {
        obs.add(observer);
        observer.setTime(departureTime);
    }

    @Override
    public void deattach(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer n: obs) {
            n.update(this);
        }
    }
    
    public void timeChange(String t){
        departureTime =t;
        notification();
    }
    
}
