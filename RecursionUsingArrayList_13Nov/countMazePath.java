static int countMazePath(int n, int m, int h, int v)
    {

        if(v == n && h == m) {
            return 1;
        }

        // safe condi
        if(v > n || h > m)  {
            return 0;
        }
        

        // move hori
        int recAns1 = countMazePath(n, m, h + 1, v);
        // verti
        int recAns2 = countMazePath(n, m, h, v + 1);

        return recAns1 + recAns2;
        
    }
