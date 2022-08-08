import java.util.Scanner;
public class TaskThree {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the row : ");
            int n=sc.nextInt();
            System.out.print("Enter the first Symbol : ");
            char a = sc.next().charAt(0);
            System.out.print("Enter the second Symbol : ");
            char b = sc.next().charAt(0);
            for(int i=1;i<=n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print(a);
                }

                for(int j=0;j<n+1-i;j++)
                {
                    System.out.print(b);
                }


                System.out.println();
            }
        }
    }

