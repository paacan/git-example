package leetcode;

public class leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = (m + n)-1 ;
        int a = m-1;
        int b = n-1;
        while ( a >= 0 && b >= 0 ) {
            if (nums1[a] >= nums2[b]) {
                nums1[k--] = nums1[a--];

            }
            else if (nums1[a] < nums2[b]) {
                nums1[k--] = nums2[b--];
            }
        }
        while (a >= 0) {
            nums1[k--] = nums1[a--];

        }
        while (b >= 0) {
            nums1[k--] = nums2[b--];
        }

    }
}
