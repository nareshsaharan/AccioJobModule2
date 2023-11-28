static Node rev(Node head) {

        Node curr = head;
        Node prev = null;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
        
    }
    
    static void unfold(Node head)
    {
        Node head1 = head;
        Node tail1 = head1;
        head = head.next;
        
        if(head == null) {
            System.out.print(head.data+" ");
            return ;
        }
            
        Node head2 = head;
        Node tail2 = head2;
        head  = head.next;
        
        int idx = 0;
        
        while(head != null) {
            
            if(idx % 2 == 0) {
                tail1.next = head;
                tail1 = tail1.next;
                
            }else {
                tail2.next = head;
                tail2 = tail2.next;
            }
            idx++;
            head = head.next;
        }
        
        tail1.next = null;
        tail2.next = null;
        
        
        head2 = rev(head2);

        tail1.next = head2;

        while(head1 != null) {
            System.out.print(head1.data+" ");
            head1 = head1.next;
        }
        

        
    }
}
