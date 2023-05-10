package tamilnadu;

public record LoopingBasics() {

	public void cube_number() {
		// TODO Auto-generated method stub
		int a=3,b=4,c;
		c=a + b + a++ + b++ + ++a + ++b;
		System.out.println("c is" + c);
		
	}

}
