package practical1;
import java.util.Scanner;

public class voting 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Age to check for eligible of voting or not");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 18) 
		{
			System.out.println("Welcome, you are eligible for vote");
		}
		else 
		{
			System.out.println("Sorry, you are not eligible for vote ");
		}
	}
}
