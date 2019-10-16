import java.util.*; 


class Calculator2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            boolean wrong  = false;
            String num1 = input.next();
            if(isNumber(num1)) {
                System.out.println("Wrong input = " + num1);
                wrong = true;
            }
            char op = input.next().charAt(0);
            String num2 = input.next();
            if(isNumber(num2)) {
                System.out.println("Wrong input = " + num2);
                wrong = true;
            }
            if(wrong == false )
                get_result(Double.parseDouble(num1), op, Double.parseDouble(num2));
            //System.out.println("Press 0 to exit");
            // int next = input.nextInt();
            // if( next == 0) {
            //     continueInput = false;
            // } 

        } while ( continueInput );
        
    }
    public static void get_result(double a, char op ,double b) {
        double result = 0;
        switch(op) {
            case '+' :
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*' :
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
        }
        System.out.println(result);
    }

    public static boolean isNumber(String s) 
    {   
        char char_arr[] = s.toCharArray();
        for(char x : char_arr) {
            if( x < 48 && x > 57) {
                return false;
            }
        }
        return true; 
    } 

}