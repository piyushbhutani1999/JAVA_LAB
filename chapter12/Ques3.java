import java.util.*;

public class Ques3{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr= new int[120];
        boolean check = true;
        for(int i=0;i<120;i++)
        {
            arr[i]=Math.round((float)Math.random()*1000);
        }
        while(check) {
            try{
                int index;
                System.out.println("Enter the guess index");
                index = input.nextInt();
                int k = arr[index];
                System.out.println("Your GUess is right");
                check = false;
            }catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Out of Bound");
            }
        }
    
    }
}