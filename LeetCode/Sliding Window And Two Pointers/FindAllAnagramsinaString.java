/*
438. Find All Anagrams in a String 

Problem Link:
https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
*/


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        int k = p.length();
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            if (i >= k) {
                sCount[s.charAt(i - k) - 'a']--;
            }
            if (Arrays.equals(pCount, sCount)) {
                ans.add(i - k + 1);
            }
        }
        
        return ans;
    }
}