package chennai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		ExceptionHandlingDemo ehd = new ExceptionHandlingDemo();
		ehd.divide();
		ehd.multify();
		// TODO Auto-generated method stub

	}

	private void multify() {
		// TODO Auto-generated method stub
		System.out.println("M ultification");
	}

	private void divide() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try
		{
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		System.out.println(no1/no2);
	}
catch(ArithmeticException ar)
		{
			System.out.println("please check the no2");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("enter numbers only");
		}
		catch(Exception e)
		{
			System.out.println("some thing went wrong");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}
