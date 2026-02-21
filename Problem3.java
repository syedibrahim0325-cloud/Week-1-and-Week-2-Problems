public class Problem3
{
public static void main(String args[])
{
double CP= 129.0;
double SP= 191.0;
double percentage=0.0;
double profit =0.0;
double loss= 0.0;
if(SP>CP)
{
profit= SP-CP;
percentage= ((profit/CP)*100);
System.out.println("The profit is: " + profit);
System.out.println("The profit percentage is: " + percentage);
}
else
{
loss = CP-SP;
percentage= ((loss/CP)*100);
System.out.println("The loss is: " + loss);
System.out.println("The loss percentage is: " + percentage);
}
}
}