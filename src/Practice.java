
public class Practice {

	private int value;//data field
	
	public Practice(int p1){//constructor
		this.value = p1; //"this." means you're specifically referring to an instance 
	} 
	
	public int getvalue() { //put name of the field not parameter
		return value;
	}
	
	public boolean isEven() {
		if( value % 2 == 0)//easier way to find if value is even
		return true;
		else
			return false; 
	}
	
	public boolean isOdd() {
		if( value % 2 !=0)
			return true;
		else
			return false;
	}
	
	public void getvalue() {
		
	}
	
	
}
