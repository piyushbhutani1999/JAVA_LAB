
import java.util.Scanner; 

class ConvertString
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        char[] upString = stringConversion(inputString);
        System.out.println(upString);
        input.close();
    }
    public static char[] stringConversion(String str)
    {
        int len = str.length();
        int ascii;
        char[] myStrChars = str.toCharArray();
        int i = 0;
        while(i<len)
        {
            if(myStrChars[i]>=97 && myStrChars[i]<=122)
            {   
                ascii = myStrChars[i];
                myStrChars[i]=(char)(ascii-32);
            }
            i++;
        }
        return myStrChars;
    }

}