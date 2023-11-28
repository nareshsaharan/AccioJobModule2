public void partition(Node head, int x) {
            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();
        Node temp = head;
        
        while(temp != null) {

            if(temp.data < x) {
                left.add(temp.data);
            }else {
                right.add(temp.data);
            }

            temp = temp.next;
        }

        for(int i = 0; i < left.size(); i++) System.out.print(left.get(i)+" ");

        for(int i = 0; i < right.size(); i++) System.out.print(right.get(i)+" ");
            
        

        
    }
