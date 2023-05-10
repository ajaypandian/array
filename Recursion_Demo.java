package tamilnadu;

public class Recursion_Demo {

	public static void main(String[] args) {
		Recursion_Demo rd = new Recursion_Demo();
		int factorial = rd.find_fact(10);
		System.out.println(factorial);
		

	}

	private int find_fact(int no) {
		// TODO Auto-generated method stub
		if(no==1)
		return 1;
		else
			return no*find_fact(no-1);
	}

}
