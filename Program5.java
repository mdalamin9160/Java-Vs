class Array {
    public static void main(String[] args){
        int age = 20;
        boolean hasId = true;
        System.out.println(age > 18 && hasId);  // true
        System.out.println(age < 18 || hasId);  // true
        System.out.println(!hasId);             // false

    }
}