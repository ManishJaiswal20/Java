import java.util.Scanner;
public class Q_conditionals {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        //  # problem 1 

        // not a correct problem error in problem

        // # problem 2
        // System.out.println("enter the marks of which paper is been conducted(one paper)");
        // double conductmarks = sc.nextDouble();
        // System.out.println("enter the scored marks of paper 1");
        // double a1 = sc.nextDouble();
        // System.out.println("enter the scored marks of paper 2");
        // double a2 = sc.nextDouble();
        // System.out.println("enter the scored marks of paper 3");
        // double a3 = sc.nextDouble();
        // double a1t = (a1/conductmarks)*100;
        // System.out.println("percentage of subject 1 is = " + a1t);
        // double a2t = (a2/conductmarks)*100;
        // System.out.println("percentage of subject 2 is = " + a2t);
        // double a3t = (a3/conductmarks)*100;
        // System.out.println("percentage of subject 3 is = " + a3t);
        // double percentagetotal = (((a1+a2+a3)/(conductmarks*3))*100);
        // System.out.println("your total percentage = " + percentagetotal);

        // if (percentagetotal>=40 && a1t>=33 && a2t>=33 && a3t>=33){
        //     System.out.println("you are passed");
        // }
        // else{
        //     System.out.println("you are fail");
        // }
        
        // # problem 3
        
        //   double tax = 0;
        //   System.out.println("enter your income for the year ");
        //   double income = sc.nextDouble();
        //   if (income<=2.5){
        //     System.out.println("you tax = "+ tax);          
        //   }
        //   else if(income>2.5 && income<=5.0){
        //    tax = 0.05*(income-2.5);
        //    System.out.println("you tax = "+ tax);
        //   }
        //   else if(income>5.0 && income<=10.0){
        //     tax = 0.05*(5.0-2.5);
        //     tax = tax + 0.2 * (income-5.0);
        //     System.out.println("you tax = "+ tax);
        //   }
        //   else if(income>10){
        //     tax = 0.05*(5.0-2.5);
        //     tax = tax + 0.2 * (10.0-5.0);
        //     tax = tax + 0.3 * (income-10.0);
        //     System.out.println("you tax = "+ tax);
        //   }

        // # problem 4

        // System.out.println("enter the number");
        // int a = sc.nextInt();
        // switch(a){
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");
        // default-> System.out.println("its your death day");
        // }

        // # problem 5

        // System.out.print("Enter the year you want to check = ");
        // double year = sc.nextInt();
        // if(year%4 == 0){
        //  System.out.println("Its a leap year");
        // }
        // else if(year%4 != 0){
        //     System.out.println("It is not a leap year");
        // }

        // # problem 6

        System.out.println("                             WEBSITE TYPE CHECKER");
        System.out.print("Enter the website you want to check = ");
        String a = sc.nextLine();
        boolean b;
        if(b = a.endsWith(".com")){
            System.out.println("it is a Comecial website");
        }
        else if(b = a.endsWith(".org")){
            System.out.println("it is a Organization website");
        }
        else if(b = a.endsWith(".in")){
            System.out.println("it is a Indian website");
        }
        else {
            System.out.println("not in our system");
        }
         sc.close();
    }
}
