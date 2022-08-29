import java.util.Scanner;

// we can use 2 types of methods static method or object invocation method
// in both of these methods static method is been made and can be used in any static metods
// where as in object creation no ststic method is been used and a new object is been created when and where required

public class callingmethod{

    // int addition(int a,int b){    // object method 
    // int c;
    // c=a+b;
    // return c;
    // }

    // public static void main(String []args){
    // Scanner sc= new Scanner(System.in);
    // callingmethod obj1 = new callingmethod();
    //     int a1=10;
    //     int b1=2;
    //     int c1;
    //     c1=obj1.addition(a1,b1);
    //     System.out.println(c1);

    static int addition(int a,int b){    // static method 
        int c;
        c=a+b;
        return c;
        }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
            int a1=10;
            int b1=2;
            int c1=addition(a1,b1);
            System.out.println(c1);



    sc.close();
    }

}