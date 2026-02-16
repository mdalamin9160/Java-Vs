class car {
    String color;
    void start() {
        System.out.println("Car is starting");
    }
}
public class Program6 {
    public static void main(String[] args) {
        car c1 = new car();
        c1.color = "Red";
        System.out.println("Car color: " + c1.color);
        c1.start();
    }
}