package Graphics;
interface ci{
     public void Area(double r);
}
public class Circle implements ci{
     public void Area(double r){
          double area=(3.14*r*r);
          System.out.println("Area of Circle is:"+area);
     }
}
