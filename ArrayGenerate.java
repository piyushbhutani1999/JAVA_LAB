import java.util.Random; 

import java.util.Scanner; 


class ArrayGenerate
{
    public static void main(String args[])
    {   
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] arr = array_generator(a,b);
        printArray(arr, a, b);
        int[] arrOfRowAndCol = get_number_of_one(arr,a,b);
        System.out.print("Rows: " + arrOfRowAndCol[0] + " Column:  " + arrOfRowAndCol[1]);
        input.close();
    }
    public static int[][] array_generator(int a, int b)
    {   
        int[][] arr = new int[a][b];
        Random rand = new Random();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j] = rand.nextInt(2);
            }
        }
        return arr;
    }
    public static void printArray(int[][] arr,int a, int b)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] get_number_of_one(int[][] arr, int a, int b)
    {   

        int count=0;
        int[] arrOfRowAndCol = new int[2];
        arrOfRowAndCol[0] = 0;
        arrOfRowAndCol[1] = 0;
        for(int i=0;i<a;i++)
        {   count = 0;
            for(int j=0;j<b;j++)
            {
                if(arr[i][j]==1)
                    count++;
            }
            if(count==b)
            arrOfRowAndCol[0]++;
        }
        for(int i=0;i<b;i++)
        {   
            count = 0;
            for(int j=0;j<a;j++)
            {
                if(arr[j][i]==1)
                    count++;
            }
            if(count==a)
            arrOfRowAndCol[1]++;
        }
        return arrOfRowAndCol;
    }
}