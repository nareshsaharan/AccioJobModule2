static int fact(int n) {
        
        if(n == 1) {
            return
        }
        
        int recAns = fact(n-1);
    
        int myAns = recAns * n;
        return myAns;
        
    }
