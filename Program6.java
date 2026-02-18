class Person {

    private String name;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }
}

public class Program6 {
    public static void main(String[] args) {

        Person p = new Person();

        // p.name = "Ali"; ❌ ERROR (private)

        p.setName("Ali");
        System.out.println(p.getName());
    }
}
