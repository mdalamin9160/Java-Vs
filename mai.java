interface m {
    void show();
}
public class mai {
    public static void main(String[] args) {
        m my = () -> {
            System.out.println("Hello World");
        };
        my.show();
    }
}