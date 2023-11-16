
class Stu {
    
    static int x=1;
    int y = 1;
    
    static {
        x = 10;
    }
    
    
    static void fun() {
        System.out.println("Hello");
    }
    
}

public class MyClass {
    
    int x = 1;
    
    public void fun() {
        System.out.println("hello");
    }
    
    public static void main(String args[]) {
        
        MyClass myObj = new MyClass();
        myObj.fun();
        
        System.out.println(myObj.x);
    }
}
