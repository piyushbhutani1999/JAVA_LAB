import java.util.*;

public class temp {
    public static void main(String args[]) {
        // try {
        //     Scanner input = new Scanner(System.in);
        //     int a = input.nextInt();
        // }catch(Exception ex) {
        //     System.out.println("EXCEPTION");
        // }catch(InputMismatchException ex) {
        //     System.out.println("INPUT MISMATC");
        // }
        try {
            int[] arr = {1, 2 ,3};
            int k = arr[4];
        }
        catch(IllegalArgumentException ex) {
            System.out.println(ex);
        }
        finally {
            System.out.println("in final");
        }
        System.out.println("in main again");

    }
    // public static void m(int x) throws IllegalArgumentException{
    //     if(x < 40) {
    //         throw new IllegalArgumentException("value is small");
    //     }
    // }
}
