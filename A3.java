import java.util.*;
class A3
{ public static void main(String[]args)
{ Scanner sc= new Scanner(System.in);
 int a,i;
 System.out.println(" enter the number");
  a= sc.nextInt();
 int s1[]={1, 4, 34, 56, 7};
 for(i=0;i<5;i++)
  { if(s1[i]==a)
     { 
    System.out.println(i);
     break;
    }
   else
     {
     System.out.println("-1");
     break;
      }
}
}
}