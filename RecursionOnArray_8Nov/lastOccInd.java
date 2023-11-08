static int lastIndex(int arr[],int x,int si)
	{

        if(si == arr.length) {
            return -1;
        }

        int recAns = lastIndex(arr, x, si + 1);

        if(recAns != -1) {
            return recAns;
        }

        if(arr[si] == x) {
            return si;
        }

        return -1;
        
       
	}
