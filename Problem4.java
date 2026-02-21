import java.util.Scanner;
public class Problem4
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the base and height of the triangle in centemeters");
double base= sc.nextDouble();
double height= sc.nextDouble();
double area= ((base*height)/2);
double area2= (area * 0.1521);
System.out.println("Area of Triangle in square centemeters is:" + area);
System.out.println("Area of Triangle in square inches is:" + area2);
}
}