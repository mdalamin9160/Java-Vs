class Outer {

    class Inner {
        void display() {
            System.out.println("Inner class method");
        }
    }
}

class Test {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.display();
    }
}
