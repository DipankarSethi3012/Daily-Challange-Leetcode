class Solution {
    public long minEnd(int n, int x) {
        int count = 1;
        long ans = x;

        while(count < n) {
            ans = (ans + 1) | x;
            count++; 
        }
        return ans;
    }
}