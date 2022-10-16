package ptpl;

public class SetterGetterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C ob = new C(); 
		ob.setMessage("Nils Techsys");
		System.out.println(" Welcome to " + ob.getMessage() + " ..!"); 
	}
}

class  C
{
	private String message;
	
	public void setMessage( String msg )
	{
		message = msg;
	}
	
	public String getMessage()
	{
		return message;
	}

}
