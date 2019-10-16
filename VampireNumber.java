import jdk.javadoc.internal.tool.Start;

class VampireNumber {
    public static void main(String[] args){
        int i,j;
        int[] digits=new int[4];
        for(i=1000;i<10000;i++)
        {
            for(j=0;j<4;j++)
            {
                digits[j]=(int) ((i/Math.pow(10,j))%10);
            }
            
            if(checkVampireNo(i,digits))
                System.out.println(i);
        }
    }
    public static boolean checkVampireNo(int x, int[] digit) {
        int i,j,k,l;
        for(i=0;i<4;i++)
            for(j=0;j<4;j++)
                if(j!=i)
                    for(k=0;k<4;k++)
                        if(k!=j&&k!=i)
                            for(l=0;l<4;l++)
                                if((l!=k&&l!=j&&l!=i)&&!(digit[j]==0&&digit[l]==0))
                                    if(x==(digit[i]*10+digit[j])*(digit[k]*10+digit[l]))
                                        return true;
        return false;
    }
    
}