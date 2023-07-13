package Arithmetic;
interface D{
     public void  Result(int a,int b);
}
public class Division implements D{
     public void Result(int a,int b){
          int c=a/b;
          System.out.println("Quotient is:"+c);
     }
}
