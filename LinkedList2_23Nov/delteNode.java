public static void remove(LinkedList ll, int toRemove){
        Node head = ll.head;

        if(toRemove == 0) {
            ll.head = ll.head.next;
        }
        else {

            Node prev = null;
            Node curr = head;

            while(toRemove > 0) {
                prev = curr;
                curr = curr.next;
                toRemove--;
            }

            prev.next = curr.next;
            
        }
        
    }
