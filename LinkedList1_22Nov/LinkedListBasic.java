class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
    }
}

public class MyClass {
    
    // find length of ll
    static int lenOfLL(Node head) {
        int cnt = 0;
        
        while(head != null) {
            cnt++;
            head = head.next;
        }
        
        return cnt;
        
    }
    
    static void printLL(Node head) {
        
        while(head != null) {
            
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
    
    public static void main(String args[]) {
      
      Node one = new Node(1);
      Node two = new Node(2);
      Node three = new Node(3);
      
      one.next = two;
      two.next = three;
      
      printLL(one);
      System.out.println(lenOfLL(one));
      
      //System.out.println(two.data +" "+two.next);
      
      //System.out.println(one.data +" "+one.next.data+" "+one.next.next.data);
      //System.out.println(one.next.next.next.data);
      
    }
}
