// Last updated: 11/16/2026, 5:25:21 PM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        for (char c : s.toCharArray()) {
5            map.put(c, map.getOrDefault(c, 0) + 1);
6        }
7
8        ArrayList<Character> list = new ArrayList<>(map.keySet());
9
10        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
11
12        StringBuilder ans = new StringBuilder();
13
14        for (char c : list) {
15            int freq = map.get(c);
16
17            for (int i = 0; i < freq; i++) {
18                ans.append(c);
19            }
20        }
21
22        return ans.toString();
23
24    }
25}