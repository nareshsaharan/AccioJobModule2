static void merge(int arr[], int si, int mid, int ei) {

        int a[] = new int[mid - si + 1];
        int b[] = new int[ei - mid];

        int k = si;

        for(int i = 0; i < a.length; i++) {
            a[i] = arr[k];
            k++;
        }

        for(int i = 0; i < b.length; i++) {
            b[i] = arr[k];
            k++;
        }

        int i = 0;
        int j = 0;
        k = si;

        while(i < a.length && j < b.length) {

                if(a[i] < b[j]) {
                    arr[k] = a[i];
                    i++;
                    k++;
                }else {
                    arr[k] = b[j];
                    j++;
                    k++;
                }
        }

        
        while(i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while(j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }
  
        
    }


    
static void mergeSort(int[] arr,int si,int ei){

        if(si >= ei) {
            return ;
        }

        // find mid
        int mid = (si + ei) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // our stuff
        merge(arr, si, mid, ei);
     
    }
}
