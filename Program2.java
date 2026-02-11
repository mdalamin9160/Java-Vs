class A {
    static void  m1() {
        System.out.println("A m1");
    }
}
class B {
    static void m1() {
        System.out.println("B m1");
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println("Test Main");
        A.m1();
        B.m1();
    }
}
