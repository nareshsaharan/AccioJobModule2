
class Pair {
    String name;
    double avgMarks;
    
    Pair(String name, double avgMarks) {
        this.name = name;
        this.avgMarks = avgMarks;
    }
}

class Student {
    String name;
    int math, english, science;
    
    Student(String name, int math, int english, int science) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.science = science;
    }
}



public class MyClass {
    
    // static Pair findMinMax(int arr[]) {
        
    //     Pair p = new Pair(arr[0], arr[0]); 
        
    //     for(int i = 1; i < arr.length; i++) {
            
    //         if(arr[i] < p.min) {
    //             p.min = arr[i];
    //         }
            
    //         if(arr[i] > p.max) {
    //             p.max = arr[i];
    //         }
    //     }
        
    //     return p;
        
        
    // }
    
    
    static Pair findAvg(Student s) {
        
        double avg = (s.math + s.english + s.science) / 3.0;
        
        return new Pair(s.name, avg);
        
    }
    
    public static void main(String args[]) {
        
        
        Student s1 = new Student("Amol", 30, 50, 70);
        Student s2 = new Student("Naveen", 50, 30, 60);
        Student s3 = new Student("Radhika", 90, 95, 85);
        
        Pair ans = findAvg(s3);
        System.out.println(ans.name +" : "+ans.avgMarks);
        // int arr[] = {4, 7, 9, 1, 3};
        
        // Pair ans = findMinMax(arr);
        
        // System.out.println(ans.min +" "+ans.max);
        
      
    }
}
