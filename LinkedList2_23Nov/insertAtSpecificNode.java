static Node insert(Node head, int n, int pos, int val) {

        Node prev = null;
        Node curr = head;
        
        int cnt = 0;
        while(cnt < pos) {
            prev = curr;
            curr = curr.next;
            cnt++;
        }

        Node newNode = new Node(val);

        if(pos == 0) {
            newNode.next = head;
            head = newNode;
        }else {
            prev.next = newNode;
            newNode.next = curr;
        }
        
        

        return head;
        
        
    }
