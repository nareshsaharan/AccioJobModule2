static void fun(int arr[], int si) {
        
        if(si == arr.length) {
            return ;
        }
        
        System.out.println(arr[si]);
        
        fun(arr, si + 1);
        
    }
