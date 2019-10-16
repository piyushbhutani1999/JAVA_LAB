
class OverloadinMainMethod{

    public static void main(String[] args) {
        main(1);
        main(3.4);
        main();
    }

    public static void main(int a) {
        System.out.println("First main is called" + a);
    }

    public static void main() {
        System.out.println("Second main is called");
    }

    public static void main(double a) {
        System.out.println("Third main is called" + a);
    }
}
