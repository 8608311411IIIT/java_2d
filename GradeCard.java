import java.util.*;
public class GradeCard
{
public static void main(String []args){
int marks,age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks and age");
marks=sc.nextInt();
age=sc.nextInt();
if(marks>70)
  System.out.println("You have got A grade");
else if(marks>=61 &&marks<=70){
   if(marks>60 && age<15)
      System.out.println("You have got A grade");
   else
       System.out.println("You have got B grade");
}
else if(marks<61){
   if(marks>45 && age<15)
      System.out.println("You have got B grade");
   else
       System.out.println("You have got C grade");
}
}

}
