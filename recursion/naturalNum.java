import java.util.*;

public class naturalNum {
    public static int sumNum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else{
        return n+sumNum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();

        System.out.println(sumNum(n));
        input.close();
    }
    
}
