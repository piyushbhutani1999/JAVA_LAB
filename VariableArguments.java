import java.util.*;

class VariableArguments{
    public static void main( String args[]) {
        Scanner input = new Scanner(System.in);
        boolean check  = true;
        while (check) {
            int num = input.nextInt();
            System.out.println("Press 1 to enter no. and 0 to print");
            int store = input.nextInt();
            if (store == 1 ) check = true;
            else check = false;
        }
    }
}