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
   
   
//   public Student() {
//       System.out.println("hello");
//   }
   
    // public Student(int rollNum) {
    //   this.rollNum = rollNum;
    // }
   
//   public Student(int rollNum, String name) {
//       this.rollNum = rollNum;
//       this.name = name;
//   }
   
   
   
   // getter
   public int getRollNum() {
       return this.rollNum;
   } 
   
   // setter
   public void setRollNum(int rollNum) {
       if(rollNum <= 0) {
           return ;
       }
       
       this.rollNum = rollNum;
   }
   
}


public class MyClass {
    
    public static void main(String args[]) {
        
        Student s1 = new Student();
        //Student s2 = new Student();
        //Student s2 = new Student(1, "Rahul");
        
        //s2.rollNum = -10;
        // s2.name = "Naresh";
        
        // s2.setRollNum(-20);
        
        //System.out.println(s2.getRollNum());
        
        
        
    }
}
