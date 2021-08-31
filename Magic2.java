import java.util.*;
//19,28,37,46,55,64,181,100,172,253
//181=1+8+1=10  100=0+0+1=1
class Magic2
{
  public static void main(String as[])
  {
    int n,rem,s=0,s1=0;
    Scanner ob =new Scanner(System.in);
    System.out.print("Enter the No.= ");
    n=ob.nextInt();
    for(;n>0;n=n/10)
    {
      rem=n%10;
      s=s+rem;
    }
    for(;s>0;s=s/10)
     {
       rem=s%10;
       s1=s1+rem;
     }    
    if(s1==1)
     System.out.println(s1+" is Magic No.");
    else
     System.out.println(s1+" is NOT Magic No.");
  }
}