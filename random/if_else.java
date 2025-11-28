import java.util.*;

public class if_else{
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are still a child");
        }
        sc.close();


    }

}