package tamilnadu;

public class LoopingBasics5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingBasics5 lb = new LoopingBasics5();
		//lb.bsics_concept_of_looping();
		//lb.bsics_concept_of_looping1();
         // lb.bsics_concept_of_looping2();
         // lb.bsics_concept_of_looping3();
		//lb.bsics_concept_of_looping4();
		lb.basics_palindrome();
		
	}

	

	 private void basics_palindrome() {
		// TODO Auto-generated method stub
		 int first=0,second=1;
		 while(first<100)
		 {
			 System.out.print(first + " ");
			 second=first+second;
			first=second-first;
		 }
		
	}



	void bsics_concept_of_looping4() {
		
		int count=4;
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				if(i==0 & j<count || i==count-1 & j<count || j==0 & i<count || j==count-1& i<count)
					{
						System.out.print ("* ");
					}else {System.out.print("  ");
				}
			}
		
			System.out.println("");
		}
	 }
	



	private void bsics_concept_of_looping3() {
//		// TODO Auto-generated method stub
//		    1
//	      1 2 
//	    1 2 3 
//	  1 2 3 4 
//	1 2 3 4 5 

		for(int row=5;row>=1;row--) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+" ");}
				System.out.println();
			}
		}
		
	

	private void bsics_concept_of_looping2() {
		// TODO Auto-generated method stub
//		1 2 3 4 5 
//		  1 2 3 4 
//		    1 2 3 
//		      1 2 
//		        1 
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
				for(int col=1;col<=6-row;col++) {
						System.out.print(col+" ");}
					
					System.out.println();
				}
		}
			//System.out.println();
		
		
	
	
	private void bsics_concept_of_looping1() {
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 

		
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
		
	}

	private void bsics_concept_of_looping() {
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1 
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=6-row;col++) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
		
	}

}
