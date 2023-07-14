package practical1;
import java.util.Scanner;
public class Areaofcircleandcircumtance 
{
	public static void main(String[] args) 
	{
          System.out.println("Enter the radius of circle");
          Scanner sc = new Scanner(System.in);
          double radius = sc.nextDouble(); 
          double  circle_area = 2*3.24*radius*radius;
          System.out.println("Area of Circle ="+circle_area);
          double circle_circumference = 2*3.14*radius;
          System.out.println("Circumference of Circle = "+circle_circumference);
	}
}
