//Define 2 classes. one for generating multiplication table of 5 and other for displaying first
//N prime numbers. Implement using threads
import java.util.Scanner;
class Multiplication extends Thread{
    public void run(){
        try{
        for(int i=1;i<=10;i++){
            System.out.println(i+"*5="+(i*5));
            Thread.sleep(500);        
            }
        }
        catch(Exception e){
            System.out.println("Exception in Multiplication Thread!");
        }      
    }
}
class Prime extends Thread{
    int l;
    Prime(int l){
        this.l=l;
    }
    public void run(){
        try{
        for(int i=2;i<=l;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag++; 
                    break;
                    
                }
            }
            if(flag==0){
                System.out.println("Prime number:"+i);
                Thread.sleep(500);
            }
  
        }
    }
    catch(Exception e){
        System.out.println("Exception in Prime Thread!");
    }
    }
}
class Main5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of prime numbers:");    
        int l=sc.nextInt();
        Multiplication m=new Multiplication();
        Prime p=new Prime(l);
        m.start();   
        p.start();
    }
}
