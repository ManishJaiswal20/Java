import java.util.Scanner;
public class Dowhileloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int a = 100;
        // do{
        //    System.out.println(a);
        //    a++;
        // }while(a<10);

        // # quick quiz  (to print n natural nos by taking the end no)

        System.out.print("enter the no till which youi want the natural no's = ");
        int c = sc.nextInt();
        int b = 1;
        do{
            System.out.print(b+" ");
            b++;
        }while(b<=c);




        sc.close();
    }  
}
