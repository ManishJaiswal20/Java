import java.util.Scanner;
public class methodoverloading{
    static void joke(){
        System.out.println("i invented a word\n"+"plagerusim");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        joke();

        sc.close();
    }
}
