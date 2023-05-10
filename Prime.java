package tamilnadu;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime pr = new Prime();
		pr.given_number(8);

	}

	private void given_number(int i) {
		// TODO Auto-generated method stub
		int count=0;
		{
			for(int j=2;j<=i/2;j++) 
				if(i%j==0) {
					count++;
					System.out.println("The number is not prime");
					break;
				}
				{
					if(count==0)
					{
						System.out.println("the number is prime");
					}
				}
			}
		}
	}


