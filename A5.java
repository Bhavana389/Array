import java.util.*;
class A5
{ public static void main(String[]args)
{ Scanner sc= new Scanner(System.in);
  
   int i,k,l,m,n,p;
    p=sc.nextInt();
    int a[] =  new int[p];
    for(i=0;i<p;i++)
      {
          a[i] = sc.nextInt();
     }
   Arrays.sort(a);
  k=a[0];
  l=a[1];
  m=a[p-2];
  n=a[p-1];
  System.out.println("2 minimum numbers are " +k +" and " +l);
   System.out.println("2 maximum numbers are " +m +" and " +n);   
}
}