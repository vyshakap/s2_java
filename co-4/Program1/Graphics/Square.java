package Graphics;
interface sq{
     public void Area(int s);
}
public class Square implements sq{
     public void Area(int s){
          int area=s*s;
          System.out.println("Area of square is:"+area);
     }
}
