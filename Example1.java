package tamilnadu;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e1 = new Example1();
		e1.test1();

	}

	private void test1() {
		// TODO Auto-generated method stub
		int first=0 ,second=1;
		while(first<100) {
			int third=first+second;
			System.out.print(first + "  ");
			first=second;
			second=third;
		}

}
}
