import java.util.Scanner;
class Employee{
    int Empid;
    String Name;
    int Salary;
    String Address;
    Employee(int Empid,String Name,int Salary,String Address){
        this.Empid=Empid;
        this.Name=Name;
        this.Salary=Salary;
        this.Address=Address;
    }
}
class Teacher extends Employee{
    String Dept;
    String sub;
    Teacher(String Dept,String sub,int Empid,String Name,int Salary,String Address){
        super(Empid, Name, Salary, Address);
        this.Dept=Dept;
        this.sub=sub;
    }
    void Display(){
        System.out.println("--------------------");
        System.out.println("Employee ID:"+Empid);
        System.out.println("Name:"+Name);
        System.out.println("Salary:"+Salary);
        System.out.println("Address:"+Address);
        System.out.println("Department:"+Dept);
        System.out.println("Subject:"+sub);
        System.out.println("--------------------");
    }
}
class Main2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Teacher arr[]=new Teacher[3];
        for(int i=0;i<2;i++){
            System.out.println("Employee "+(i+1));
            System.out.println("Enter Employee id:");
            int empid=sc.nextInt();
            System.out.println("Enter Name:");
            String n=sc.next();
            System.out.println("Enter Salary:");
            int s=sc.nextInt();
            System.out.println("Enter Address:");
            String a=sc.next();
            System.out.println("Enter Department:");
            String d=sc.next();
            System.out.println("Enter subject taught:");
            String sb=sc.next();
            arr[i]=new Teacher(d, sb, empid, n, s, a);
        }
        for(int i=0;i<2;i++){
            System.out.println("Details of Employee"+(i+1));
            arr[i].Display();

        }
    }
}