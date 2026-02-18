enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY
}

public class Program6 {
    public static void main(String[] args) {

        Day today = Day.MONDAY;

        System.out.println(today);

        if (today == Day.WEDNESDAY) {
            System.out.println("Start of week");
        }
        else {
            System.out.println("Not start of week");
        }
    }
}
