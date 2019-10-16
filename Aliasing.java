
public class Aliasing{

    private float num;

    Aliasing(float b){
        this.num = b;
    }
    public static void main(String args[]){
        Aliasing obj1 = new Aliasing(5);
        Aliasing obj2 = new Aliasing(10);
        Aliasing obj3 = obj1;
        System.out.println("obj3 and obj 1 : " + obj3.num +" "+obj1.num  );
        obj3 = obj2;
        obj3.num = 3;
        System.out.println("obj3 and obj 2 : " +  obj3.num + " " + obj2.num);
    }
}