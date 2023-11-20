class Test {
    
    final int x = 10;
    
}

public class MyClass {
    public static void main(String args[]) {
        
        Test t = new Test();
        t.x = 20;
        
        System.out.println(t.x);
      
    }
}
