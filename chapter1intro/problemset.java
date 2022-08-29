import java.util.Scanner;
public class problemset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // q1
        System.out.println("enter your name: ");
        String a = sc.nextLine();
        System.out.println("hello "+a+" have a good day");
        
        // q2
        System.out.println("enter the no you want to convert from km to miles: ");
        double b = sc.nextFloat();
        double miles = b*0.62137 ;
        System.out.println("km is converted to miles: "+ miles);
        
        // q3
        System.out.println("enter the no you want to check wether its int or not: ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();

    }
    
}
