
class Stu {
    
    
    
}

public class MyClass {
    // block
    {
        System.out.println("b");
    }  
    
    // static block
    static {
        System.out.println("s");
    }

    
    MyClass() {
        System.out.println("c");
    }
    
    public static void main(String args[]) {
        
        MyClass myObj = new MyClass();
        System.out.println("m");
    }
}
