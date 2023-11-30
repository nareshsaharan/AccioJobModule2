Node swapkthnode(Node head, int num, int k)
    {
        int len = lenOfLL(head);
        int fromStart = Math.min(k, len - k + 1);
        int fromEnd = Math.max(k, len - k + 1);

        if(fromStart == fromEnd) {
            return head;
        }

        if(k == 1 || k == len) {


            Node curr = head;

            while(curr.next.next != null) {

                curr = curr.next;
            }

            curr.next.next = head.next;

            Node newHead = curr.next;

            curr.next = head;
            head.next = null;

            return newHead;
            
        }

        Node prev1 = null;
        Node curr1 = head;
        int cnt = 1;
        while(fromStart > 1) {
            prev1 = curr1;
            curr1 = curr1.next;
            fromStart--;
            cnt++;
        }
        
        prev1.next = curr1.next;

        Node prev2 = prev1;
        Node curr2 = prev2.next;
        fromEnd = fromEnd - cnt;

        while(fromEnd > 1) {
            prev2 = curr2;
            curr2 = curr2.next;
            fromEnd--;
        }

        prev2.next = curr1;
        curr1.next = curr2.next;

        Node temp = prev1.next; 

        prev1.next = curr2;
        curr2.next = temp;

        return head;
        
        
        
        // deletion
    }
