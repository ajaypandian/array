package tamilnadu;

public class MainClass {
	static  int i =2;
	static
	{
		i=i-- + --i;
		System.out.println(i);
		
	}
	{
	i = i++ -++i;	
	System.out.println(i);
	}
	 int methodofTest()
	 {
		
		 i= i+i-i*i/i;
		 System.out.println(i);//-2 +-2 -(-2*-2/-2)
		 return i;
		 
	 }
	public static void main(String[] args) {
	System.out.println(new MainClass().methodofTest());	
	}
	}

