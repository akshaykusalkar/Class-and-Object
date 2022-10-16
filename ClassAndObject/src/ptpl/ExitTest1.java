package ptpl;

public class ExitTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "AAA" );
		funTest();
		System.out.println( "DDD" );
	}
	
	public static void funTest()
	{
		int a = 10;
		System.out.println( "BBB" );
		if( a == 10 )
			System.exit(0);
		System.out.println( "CCC" );

	}

}
