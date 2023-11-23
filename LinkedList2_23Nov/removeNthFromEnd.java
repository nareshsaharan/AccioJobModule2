static int lenOfLL(Node head) {
        
            int cnt = 0;
            while(head != null) {
                cnt++;
                head = head.next;
            }

        return cnt;
        
    }
    
    public static Node removeNthFromEnd(Node head, int n) {

        int len = lenOfLL(head);
        int pos = len -  n;

        if(pos == 0) {
            return head.next;
        }else {
            Node prev = null;
            Node curr = head;

            while(pos > 0) {
                prev = curr;
                curr = curr.next;
                pos--;
            }

            prev.next = curr.next;
            return head;
        }
    
}

