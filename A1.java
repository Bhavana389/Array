import java.util.*;
class A1
{ public static void main(String[]args)
{
int s=0,i,a=0;
 int s1[]={2, 3, 4, 5, 6};
  for(i=0;i<5;i++)
{ s= s1[i]+s;
 }
System.out.println("sum of numbers:  "+s);
a=s/5;
System.out.println("average " +a);
}
}