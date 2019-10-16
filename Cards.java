import java.util.Random; 

class Cards
{
    public static void main(String args[])
    {   
        int sum = 0,numofsuccess = 0;
        while(sum!=24)
        {
            sum = pick_cards();
            numofsuccess++;
        }
        System.out.println("No of picks require to get sum 24 is :" + numofsuccess);
    }
    public static int pick_cards()
    {   
        int i=4;
        int output;
        int sum = 0;
        while(i>0)
        {
            Random rand = new Random();
            output =rand.nextInt(14);
            while(output==0)
                output =rand.nextInt(14);
            sum = sum + output;
            i--;
        }
        System.out.println("Sum :" + sum);
        return sum;
    }

}