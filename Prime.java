
public class Prime{
    public static void main(String args[]){
        get_prime(100);
    }
    public static void get_prime(int num){
        int i,j;
        for(i =2;i<=num;i++){
            for(j = 2;j<num;j++){
                if(i%j==0)
                    break;
            }
            if(j==i)
            System.out.println(i +  " ");
        }
    }
}