
class A {

    public void show1() {
        System.out.println("Show1 from A");
    }
}

class B extends A {

    public void show2() {
        System.out.println("Show2 from B");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show1(); // Calls method from class A
    }
}
