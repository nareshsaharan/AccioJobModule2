static int  partition(int arr[], int si, int ei) {

        int pivot = arr[ei];

        int i = si - 1;
        
        for(int j = si; j < ei; j++) {

            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;

        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
        
    }
    
	static void quickSort(int[] arr, int si, int ei){

        if(si >= ei) {
            return ;
        }

        int pi = partition(arr, si, ei);
        quickSort(arr, si, pi - 1);
        quickSort(arr, pi + 1, ei);
        
       
    }
}
