
class Pair {
    int min,max;
    
    Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}



public class MyClass {
    
    static Pair findMinMax(int arr[]) {
        
        Pair p = new Pair(arr[0], arr[0]); 
        
        for(int i = 1; i < arr.length; i++) {
            
            if(arr[i] < p.min) {
                p.min = arr[i];
            }
            
            if(arr[i] > p.max) {
                p.max = arr[i];
            }
        }
        
        return p;
        
        
    }
    
    public static void main(String args[]) {
        
        int arr[] = {4, 7, 9, 1, 3};
        
        Pair ans = findMinMax(arr);
        
        System.out.println(ans.min +" "+ans.max);
        
      
    }
}
