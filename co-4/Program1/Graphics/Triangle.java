package Graphics;
interface tri{
     public void Area(int b,int h);
}
public class Triangle implements tri{
     public void Area(int b,int h){
          double area=(0.5*b*h);
          System.out.println("Area of Triangle is:"+area);
     }
}
