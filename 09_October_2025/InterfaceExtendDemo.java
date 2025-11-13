/*
Can an interface extend more than one interface?
 */
package On0910;

// First interface
interface A {
    void methodA();
}

// Second interface
interface B {
    void methodB();
}

// Interface extending more than one interface
interface C extends A, B {
    void methodC();
}

// Class implementing interface C (and indirectly A and B)
class MyClass implements C {
    @Override
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from interface B");
    }

    @Override
    public void methodC() {
        System.out.println("Method C from interface C");
    }
}

public class InterfaceExtendDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}

