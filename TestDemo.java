import java.util.*;
public class TestDemo
{
public static void main(String []args){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
if(num==0)
   System.out.println("You have entered 0");
else if(num>0)
   System.out.println("You have entered positive value");
else
   System.out.println("You have entered negative value");

}

}
