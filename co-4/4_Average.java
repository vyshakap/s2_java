//Average of N positive integers, raising a user defined exception for each negative
//input.
import java.util.Scanner;
class NumberIsNegative extends Exception{
    NumberIsNegative(String m){
        super(m);
    }
}
class NumberValidate{
    void Validate(int n) throws Exception{
        if(n<0){
                throw new NumberIsNegative("Number must be positive!");
            }
    }
}

class Main4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float sum=0;
        try{
            NumberValidate nv=new NumberValidate();
            System.out.println("How many numbers are you going to enter:");
            int n=sc.nextInt();
            nv.Validate(n);
            System.out.println("Enter "+n+" numbers:");
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                nv.Validate(a);
                sum=sum+a;
            }
            float avg=sum/n;
            System.out.println("Average of "+n+" Numbers is:"+avg);
        }
        catch(Exception e){
            System.out.println("Exception----"+e);
        }
    }
}