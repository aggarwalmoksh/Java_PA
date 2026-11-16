// Last updated: 11/16/2026, 5:05:03 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> map = new HashMap<>();
4        
5        for (String str : strs) {
6            char[] arr = str.toCharArray();
7            Arrays.sort(arr);
8            String key = new String(arr);
9            map.putIfAbsent(key, new ArrayList<>());
10            map.get(key).add(str);
11        }
12
13        return new ArrayList<>(map.values());
14    }
15}