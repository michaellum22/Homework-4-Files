package car;
public class Parent {


	
	
	public class status extends car {
		status(int n){
			torque = n;
		}
	    protected int pricerange = getTorque();
	    int getTorque()
	    {
	    	return torque;
	    }
	    
	}
	public static void main(String[] args) {
		
		status Lexus = null; 
		System.out.println(Lexus.getTorque());
		
	}
	

}
