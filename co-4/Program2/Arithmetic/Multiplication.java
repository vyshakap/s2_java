package Arithmetic;
interface M{
     public void Result(int a,int b);
}
public class Multiplication implements M{
     public void Result(int a,int b){
          int c=a*b;
          System.out.println("Product is:"+c);
     }

}
