
package observer;

public class Drivers implements Observer{
    String myDepartureTime;
    
    @Override
    public void update(Subject s) {
        System.out.println("Change communicated to passenger");
        if(myDepartureTime !=departureTime){
            System.out.println("Change in departure time acknowledged");
        }
        
    }

    @Override
    public void setTime(String s) {
            myDepartureTime=s;    
    }
}