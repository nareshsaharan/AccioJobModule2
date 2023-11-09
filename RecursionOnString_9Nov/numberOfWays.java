public static long ways(int n, int si){

        if(n == 0) {
            return 1;
        }

        if(n < si) {
            return 0;
        }
        
        // pick
        long pick = ways(n - si, si + 1);

        //not pick
        long notPick = ways(n, si + 1);

        return pick + notPick;
        
    }
