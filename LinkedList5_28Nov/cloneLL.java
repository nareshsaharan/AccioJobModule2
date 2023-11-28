Node copyList(Node head) {

        Node head1 = head;
        
        Node head2 = null;
        Node tail2 = null;

        while(head1 != null) {
            
            if(head2 == null) {
                head2 = new Node(head1.data);
                tail2 = head2;
            }
            else {
                tail2.next = new Node(head1.data);
                tail2 = tail2.next;
            }
            
            head1 = head1.next;
        }


        Node temp1 = head;
        Node temp2 = head2;

        while(temp1 != null) {
            
            Node random = temp1.random;
            if(random == null) {
                temp1 = temp1.next;
                temp2 = temp2.next;
                continue;
            }

            Node h1 = head;
            Node h2 = head2;

            while(h1 != null) {

                if(h1 == random) {
                    temp2.random = h2;
                    break;
                }

                h1 = h1.next;
                h2 = h2.next;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        
        return head2;



        
        
        
    }
