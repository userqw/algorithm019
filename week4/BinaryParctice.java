public class BinaryParctice {
//    二分法模板

    /**
     * public int binarySearch(int[] array, int target) {
     *      int left = 0, right = array.length - 1, mid;
     *      while (left <= right) {
     *          mid = (right - left) / 2 + left;
 *              if (array[mid] == target) {
     *                  return mid;
     *          } else if (array[mid] > target) {
     *                  right = mid - 1;
     *          } else {
     *                  left = mid + 1;
     *          }
 *           }
     *      return -1;
     * }
     **/

    public int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (array[mid] > target) {
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
