
package prototype2;

public class AccessControl implements Prototype, Cloneable{
	private final String controlLevel;
	private String access;
        AccessControl c;
	
	private AccessControl (AccessControl accessControl){
		this.controlLevel = accessControl.getControlLevel();
		this.access = accessControl.getAccess();
	}

    private AccessControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
        @Override
	public AccessControl clone(){
            AccessControl accessControl=new AccessControl();
            
            
		return accessControl;
	}
	public String getControlLevel() {
		return controlLevel;
	}
	public String getAccess() {
		return access;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof AccessControl))
			return false;
		AccessControl obj2 = (AccessControl)obj;
		return ((obj2.getControlLevel().equals(controlLevel))&&(obj2.getAccess().equals(access)));
	}
	public void setAccess(String access) {
		this.access = access;
		
	}
}
