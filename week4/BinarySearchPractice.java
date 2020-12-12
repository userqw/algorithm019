public class BinarySearchPractice {
    /**
     * 二分查找
     * public int binarySearch(int[] array, int target) {
     * int left = 0, right = array.length - 1, mid;
     * while (left <= right) {
     * mid = (right - left) / 2 + left;
     * <p>
     * if (array[mid] == target) {
     * return mid;
     * } else if (array[mid] > target) {
     * right = mid - 1;
     * } else {
     * left = mid + 1;
     * }
     * }
     * <p>
     * return -1;
     * }
     *
     * @param
     */

    //1
//    public int binarySearch(int[] array, int target) {
//        int left = 0, right = array.length - 1, mid;
//        while (left <= right) {
//            mid = (right - left) / 2 + left;
//
//            if (array[mid] == target) {
//                return mid;
//            } else if (array[mid] > target) {
//                right = mid -1;
//            }else {
//                left = mid +1;
//            }
//        }
//        return -1;
//    }
    //2
//    public int binarySearch(int [] array,int target){
//        int left = 0,right = array.length -1, mid;
//
//        while (left <= right){
//            mid = (right-left)/2+left;
//            if (array[mid] == target){
//                return  mid;
//            }else if (array[mid]<target){
//                left = mid+1;
//            }else {
//                right = mid-1;
//            }
//        }
//        return  -1;
//    }

    //3
//    public int binarySearch(int array[],int target){
//        int left=0,right = array.length-1,mid;
//        while (left<=right){
//            mid = (right-left)/2+left;
//            if (array[mid]==target){
//                return mid;
//            }else if(array[mid]>target){
//                right = mid-1;
//            }else {
//                left = mid+1;
//            }
//        }
//        return  -1;
//    }

    //4
    public int binarySearch(int array[], int target) {

        int left = 0, right = array.length - 1, mid;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
        String str = "555";
        int i = Integer.parseInt(str);
        System.out.println(i);
        String str1 = "2012a";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);

    }
}
