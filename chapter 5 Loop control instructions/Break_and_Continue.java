import java.util.Scanner;
public class Break_and_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Break And Continue using loops


        System.out.print("enter no = ");
        int i = sc.nextInt();
        for(int a =1;a<=i;a++){
            System.out.println(a);
            System.out.println("hello world");
            if(a==3){
                System.out.println("loop end");
                break;
            }
        }

        // System.out.print("enter the no = ");
        // int a = sc.nextInt();
        // for(int i=1;a>=i;a--){
        //     if(a==5){
        //         System.out.println("This no will not be printed bcs continue is been used");
        //         continue;
        //     }
        //     System.out.println(a);
        //     System.out.println("Manish jaiswal");
            
        // }
    
        sc.close();
    }
    
}
