public static int fib(int n ){
        // write code here

        if(n == 1) {
            return 0;
        }

        if(n == 2) {
            return 1;
        }


        int n_1_Fib = fib(n-1);
        int n_2_Fib = fib(n-2);

        int n_fib = n_1_Fib + n_2_Fib;

        return n_fib;
    }
