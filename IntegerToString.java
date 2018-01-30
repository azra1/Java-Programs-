import java.util.*;
class IntegerToString
{
 public static void main (String ar[])
 {

   Scanner sc= new Scanner(System.in);
   int a,b;
   System.out.println("Enter two numbers");
   a=sc.nextInt();
   b=sc.nextInt();
   String s1 = String.valueOf(a);
   String s2 = String.valueOf(b);
   System.out.println(s1+s2);
  }
}
