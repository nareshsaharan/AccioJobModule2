static Node merge(Node x, Node y){
       Node ans = null;
       Node temp = null;

      while ( x != null && y != null) {
            if(x.data < y.data) {

                if(ans == null) {
                    ans = x;
                    temp = ans;
                }else 
                {
                    temp.next = x;
                    temp = temp.next;
                }

                x = x.next;
            }else 
            {
                    if(ans == null) {
                        ans = y;
                        temp = ans;
                    }else 
                    {
                        temp.next = y;
                        temp = temp.next;
                    }
    
                    y = y.next;
            }
      }

     if(x != null) {
         temp.next = x;
     }else {
         temp.next = y;
     }

     return ans;
     
     
    }

    static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    public static Node mergesort(Node head){

        if(head == null || head.next == null) {
            return head;
        }

        // find mid

        Node mid = findMid(head);
        Node temp = mid.next;
        mid.next = null;
        
        Node head1 = mergesort(head);
        Node head2 = mergesort(temp);

        return merge(head1, head2);
        
        

    }
}
