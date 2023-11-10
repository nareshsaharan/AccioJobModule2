public static void printMazePaths(int n, int m, int i, int j, String psf) {
        
        // base case
        if(i == n && j == m) {
            System.out.println(psf);
            return;
        }

        // isSafe
        if(i > n || j > m) {
            return ;
        }

         // move hori
        for(int k = 1; j + k <= m; k++) {
            printMazePaths(n, m, i, j + k, psf +"h" + k);
        }
       
        for(int k = 1; i + k <= n; k++) {
            // move ver
            printMazePaths(n, m, i+k, j, psf +"v" + k);
        }


        for(int k = 1; j + k <= m && i + k <= n; k++) {
            printMazePaths(n, m, i+k, j+k, psf +"d" + k);
        }

        	
        
    }
