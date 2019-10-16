import java.util.Random; 

import java.util.Scanner; 

class CoinToss
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numofheads = 0;
        int numoftails = 0;
        while(n>0)
        {
            if(flip())
                numofheads++;
            else
                numoftails++;
            n--;
        }
        input.close();
        System.out.println("Heads :" +numofheads + "Tails :" + numoftails);
    }
    public static boolean flip()
    {
        Random rand = new Random();
        int random = rand.nextInt(2);
        if(random==1)
            return true;
        else
            return false;

    }
}