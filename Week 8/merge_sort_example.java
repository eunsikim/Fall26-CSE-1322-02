public class merge_sort_example {
    public static void mergeSort(int[] array){
        if(array.length < 2){
            return;
        }

        // Splitting `array` into two arrays: Left and Right    
        int mid = array.length / 2;

        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Fill Left and Right respectively
        for(int i = 0; i < mid; i++){ // Left starts from array index 0 to middle index
            left[i] = array[i];
        }
        
        for(int i = mid; i < array.length; i++){ // Right starts from array middle index to last index
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right){
        int i = 0, j = 0, k = 0;

        // Build/Sort Array checking value from left and right
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                array[k] = left[i];
                k++;
                i++;
            }
            else{
                array[k] = right[j];
                k++;
                j++;
            }
        }

        // Handle cases where either left or right has one more value
        while(i < left.length){
            array[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length){
            array[k] = right[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before merge sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + (i == array.length - 1 ? "" : ", "));
        }
        mergeSort(array);

        System.out.println();
        System.out.println();
        
        System.out.println("After merge sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + (i == array.length - 1 ? "" : ", "));
        }
    }
}
