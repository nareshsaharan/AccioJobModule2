public static DoublyLinkedList deleteNodeWithX(DoublyLinkedList linkedList, int x){

        Node head = linkedList.head;

        Node curr = head;
        Node prev = null;  
        
        while(curr != null) {
            
            if (curr.val == x) {
                // head
                if(curr == head) {
                    head = head.next;
                    curr = head;
                    prev = null;
                    continue;
                    
                }
                // last node
                else if(curr.next == null){
                    prev.next = null;
                    curr = null;
                    continue;
                }
                // in between
                else{
                    
                    prev.next = curr.next;
                    curr.next.prev = prev;
                    curr = curr.next;
                    continue;
                }
  
            }

            // not delete
            prev = curr;
            curr = curr.next;
            
        }
        
        linkedList.head = head;

        return linkedList;
        
        
    }
