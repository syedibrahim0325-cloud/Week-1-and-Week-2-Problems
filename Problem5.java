import java.util.Scanner;
public class Problem5
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the parameter of the square");
double parameter= sc.nextDouble();
double side= parameter/4;
System.out.println("Side of Square is: " + side);
}
}