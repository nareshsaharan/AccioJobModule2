static void helper(int n) {
        // 1+2x^1+3x^2+4x^3+5x^4
        if(n == 1) {
            System.out.print("1");
            return;
        }
        
        helper(n-1);
        
        System.out.print("+"+n+"x^"+(n-1));
        
    }
