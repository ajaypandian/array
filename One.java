package tirunelveli;

public class One {

	public static void main(String[] args) {
	
		int j=10,count=0;
		for(int i=2;i<=j/2;i=i+1)
		{
			if(j%i==0)
			{
			
		//System.out.print (i);
			
		
		count=count+1;
		System.out.println("not prime");
		break;
			}
		}	
		//System.out.print("given"+ count);
		if(count==0) {
			System.out.println("the number is prime number");
		}
		/*	else {
				System.out.println("The number is not prime");
			}*/
		
		
	}
}
	


