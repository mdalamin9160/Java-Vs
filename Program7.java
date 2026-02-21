class Student {
    String name;
    static String school = "ABC School";
    Student(String name){
        this.name = name;
    }
    void display(){
        System.out.println(name + " studies at " + school);
    }
}
public class Program7 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        s1.display();
        s2.display();
    }
}