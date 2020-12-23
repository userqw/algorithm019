/*归并排序代码*/
/*1把长度为n的输入序列分成两个长度为n/2的子序列
* 2对两个子序列分别采用归并排序
* 3将两个排序好的子序列合并成一个最终的排序序列*/
public class MergeSort {
    /*
    public static void mergeSort(int[] array, int left, int right) {

    if (right <= left) return;

    int mid = (left + right) >> 1; // (left + right) / 2

    mergeSort(array, left, mid);
    mergeSort(array, mid + 1, right);
    merge(array, left, mid, right);
}

public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // 中间数组
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid)   temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
        // 也可以用 System.arraycopy(a, start1, b, start2, length)
    }*/
    public static void mergeSort(int[]array,int left,int right){
        if (right <= left)return;
        int mid = (left + right) >> 1;//(left+right)/2
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        merge(array,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];//中间数组
        int i = left, j = mid + 1, k = 0;
        while (i<= mid && j<= right){
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i<= mid) temp[k++] = arr[i++];
        while (j<=right) temp[k++] = arr[j++];

        for (int p = 0; p<temp.length;p++){
            arr[left + p] = temp[p];
        }

//        System.arraycopy(a,start1,b,start2,length);
    }
}
