static void helper(int n, char source_rod, char dest_rod, char helper_rod) {

        if(n == 0) {
            return ;
        }

        helper(n-1, source_rod,  helper_rod, dest_rod);
        System.out.println("Moving ring "+ n +" from "+ source_rod + " to " + dest_rod);
        helper(n-1, helper_rod, dest_rod, source_rod);
        
    }
    
    static void towersOfHanoi(int n, char source, char dest) {

        helper(n, 'A', 'B', 'C');
        
    }
