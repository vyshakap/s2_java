import java.util.Scanner;
class Multi extends Thread
{
 int a=5,m;
  public void run()
  {
   System.out.println("Multiplication table");
   for(int i=1;i<=10;i++)
   {
    m=a*i;
    System.out.println(a+"*"+i+"="+m);
   }
  }
}
 class prime extends Thread
 {
  int i,j,k,n;
  Scanner sc=new Scanner(System.in);
  public void get()
  {
   System.out.println("first n prime numbers");
   System.out.println("enter the limit");;
   n=sc.nextInt();
  }
  public void run()
  {
    System.out.println("prime numbers between a and "+n+" are ") ;
    for(i=1;i<=n;i++)
    {
     if(i==1 || i==0)
      continue;
      k=1;
     for(j=2;j<=i/2;j++)
     {
      if(i%j==0)
      {
       k=0;
       break;
      }
     }
     if(k==1)
 System.out.println(i+" ");
     }}}
class main
{
 public static void main(String args[])
 {
  Multi m=new Multi();
  m.start();
  prime p=new prime();
  p.get();
  p.start();
 }
}

