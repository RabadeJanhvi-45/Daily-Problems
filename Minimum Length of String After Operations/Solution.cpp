class Solution {
public:
    int minimumLength(string s) {
        int cnt[26]{}; // Array to store character frequencies
        for (char& c : s) {
            ++cnt[c - 'a'];
        }
        int ans = 0;
        for (int x : cnt) {
            if (x) {
                ans += x % 2 ? 1 : 2; // Add 1 for odd, 2 for even
            }
        }
        return ans;
    }
};
