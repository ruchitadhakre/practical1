package practical1;
import java.util.Scanner;
public class factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the factorial number");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=Number; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+Number +" is "+fact);		
	}
}
