static int firstIndex(int arr[],int x,int si)
	{

        if(si == arr.length) {
            return -1;
        }
        
        int recAns = firstIndex(arr, x, si + 1);

        if(arr[si] == x) {
            return si;
        }

        return recAns;
        
       
	}
