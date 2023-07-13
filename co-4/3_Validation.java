//Authenticate the user name and password.
import java.util.Scanner;
class InvalidUser extends Exception{
    InvalidUser(String m){
        super(m);
    }
}
class UserValidate{
    String Username="fathimashereen";
    String Password="fs123";
    void Validate(String un,String pw) throws InvalidUser{
            if((un.equals(Username))&&(pw.equals(Password))){
                System.out.println("Login Successfull");
            }
            else{
                throw new InvalidUser("Invalid Credentials");
            }
    }
}
class User{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        try{
            UserValidate uv=new UserValidate();
            System.out.println("Enter Username:");
            String u=sc.next();
            System.out.println("Enter Password:");
            String pw=sc.next();
            uv.Validate(u, pw);
            System.out.println("Welcome!");
        }
        catch(Exception e){
            System.out.println("Exception---"+e);
        }        
    }
}