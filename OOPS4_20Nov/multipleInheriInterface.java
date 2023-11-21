interface I1 {

    // abstract public 
    void fun();

}

interface I2 {

    // abstract public 
    void fun();

}

class B implements I1, I2 {
    
    public void fun() {
        System.out.println("A");
    }
}

public class MyClass {
    public static void main(String args[]) {
      
    }
}
