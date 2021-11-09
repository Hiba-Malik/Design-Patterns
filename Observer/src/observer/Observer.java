
package observer;

/**
 *
 * @author fa18-bse-019
 */
public interface Observer {
    public String departureTime=new String();
    
    public  void update(Subject s);
    public void setTime(String s);

    
    
}
