class Parent {
    int x = 2;
}

class Child extends Parent {
    
    int x = 4;
    int y = 3;
}

public class MyClass {
    
    public static void main(String args[]) {
        
        Parent c = new Child();
        System.out.println(c.x + c.y);
    }
}
