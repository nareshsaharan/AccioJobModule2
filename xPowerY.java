public static long xPowerN(int x, int n){
		//write code here

        if(n == 1) {
           return 1;
        }

        long recAns = xPowerN(x, n-1);

        long myAns = recAns * x;

        return myAns;

		
	}
