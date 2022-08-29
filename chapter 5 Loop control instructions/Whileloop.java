import java.util.Scanner;
// Just to write any thing and checking the git command 
public class Whileloop{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("without using loops");
     System.out.println("1");
     System.out.println("2");
     System.out.println("3");
     System.out.println("4");
     System.out.println("5");
     System.out.println("6");
     System.out.println("7");
     System.out.println("8");
     System.out.println("9");

     System.out.println("with using while loops");
     int i = 0;
     while(i<=9){
      System.out.println(i);
      i++; 
     }


     System.out.println("To print no's from 100-200");
     int a = 100;
     while(a<=200){
        System.out.println(a);
        a++;
     }
     sc.close();
  }
}