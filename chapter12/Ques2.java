import java.util.*;

public class Ques1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            try{
                int num1 = input.nextInt();
                char op = input.next().charAt(0);
                int num2 = input.nextInt();

                int result=0;
                switch(op)
                {
                    case '+':
                        result= num1 + num2;
                        break;
                    case '-':
                        result= num1 - num2;
                        break;
                    case '*':
                        result=num1 * num2;
                        break;
                    case '/':
                        result=num1/num2;
                }
                System.out.println("result is: " + result);
            }catch(Exception e)
            {
                System.out.println("error in input "+ e);
                e.fillInStackTrace();
                input.next();
            }
        }
    }
}