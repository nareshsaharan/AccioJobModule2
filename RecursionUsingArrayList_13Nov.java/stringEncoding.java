static void helper(String str, String ans) {


        if(str.length() == 0) {
            System.out.println(ans);
            return ;
        }

        // safe condi
        if(str.charAt(0) == '0') {
            return ;            
        }

        if(str.length() == 1) {
            System.out.println(ans + (char)('a' + str.charAt(0) - '1'));
            return;
        }
     

        // pick one char
        helper(str.substring(1), ans + (char)('a' + str.charAt(0) - '1'));
        // two char
        // 2
        int val = Integer.parseInt(str.substring(0, 2));
        if(val >= 10 && val <= 26) {
            helper( str.substring(2), ans + (char)('a' + val - 1) );
        }
        
    }
    
