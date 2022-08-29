import java.util.Scanner;

public class string1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String z = "manish";           //  direct string
        System.out.println(z);           

        String b = new String("manish");        //  string as a class
        System.out.println(b);

        String a = sc.nextLine();                      //  input string
        System.out.println(a);

        int p = 100;
        float q = 123.123456780f;
        System.out.printf("the valur of p and q is: %d and %f",p ,q);

        sc.close();
    }
}