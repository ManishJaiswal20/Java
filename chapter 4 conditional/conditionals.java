import java.util.Scanner;
public class conditionals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("                               driving age checker");
        System.out.print("enter your age: ");
        int age = sc.nextInt();
        if (age<18){
            System.out.println("you cannot drive!");
        }
        else{
            System.out.println("you can drive!");
        }


        
        sc.close();
    }
}