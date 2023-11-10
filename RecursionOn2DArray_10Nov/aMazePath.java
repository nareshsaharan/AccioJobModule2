public static void aMazePaths(int n, int m, String psf,int i , int j){

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
        aMazePaths(n, m, psf +"h", i, j+1);

        // move ver
        aMazePaths(n, m, psf +"v", i + 1, j);
        	
		
    }
