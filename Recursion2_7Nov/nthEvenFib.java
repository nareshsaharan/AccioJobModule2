// n -> 4 * (n-1) + (n-2)
	static long NthEvenFibonacci(long n) {

        if(n == 1) return 2;

        if(n == 2) return 8;


        long n_1 = NthEvenFibonacci(n-1);
        long n_2 = NthEvenFibonacci(n-2);

        long n_fib = 4 * n_1 + n_2;

        n_fib = n_fib % (long)(Math.pow(10, 9) + 7);

        return n_fib;
        
        
    }
