class Car {

    public void start() {
        System.out.println("Car started");
    }
}

class Program3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // accessible anywhere
    }
}
