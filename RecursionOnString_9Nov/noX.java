static String noX(String s) {

        if(s.length() == 0) {
            return "";
        }

        // abcxdxd
        // bcxdxd
        String recAns = noX(s.substring(1));

        if(s.charAt(0) == 'x') {
            return recAns;
        }
        else {
            return s.charAt(0) + recAns;
        }
        
        
    }
