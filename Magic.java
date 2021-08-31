import java.util.*;
//19,28,37,46,55,64,181,100,172,253
//181=1+8+1=10  100=0+0+1=1
class Magic
{
  public static void main(String as[])
  {
    int n,rem,s=0;
    Scanner ob =new Scanner(System.in);
    System.out.print("Enter the No.= ");
    n=ob.nextInt();
    for(;n>0;n=n/10)
    {
      rem=n%10;
      s=s+rem;
    }    
    if(s==1 || s==10)
     System.out.println(s+" is Magic No.");
    else
     System.out.println(s+" is NOT Magic No.");
  }
}