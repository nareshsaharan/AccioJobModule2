public static void reverse(Node curr){

        if(curr == null) return;
        
        reverse(curr.next);
        System.out.print(curr.data +" ");
        
    }
