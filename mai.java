import java.util.TreeSet;

public class mai  {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("orange");
        treeSet.add("apple"); // Duplicate, will not be added
        System.out.println(treeSet);
    }
}