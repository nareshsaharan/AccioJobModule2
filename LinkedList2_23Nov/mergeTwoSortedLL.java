static Node merge(Node x, Node y){
       Node ans = null;
       Node temp = null;

      while ( x != null && y != null) {
            if(x.data < y.data) {

                if(ans == null) {
                    ans = x;
                    temp = ans;
                }else 
                {
                    temp.next = x;
                    temp = temp.next;
                }

                x = x.next;
            }else 
            {
                    if(ans == null) {
                        ans = y;
                        temp = ans;
                    }else 
                    {
                        temp.next = y;
                        temp = temp.next;
                    }
    
                    y = y.next;
            }
      }

     if(x != null) {
         temp.next = x;
     }else {
         temp.next = y;
     }

     return ans;
     
     

     
    }
}
