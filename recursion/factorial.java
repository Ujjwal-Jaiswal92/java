import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number to calculate factorial:");
        int n=input.nextInt();
        System.out.println("the factorial is "+fact(n));
        input.close();
    }
    
}
