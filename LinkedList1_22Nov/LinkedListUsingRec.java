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
    
    static void printLLUsingRec(Node head) {
        
        if(head == null) {
            return ;
        }
        
        System.out.print(head.data +" ");
        printLLUsingRec(head.next);
        
    }
    
    static int lengthOfLLUsingRec(Node head) {
        
        if(head == null) {
            return 0;
        }
        
        int recAns = lengthOfLLUsingRec(head.next);
        return 1 + recAns;
    }
    
    // Approch 2
    static void helper(Node head, int len) {
        
        if(head == null) {
            System.out.println(len);
            return;
        }
        
        helper(head.next, len + 1);
    }
    
    
    public static void main(String args[]) {
      
      Node one = new Node(1);
      Node two = new Node(2);
      Node three = new Node(3);
      
      one.next = two;
      two.next = three;
      
    //   printLL(one);
    //   System.out.println(lenOfLL(one));
    //printLLUsingRec(one);
    System.out.println(lengthOfLLUsingRec(one));
      
      //System.out.println(two.data +" "+two.next);
      
      //System.out.println(one.data +" "+one.next.data+" "+one.next.next.data);
      //System.out.println(one.next.next.next.data);
      
    }
}
