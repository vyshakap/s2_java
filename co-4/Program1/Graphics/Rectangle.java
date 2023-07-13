package Graphics;
interface Rect{
     public void Area(int l,int b);
}
public class Rectangle implements Rect{
     public void Area(int l,int b){
          int area=l*b;
          System.out.println("Area of Rectangle is:"+area);
}
}
