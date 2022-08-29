import java.util.Scanner;
public class userinput_03 {
    public static void main(String[] args) {

        System.out.println("want to take input from user");
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the first no");
        // int a = sc.nextInt();                                         //sc.nextInt  it is used for taking integer
        // System.out.println("enter second no");  
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("the sum of two numbers is: "+ sum);

        
        System.out.println("enter a sentence to be displayed");                                                    
        String str = sc.nextLine();                        //sc.nextLine it is used to print the whole line as it is
        System.out.println(str);                           //sc.next it is used to read the first word which is written


        // System.out.println("enter no to check wether its int or not");
        // boolean b1 = sc.hasNextInt();                          //sc.hasNextInt it is used to check wether it is integer
        // System.out.println(b1);
        sc.close();
    }
    
}
