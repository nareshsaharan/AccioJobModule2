class A {
    
    //A(){}
    int y = 20;
    A(int x) {
        System.out.println("A");
    }
    
    void fun() {
        System.out.println("fun");
    }
}

class B extends A {
    
    B() {
        super(10);
        System.out.println("B "+ super.y);
        super.fun();
    }
}

class C extends B {
    
    C() {
        System.out.println("C");
    }
}
// B obj = new B();
public class MyClass {
    public static void main(String args[]) {
        C obj = new C();
    }
}
