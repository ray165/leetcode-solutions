class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for (int i = m, j = 0; i < nums1.length; i++, j++) {
//             nums1[i] = nums2[j];
//         }
        
//         Arrays.sort(nums1);
        
        int[] helper = new int[nums1.length];
        
        int n1 = 0;
        int n2 = 0; 
        int i = 0;
        
        while (i < helper.length) {
            // incorrectly comparing the 0's in num1
            if (nums1[n1] <= nums2[n2]) {
                if (n1 < m) {
                    helper[i] = nums1[n1];
                    n1++;
                }

            } else {
                if (n2 < n) {
                    helper[i] = nums2[n2];
                    n2++;
                }
            }
            
            i++;
        }
        
        for (int k = 0; k < nums1.length; k++) {
            nums1[k] = helper[k];
        }
    }
}