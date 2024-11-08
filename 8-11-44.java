class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor = 0, n = nums.length;
        for(int i : nums) {
            xor ^= i;
        }

        int maxi = (int)Math.pow(2, maximumBit) - 1;
        // System.out.println("maxi: " + maxi);
        int idx = 0;
        int[] ans = new int[n];

        for(int i = n - 1; i >= 0; i--) {
        // System.out.println("i: " + i + " xor: " + xor);
          ans[idx++] = xor ^ maxi;
          xor ^= nums[i]; 
        }

        return ans;
    }
}