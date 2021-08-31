//compare 2 string
import java.util.*;
class Strcompare
{
  public static void main(String as[])
   {
     String x,y;
     Scanner ob=new Scanner(System.in);
     System.out.print("Enter the 1st String =");
     x=ob.nextLine();
     System.out.print("Enter the 2nd String =");
     y=ob.nextLine();
     System.out.println("Compare ="+(x==y));
     System.out.println("Compare ="+x.equals(y));
   }
}