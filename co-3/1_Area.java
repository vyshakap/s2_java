import java.util.Scanner;
class Polygon{
int length,breadth,side;
double radius,t_breadth,t_height;
void area(int s){
side=s;
System.out.println("Area of square is:"+side*side);
}
void area(int l,int b){
length=l;
breadth=b;
System.out.println("Area of rectangle is:"+length*breadth);
}
void area(double r){
radius=r;
double area=3.14*(radius*radius);
System.out.println("Area of circle is:"+area);
}
void area(double b,double h){

t_breadth=b;
t_height=h;
double area=0.5*(t_breadth*t_height);
System.out.println("Area of triangle is:"+area);
}
}

class MainArea{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of the square:");
int side=sc.nextInt();
System.out.println("Enter the breadth of the rectangle:");
int breadth=sc.nextInt();
System.out.println("Enter the length of the rectangle:");
int length=sc.nextInt();
System.out.println("Enter the radius of the circle:");
double radius=sc.nextFloat();
System.out.println("Enter the breadth of the triangle:");
double tbreadth=sc.nextFloat();
System.out.println("Enter the height of the triangle:");
double height=sc.nextFloat();
Polygon a=new Polygon();
a.area(side);
a.area(length,breadth);
a.area(radius);
a.area(tbreadth,height);

}
}