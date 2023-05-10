package tamilnadu;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int a=1;
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=i;k--) {
				System.out.print((char)(i-Math.abs(k)+65));
			}
			a=a+2;
			System.out.println();
		}

	}

}
