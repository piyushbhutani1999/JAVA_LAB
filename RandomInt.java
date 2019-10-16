import java.util.*;

class RandomInt {

    public static void main( String[] args) {
        get_infinte_numbers();
    }

    public static void get_infinte_numbers() {
        int temp;
        Random random = new Random();
        int random_int = random.nextInt(100);
        temp = random_int;
        while(true) {
            random_int = random.nextInt(100);
            if( temp > random_int) {
                System.out.println("Number Generated is smaller i.e " + "new no. = " + random_int+ " previous no. =  " +temp);
            } else if( temp == random_int) {
                System.out.println("Number Generated are same i.e "  + "new no. = " + random_int+ " previous no. =  " +temp);
            } else {
                System.out.println("Number Generated is larger i.e "  + "new no. = " + random_int+ " previous no. =  " +temp);
            }
            temp = random_int;
        }
    }

    public static void get_numbers() {
        int temp;
        Random random = new Random();
        int random_int = random.nextInt(100);
        temp = random_int;
        for( int i = 0; i < 25; i++) {
            random_int = random.nextInt(100);
            if( temp > random_int) {
                System.out.println("Number Generated is smaller i.e " + "new no. = " + random_int+ " previous no. =  " +temp);
            } else if( temp == random_int) {
                System.out.println("Number Generated are same i.e "  + "new no. = " + random_int+ " previous no. =  " +temp);
            } else {
                System.out.println("Number Generated is larger i.e "  + "new no. = " + random_int+ " previous no. =  " +temp);
            }
            temp = random_int;
        }
    }
}