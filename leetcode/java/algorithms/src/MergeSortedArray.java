/**
 * Created by simonzhang on 6/16/15.
 * Tags:
 * Array, Two Pointers
 *
 */
public class MergeSortedArray {
    public class Solution {

        public void merge (int[] nums1, int m, int[] nums2, int n) {

            int i = m - 1;
            int j = n - 1;

            while (i >= 0 && j >= 0) {
                nums1[i + j + 1] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
            }
            while (j >= 0) {
                nums1[j] = nums2[j--];
            }
        }
    }
}
