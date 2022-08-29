import java.rmi.StubNotFoundException;
import java.util.Scanner;
public class problemset{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        
        /* 
        // # problem 1
         float [] sums ={1.2f,2.3f,44.3f,2.4f,6.7f};
        float we=0;
        for(float mof:sums){
            we = we + mof ;
        }
        System.out.println(we);
        
        // # problem 2

        int [] sums ={1,2,44,2,6};
        int numcheck=44;
        boolean isinarray = false;
        for(int element:sums){
           if(numcheck==element){
            isinarray=true;
            break;
           } 
        }
         if(isinarray==true){
            System.out.println("the no is present");
        }
            else{
                System.out.println("the no is not present");
            }
        
            

        // # problem 3

        float [] physics = {22.5f,33.5f,45f,28.5f,36.5f};
        float marks =0;
        int i;
        for(float element:physics){
            marks = marks+element;
            
            
            System.out.println("marks of each student 1-5 "+ element);
            
        }
        System.out.println("total marks of all the students"+marks/5);
        

        // # problem 4 : addition of 2 matrix

        int [][]matrix1 = {{1,3,5}, {2,4,7}};
        int [][]matrix2 = {{2,4,6}, {3,5,1}};
        int [][]result =  {{0,0,0}, {0,0,0}};
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                System.out.print(matrix1[i][j]+matrix2[i][j]+"\t");
            }
            System.out.println(" ");
        }
        

        // # problem 5 : reverse of an array

        int [] reverse = {1,2,3,4,5,6,7,8,9};
        System.out.println("the reverse ofthe array is :");
        for(int i=reverse.length-1;i>=0;i--){
            System.out.print(reverse[i]+"  ");
        }
        

        // # problem 6 : to find the max from the array

        int [] a = {1,2,3,4,5,6,7,8,9};
        int max=0;
        for(int e:a){
            if(e>max){
            max=e;
            }
        }
        System.out.println(max);
        

        // # problem 7 : to find the min from the array

        int [] a = {0,2,3,4,5,6,7,8,1000};
        int max=0;
        for(int e:a){
            if(e>max){
                max=e;
            }
        }
        System.out.println(max);

        int valve=max;
        int min=valve;
        for(int xa:a){
            if(xa<min){
                min=xa;
            }
        }
            System.out.println(min);
        

        // # problem 8 :    

        int [] a = {0,2,3,4,5,6,7,8,1};
        boolean isnotsorted = false;
        for(int i=0;i<a.length;i++){
            if(a[i]>a[i+1]){
                isnotsorted=true;
                break;
            }
        }
        if(isnotsorted){
            System.out.println("array is not sorted");
        }
        else{
            System.out.println("array is sorted");
        }
        */


        sc.close();
    }
}