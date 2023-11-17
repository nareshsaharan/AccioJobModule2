class A {
    
    void funA() {
        System.out.println("A");
    }
}

class B extends A {
    
    void funB() {
        System.out.println("B");
    }
}

class C extends B {
    
    void funC() {
        System.out.println("C");
    }
}

public class MyClass {
    public static void main(String args[]) {
        C obj = new C();
        obj.funA();
      
    }
}
