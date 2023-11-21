class Test {
    
    final int x;
    // x = 20;
    Test(){
        this.x = 20;
    }
    
}

public class MyClass {
    public static void main(String args[]) {
        
        Test t = new Test();
        
        System.out.println(t.x);
      
    }
}
