package tamilnadu;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ad = new ArrayDemo();
		ad.assign_values();
	}

	private void assign_values() {
		// TODO Auto-generated method stub
		int[] ar = new int[5];
		ar[0] = 89;
		ar[1]=95;
		ar[2]=45;
		ar[3]=85;
		ar[4]=99;
		int[] br = {78,55,65,89,25,87};
		System.out.println(ar.length);
		System.out.print(br.length);
		
	}

}
