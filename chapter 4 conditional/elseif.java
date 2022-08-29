import java.util.Scanner;
public class elseif {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your age");
    int age = sc.nextInt();
    
   //  switch(age) {
      //   case 18:
      //   System.out.println("you are going to become an adult");
      //   break;
      //   case 10: 
      //   System.out.println("you are a child");
      //   break;                                                            // normal switch
      //   case 56:
      //   System.out.println("you are an adult");
      //   break;
    //     default:
    //     System.out.println("be happy with your age");

   //  } 

    // switch(age){
    //   case 18 -> System.out.println("you are a student");
    //   case 22 -> System.out.println("you are eligible for experience");        // enhanced switch
    //   case 56 -> System.out.println("you are experienced");
    //   default -> System.out.println("live your life free");
    // }
    
    
    // int age = sc.nextInt();
    // if(age>45){
    //     System.out.println("is experienced");
    //     } 
    //     else if(age>30){
    //       System.out.println("is less experienced");
    //     }
    //     else if(age>24){
    //         System.out.println("a new commer");
    //     }
    //     else if(age>15 && age<20){
    //         System.out.println("you are a student");
    //     }
    //     else{
    //     System.out.println(" you are a child ");
    //     }

      
    sc.close();
   }
}
