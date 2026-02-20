public class Program7 {

    public static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
