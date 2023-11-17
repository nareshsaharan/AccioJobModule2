class Parent {
    
    void fun() {
        System.out.println("P");
    }

}

class Child extends Parent {
    
    void fun() {
        System.out.println("C");
    }

}

public class MyClass {
    
    public static void main(String args[]) {
        
        Parent c = new Child();
        c.fun();
    }
}
