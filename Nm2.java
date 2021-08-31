//input --> gargi kumari ghosh
//G.K.Ghosh
import java.util.*;

class Nm2

{
     
public static void main(String as[])

{
     
  String x;
     
  int k=0;
     
  Scanner ob = new Scanner(System.in);

  System.out.print("enter the string:");

  x=ob.nextLine();

  if(x.charAt(0)>=97 && x.charAt(0)<=122)

  {
     
    System.out.print(""+(char)(x.charAt(0)-32));
    
  }

  else
      
  {
     
    System.out.print(""+(char)(x.charAt(0)));

  }

  for(int i=1;i<x.length();i++)

  {
  
    if(x.charAt(i)==' ')

    {
    
       if(x.charAt(i+1)>=97 && x.charAt(i+1)<=122)

       {
     
         System.out.print("."+(char)(x.charAt(i+1)-32));

       }

       else

       {
     
         System.out.print("."+(char)(x.charAt(i+1)));

       }
     
  k=i
;
    }


  }

  for(k=k+2;k<x.length();k++)

  {
   
System.out.print(""+x.charAt(k));
  
}


 }

}