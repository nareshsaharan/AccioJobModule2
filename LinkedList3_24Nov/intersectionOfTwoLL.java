static Node intersectingNode(Node headA, Node headB)
{
    ArrayList<Node> a1 = new ArrayList<>();
    ArrayList<Node> a2 = new ArrayList<>();

    while(headA != null) {
        a1.add(headA);
        headA = headA.next;
    }

    while(headB != null) {
        a2.add(headB);
        headB = headB.next;
    }

    for(int i = 0 ; i < a1.size(); i++) {

        for(int j = 0; j < a2.size(); j++) {
            
            if(a1.get(i) == a2.get(j)) {
                return a1.get(i);
            }
        }
    }

    return null;

    
}
