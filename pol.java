import java.util.Scanner;

class Polygon{
        void area(double l,double w){
                le=l;
                wi=b;
                area=l*b;
                System.out.print("Area of rect: "+area);
        }
        void area(double r)
        {
                ra=r;
                area=3.14*r*r;
                System.out.print("Area of Circle: "+area);
        }
        void area(double s)
        {
                si=s;
                area=s*s;
                System.out.print("Area of Sq: "+area);
        }
        void area(double ba,double h)
        {
                base=ba;
                he=h;
                area=0.5*ba*h;
                System.out.print("Area of Tri: "+area);
        }
}
class Main{
        public static void main(String args[]){
                Scanner input = new Scanner(System.in);
                        System.out.print("Enter length: ");
                        double le=input.nextDouble();
                        System.out.print("Enter width: ");
                        double wi=input.nextDouble();
                        System.out.print("Enter radius: ");
                        double ra=input.nextDouble();
                        System.out.print("Enter side of square: ");
                        double si=input.nextDouble();
                        System.out.print("Enter base: ");
                        double base=input.nextDouble();
                        System.out.print("Enter height: ");
                        double he=input.nextDouble();
                        Polygon a=new Polygon();
                        a.area(le,wi);
                        a.area(ra);
                        a.area(si);
                        a.area(base,he);        }       }
