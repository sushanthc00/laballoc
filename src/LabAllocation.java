import java.util.*;

public class LabAllocation {

    public static void main(String[] args){

        int x,y,z,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capacity of first lab");
        x=sc.nextInt();
        System.out.println("Enter the capacity of second lab");
        y=sc.nextInt();
        System.out.println("Enter the capacity of third lab");
        z=sc.nextInt();
        System.out.println("Enter the number of students in the class");
        n=sc.nextInt();

        if(n<x){
            System.out.println("Assign Lab 01");
        }
        if(n>x && n<y){
            System.out.println("Assign Lab 02");
        }
        if(n<z && n>x && n>y){
            System.out.println("Assign Lab 03");
        }
    }
}
