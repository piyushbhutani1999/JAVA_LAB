import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        int i,j = 0;
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        
        System.out.println("Enter 5 numbers between 10 to 100");
        for(i=0;i<5;i++)
        {
            arr[j] = input.nextInt();
            if(i == 0)
                j++;
            if(search(arr,arr[j],j) == -1 && i >= 1)
                j++;
        }        
        for(i=0;i<j;i++)
            System.out.println(arr[i]);
        input.close();
    }
    static public int search(int arr[],int val,int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(val == arr[i])
                return 1;
        }
        return -1;
    }
    

}