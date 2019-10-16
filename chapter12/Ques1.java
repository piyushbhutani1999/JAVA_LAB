import java.util.*;

public class Ques1{
    public static void main(String[] args) {

        try{
            int num1 = Integer.parseInt(args[0]);
            String op =args[1];
            int num2 = Integer.parseInt(args[2]);

            int result=0;
            switch(op)
            {
                case "+":
                    result= num1 + num2;
                    break;
                case "-":
                    result= num1 - num2;
                    break;
                case "*":
                    result=num1 * num2;
                    break;
                case "/":
                    result=num1/num2;
            }
            System.out.println( "RESULT : " + result);
        }catch(Exception e)
        {
            System.out.println("error in input "+ e);
            e.fillInStackTrace();
        }

    }
}