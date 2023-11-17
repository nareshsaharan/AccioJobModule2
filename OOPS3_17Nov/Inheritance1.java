class A {
    
    private void display() {
        System.out.println("A");
    }
}

class B extends A {
    
    void fun() {
        System.out.println("B");
    }
}

public class MyClass {
    public static void main(String args[]) {
        B obj = new B();
        obj.display();
      
    }
}
