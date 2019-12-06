
import java.util.Scanner;


public class Highest_Prime_Factor 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int flag=0;
            int num=n/1;
            for(int j=2;j<=num/2;j++)
            {
                if(num%j==0)
                    flag=1;
            }
            if(flag==0 && n%num==0)
            {
                System.out.println(num);
                break;
            }
        }
    }
}
