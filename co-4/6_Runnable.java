//Define 2 classes; one for generating Fibonacci numbers and other for displaying even
//numbers in a given range. Implement using threads
import java.util.Scanner;
class Fibonacci implements Runnable{
    int n;
    Fibonacci(int n){
        this.n=n;
    }
    public void run(){
        int a1=0;
        int a2=1;
        try{
        for(int i=0;i<n;i++){
            System.out.println("fibonacci:"+a1);
            int a3=a2+a1;
            a1=a2;
            a2=a3;
            Thread.sleep(500);
            }

        }
            catch(Exception e){
                System.out.println("Exception in Even Thread!");
            }

        
    }
}
class Even implements Runnable{
    int a,b;
    Even(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        try{
            for(int i=a;i<b;i++){
                if(i%2==0){
                    System.out.println("Even Number:"+i);
                    Thread.sleep(500);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception in Even Thread!");
        }
    }

}
class Main6{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range of fibonacci series:");
        int n=sc.nextInt();
        System.out.println("Enter the starting range of even numbers:");
        int a=sc.nextInt();
        System.out.println("Enter the ending range of even numbers:");
        int b=sc.nextInt();
        Fibonacci obj1=new Fibonacci(n);
        Even obj2=new Even(a,b);
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}