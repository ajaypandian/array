package chennai;

public class Array_Topic {

	public static void main(String[] args) {
		Array_Topic at = new Array_Topic();
		int [] a = {1,2,3,4,5};
		int[] b = {6,7,8};
		at.concatinate_two_arrays(a,b);
			//at.Introduce_Array();
		
		


	}

	private void concatinate_two_arrays(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int l1 = a.length;
		int l2 =b.length;
		int [] total = new int [l1 +l2];
		int j=0;
		{
			for(int i =0;i<total.length;i++) {
				if(i<a.length) {
					total[i] = a[i];
				System.out.print(total[i] + "  ");
			}
			else
			{
				total[i] = b[j];j++;
				System.out.print(total[i] + "  ");
				
			}
				}
					
					
			}
		}
		
	

	private void Introduce_Array() {
		// TODO Auto-generated method stub
		int [] ar = new int [5];
		ar[0]=56;
		ar[1]=6;
		ar[2]=5;
		ar[3]=50;
		ar[4]=58;
int [] br = {10,20,30,40,50,60};
{
for(int i=0;i<=ar.length;i++) 
	System.out.println(ar[i]);	
}	
	}

}
