package ptpl;

public class BoxTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box();
		double vol;
		
		b1.width = 10;
		b1.height = 15;
		b1.depth = 20;
		
		vol = b1.width * b1.height * b1.depth;
		System.out.println("Volume is " + vol);

	}

}
