import Arithmetic.*;
import java.util.Scanner;
class MainClass{
public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     while(true){
          System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
          int choice=sc.nextInt();
          if(choice==1){
            System.out.println("Enter Two Numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            Arithmetic.Addition obj1=new Arithmetic.Addition();
            obj1.Result(a,b);
            }
          else if(choice==2){
            System.out.println("Enter Two Numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            Arithmetic.Subtraction obj2=new Arithmetic.Subtraction();
            obj2.Result(a,b);
            }
          else if(choice==3){
            System.out.println("Enter Two Numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            Arithmetic.Multiplication obj3=new Arithmetic.Multiplication();
            obj3.Result(a,b);
            }
          else if(choice==4){
          System.out.println("Enter Two Numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            Arithmetic.Division obj4=new Arithmetic.Division();
            obj4.Result(a,b);
            }
          else if(choice==5){
            System.out.println("Exit point");
            System.exit(0);
            }
          else{
            System.out.println("invalid choice!");
            }
          }
     }
}