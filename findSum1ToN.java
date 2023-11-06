// 1 to n
    static int sumOf1ToN(int n) {
       
        if(n == 1)  return 1;
       
        int recAns = sumOf1ToN(n-1);
        
        int myAns = recAns + n;
        return myAns;
        
    }
