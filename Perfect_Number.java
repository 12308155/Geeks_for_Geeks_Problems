import java.util.*;

public class Perfect_Number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=n/2; i++)
        {
            if (n%i == 0 )
            {
                sum = sum+i;
            }
        }
        if(n == sum && n!=0)
        {
            System.out.println("It is a Perfect Number");
        }
        else{
            System.out.println("It is not a Perfect Number");
        }

        sc.close();
    }
    
}
