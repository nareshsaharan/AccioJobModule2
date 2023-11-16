class Dog {
    
    String name;
    String color;
    double price;
    
    
    
    
    public String getName() {
        return this.name;
    }
    
    public void setName() {
        this.name = name;
    }
    
    
    
}


class Student {
    
   private int rollNum = 10;
   String name;
   
   Student() {
       System.out.println(" this: " + this);
   }
   
}

public class MyClass {
    
    public static void main(String args[]) {
        
        // using s1
        Student s1 = new Student();
        System.out.println(" s1: " + s1);
        
        System.out.println("**************************");
        
        Student s2 = new Student();
        System.out.println(" s2: " + s2);
        
    
        
    }
}
