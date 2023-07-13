package Arithmetic;
interface D{
     public void Result(int a, int b);
}
public class Subtraction implements D{
     public void Result(int a,int b){
          int c=a-b;
          System.out.println("Difference is:"+c);
     }
}
