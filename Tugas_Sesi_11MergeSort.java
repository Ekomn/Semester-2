class MergeSort {

    //Tugas Sesi 11 MergeSort 

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r, boolean ascending) {
        if (l < r) {
            int m = l + (r - l) / 2;

            sort(arr, l, m, ascending);
            sort(arr, m + 1, r, ascending);

            merge(arr, l, m, r);
        }
        
        // Reverse the array if sorting in descending order
        if (!ascending) {
            reverseArray(arr, l, r);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array:");
        printArray(arr);

        MergeSort ob = new MergeSort();
        // Sort in ascending order
        ob.sort(arr, 0, arr.length - 1, true);

        System.out.println("\nSorted array in ascending order:");
        printArray(arr);

        // Sort in descending order
        ob.sort(arr, 0, arr.length - 1, false);

        System.out.println("\nSorted array in descending order:");
        printArray(arr);
    }
}