/*
Exercise 13 - protected member variables
01) Write a class that has both protected and public member, inherit it another class and demonstrate which can be accesed directly? 
 */
package On1610;

class Parent {
    protected int protectedVar = 10;
    public int publicVar = 20;
}

class Child extends Parent {
    void display() {
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

