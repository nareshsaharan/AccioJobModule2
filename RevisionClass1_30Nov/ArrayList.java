class ArrayList {
    
    int arr[];
    int currInd = -1;
    
    ArrayList() {
        arr = new int[2];
    }
    
    
    public void add(int x) {
        
        if(size() - 1 == currInd) {
            resize();
        }
        
        currInd++;
        arr[currInd] = x;
    }
    
    public int get(int idx) {
        
        if(currInd < idx || idx < 0) {
            System.out.println("Not possible");
            return -1;
        }
        
        return arr[idx];
    }
    
    public void set(int idx, int val) {
        
        if(currInd < idx || idx < 0) {
            System.out.println("Not possible");
            return ;
        }
        
        arr[idx] = val;
    }
    
    public void remove(int idx) {
        
        if(currInd < idx || idx < 0) {
            System.out.println("Not possible");
            return ;
        }
        
        for(int i = idx; i < size() - 1; i++) {
            arr[i] = arr[i + 1];
        }
        currInd--;
    }
    
    
    
    public void resize() {
        int newArr[] = new int[arr.length * 2];
        
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    
    
    public int size() {
        return currInd + 1;
    }
    
    public String toString() {
        
        String curr = "";
        for(int i = 0; i < size(); i++) {
            curr += arr[i]+" ";
        }
        
        return curr;
    }
}

public class MyClass {
    public static void main(String args[]) {
      
      
      ArrayList al = new ArrayList();
      al.add(1);
      al.add(2);
      al.add(3);
      al.add(4);
      al.add(5);
      
      System.out.println(al);
      
      al.set(10, 10);
      
      System.out.println(al);
      
      System.out.println(al.get(3));
      
      al.remove(0);
      
      System.out.println(al);
      
      System.out.println(al.size());
      
      
    }
}
