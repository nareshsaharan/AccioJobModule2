static void fun2(int arr[], int ei) {
        
        if(ei < 0) {
            return ;
        }
        
        fun2(arr, ei - 1);
        
        System.out.println(arr[ei]);
        
    }
