import java.util.*; 


class Calculator
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                double num1 = input.nextInt();
                char op = input.next().charAt(0);
                double num2 = input.nextInt();
                get_result(num1, op, num2);
            }catch( InputMismatchException ime) {
                System.out.println("Wrong input");
                input.nextLine();
            }
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

}