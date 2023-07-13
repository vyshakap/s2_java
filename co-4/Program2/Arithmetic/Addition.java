package Arithmetic;
interface A{
     public void Result(int a,int b);
     }
public class Addition implements A{
     public void Result(int a,int b){
          int c=a+b;
          System.out.println("Sum is:"+c);
     }
}
