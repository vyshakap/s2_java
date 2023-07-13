import java.util.Scanner;
class StringManipulation{
    public static void main(String args[]){
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.next();
        System.out.println("Character at 3rd position is:"+str.charAt(3));
        System.out.println("Sub strings from 5th position:"+str.substring(5));
        System.out.println("Index of 'A':"+str.indexOf("A"));
        String str1="@@@";
        String str2="***";
        System.out.println("Concatenation using +:");
        System.out.println(str+str1);
        System.out.println("Concatenation using concat function:");
        System.out.println(str.concat(str2));
        System.out.println(str+" in Upper case:"+str.toUpperCase());
        System.out.println(str+" in Lower case:"+str.toLowerCase()); 
    }
}