import java.util.*; 

public class calculator {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String ch="y";
        
        while(ch.equals("y")){
            
            System.out.println("enter any mathematical sing which u want to do");
            System.out.println("+ for addition");
            System.out.println("- for subtraction");
            System.out.println("* for multipliction");
            System.out.println("/ for division");
            System.out.println("% for remainder");
            String sign =sc.next();
            System.out.println("enter two numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            float result;
            if(sign.equals("+")){
                result=a+b;
            }
            else if(sign.equals("-")){
                result=a-b;

            }
            else if(sign.equals("*")){
                result=a*b;

            }
            else if(sign.equals("/")){
                result=a/b;

            }
            else if(sign.equals("%")){
                result=a%b;

            }
            else{
                result=1;
            }
            if(result==1){
                System.out.println("invalid input");
            }
            else{
                System.out.println("ur result is"+result );
            }
            System.out.println("do u want to do next sum");
            ch=sc.next();
            sc.close();
        }
    }
}     
    