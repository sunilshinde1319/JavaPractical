package shinde;

interface A {
    void showA();
}

interface B {
    void showB();
}

// Class C implements both interfaces A and B
class C implements A, B {
    public void showA() {
        System.out.println("Method from interface A");
    }

    public void showB() {
        System.out.println("Method from interface B");
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}