//add two complex number
class ComplexNumber{
    int r,i;
    ComplexNumber(){
    }
    ComplexNumber(int r,int i){
        this.r=r;
        this.i=i;
    }
    void Display(){
        System.out.println(this.r+"+"+this.i+"i");
    }
    ComplexNumber Add(ComplexNumber c1,ComplexNumber c2){
         ComplexNumber temp=new ComplexNumber();
         temp.r=c1.r+c2.r;
         temp.i=c1.i+c2.i;
         return temp;
    }
}
class main3{

    public static void main(String args[]){
        ComplexNumber c1=new ComplexNumber(8, 04);
        ComplexNumber c2=new ComplexNumber(2, 06); 
        System.out.println("first complex number:");
        c1.Display();
        System.out.println("second complex number:");
        c2.Display(); 
        ComplexNumber c3=new ComplexNumber();
        c3=c3.Add(c1, c2);
        System.out.println("sum:"+c3.r+"+"+c3.i+"i"); 
    }
}

