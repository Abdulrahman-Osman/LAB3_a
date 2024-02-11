public class Sorter {
    public void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public void insertionSort(int[] array) {
        int n = array.length;
    
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
    
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
    
            array[j + 1] = key;
        }
    }
    public void sort(int[] array) {
        selectionSort(array);
    }
    public void sort1(int[] array) {
        insertionSort(array);
    }
}
