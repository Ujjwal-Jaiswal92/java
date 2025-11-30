


public class printAscen {
    public static int print(int n)
{
    if(n>5){
        return 0;

    }
    System.out.println(n);
    return print(n+1);
    
}
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
}
