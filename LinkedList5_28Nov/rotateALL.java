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
    
    static void rotateRight(Node head, int n) {

        int len = lenOfLL(head);
        n = n % len;
        int k = len - n;

        if(k == 0) {
            printLL(head);
            return;
        }
        
        Node temp = head;
        while(k > 1) {
            temp = temp.next;
            k--;
        }

        Node newHead = temp.next;
        temp.next = null;

        temp = newHead;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;

        printLL(newHead);

        
    }
