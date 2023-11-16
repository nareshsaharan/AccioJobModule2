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
    
   int a = 1;
   
   Student() {
       System.out.println("D");
   }
   
   Student(int x) {
       System.out.println("P");
       this(10);
   }
   
}

public class MyClass {
    
    public static void main(String args[]) {
        
        Student s = new Student(10);
        
    }
}
