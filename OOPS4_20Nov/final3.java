class Test {
    
    final int x;
    // x = 20;
    Test(){
        this.x = 20;
    }
    
    final void fun() {
        System.out.println("A");
    }
    
}

class B extends Test {
    
    // not possible
    void fun() {
        System.out.println("B");
    }
}

public class MyClass {
    public static void main(String args[]) {
        
        Test t = new Test();
        
        System.out.println(t.x);
      
    }
}
