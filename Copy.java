//copy string
import java.util.*;
class Copy
{
  public static void main(String as[])
  {
    String x,y="";
    int i;
    Scanner ob =new Scanner(System.in);
    System.out.print("Enter the String=");
    x=ob.nextLine();//x=shreya x[0]='s' x[1]='h'
    System.out.println("Original String= "+x);
    for(i=0;i<x.length();i++)
     {
       y=y+x.charAt(i);//y=shreya
     }
    for(i=0;i<y.length();i++)
    {
      System.out.print(""+y.charAt(i)); 
    }
   // System.out.println("Copy String= "+y); 
  }
}