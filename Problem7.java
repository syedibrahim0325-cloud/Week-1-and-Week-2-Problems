import java.util.Scanner;
public class Problem7
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the salary");
double salary = sc.nextDouble();
System.out.println("Enter the bonus recieved");
double bonus = sc.nextDouble();
double income= salary+bonus;
System.out.println("The Total Income of the employee is: "+ income);
}
}

