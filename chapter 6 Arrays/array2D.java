import java.util.Scanner;
public class array2D{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [][] students = new int[2][3];
        students[0][0]=100;
        students[0][1]=101;
        students[0][2]=102;
        students[1][0]=200;
        students[1][1]=201;
        students[1][2]=202;
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students[i].length;j++){
            System.out.print(students[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}