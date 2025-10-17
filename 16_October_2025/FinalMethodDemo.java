/*
Exercise 13 - protected member variables
02) Write a class with final and non final method - override both the methods in a subclass ?
 */
package On1610;

class Base {
    final void showFinal() {
        System.out.println("This is a final method.");
    }
    void showNormal() {
        System.out.println("This is a non-final method.");
    }
}

class Derived extends Base {
    @Override
    void showNormal() {
        System.out.println("Overridden non-final method.");
    }
    /*
    void showFinal() { 
        System.out.println("Overridden Final method.");
    }
    */
    public static void main(String[] args) {
        Derived d = new Derived();
        d.showFinal();
        d.showNormal();
    }
}

