static void unfold(Node head)
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        Node temp = head; 
        while(temp != null) {
            if(temp.data == 0) zero++;
            else if(temp.data == 1) one++;
            else two++;

            temp = temp.next;
        }


        while(zero-- > 0) System.out.print(0+" ");
        while(one-- > 0) System.out.print(1+" ");
        while(two-- > 0) System.out.print(2+" ");
        
    }
}
