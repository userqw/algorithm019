/*快速排序*/
/*数组取标杆pivot，将小元素放pivot左边 大元素放右边 然后依次对右边和左边的
* 子数组继续快排，以达到整个序列有序*/
public class QuickSort {
    /*
    * public static void quickSort(int[] array, int begin, int end) {
    if (end <= begin) return;
    int pivot = partition(array, begin, end);
    quickSort(array, begin, pivot - 1);
    quickSort(array, pivot + 1, end);
}
static int partition(int[] a, int begin, int end) {
    // pivot: 标杆位置，counter: 小于pivot的元素的个数
    int pivot = end, counter = begin;
    for (int i = begin; i < end; i++) {
        if (a[i] < a[pivot]) {
            int temp = a[counter]; a[counter] = a[i]; a[i] = temp;
            counter++;
        }
    }
    int temp = a[pivot]; a[pivot] = a[counter]; a[counter] = temp;
    return counter;
}*/
    public static void quickSort(int[] array,int begin,int end){
        if (end <= begin)return;
        int pivot = partition(array,begin,end);
        quickSort(array,begin,pivot-1);
        quickSort(array,pivot+1,end);
    }

    private static int partition(int[] a, int begin, int end) {
        //pivot:标杆位置， counter:小于pivot的元素的个数
        int pivot = end,counter = begin;
        for (int i = begin; i < end; i++) {
            if (a[i]<a[pivot]){
                int temp = a[counter];
                a[counter] = a[i];
                a[i] = temp;
                counter++;
            }
        }
        int temp = a[pivot];
        a[pivot] = a[counter];
        a[counter] = temp;
        return counter;
    }
}
