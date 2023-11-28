static Node flatten(Node root) {
      ArrayList<Node> al = new ArrayList<>();

      while(root != null) {
          al.add(root);
          root = root.right;
      }

      Node ans = null;
      Node temp = null;
      while(true) {
          
          Node curr = null;
          int idx = -1;
          
          for(int i = 0; i < al.size(); i++) {
              
              if(al.get(i) != null) {
                  
                  if(curr == null) {
                      curr = al.get(i);
                      idx = i;
                  }
                  else if(curr.data > al.get(i).data)
                  {
                      curr = al.get(i);
                      idx = i;
                  }
              }
          }
          

          if(idx == -1) break;
          //System.out.println(al.get(idx).data);
          al.set(idx, al.get(idx).down);

          if(ans == null) {
              ans = new Node(curr.data);;
              temp = ans;
              
          }else {
              temp.down = new Node(curr.data);;
              temp = temp.down;
          }
      }
      return ans;
    
    
  }

static void printList(Node head) {
        
    while(head != null) {
            System.out.print(head.data +" ");
            head = head.down;
    }
    
    System.out.println();
  }
