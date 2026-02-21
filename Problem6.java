import java.util.Scanner;
public class Problem6
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the temperature in celcius");
double celsius = sc.nextDouble();
double farenheitResult = (((celsius*9)/5)+32);
System.out.println("The Temperature in farenheit is: "+ farenheitResult);
}
}

