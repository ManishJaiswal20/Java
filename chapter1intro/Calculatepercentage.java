import java.util.*;
public class Calculatepercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the total marks of 1 the paper");
        float t = sc.nextFloat();
        System.out.println("enter the marks obtained of first subject: ");
        float s1 = sc.nextFloat();
        System.out.println("enter the marks obtained of second subject: ");
        float s2 = sc.nextFloat();
        System.out.println("enter the marks obtained of third subject: ");
        float s3 = sc.nextFloat();
        System.out.println("enter the marks obtained of fourth subject: ");
        float s4 = sc.nextFloat();
        System.out.println("enter the marks obtained of fifth subject: ");
        float s5 = sc.nextFloat();

        float totalmarks = t*5;
        float total = s1+s2+s3+s4+s5;
        float avg = (total)/5;
        float percentage = ((total)/totalmarks)*100;

        System.out.println("total marks: "+total);
        System.out.println("avg marks is: "+avg);
        System.out.println("percentage: "+percentage);
        sc.close();
        }
}
