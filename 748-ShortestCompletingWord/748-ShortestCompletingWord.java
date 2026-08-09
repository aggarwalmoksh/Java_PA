// Last updated: 8/9/2026, 7:56:54 PM
1class Solution {
2    public String shortestCompletingWord(String licensePlate, String[] words) {
3        HashMap<Character, Integer> check = new HashMap<>();
4
5        for (char c : licensePlate.toCharArray()) {
6            c = Character.toLowerCase(c);
7
8            if (Character.isLetter(c)) {
9                check.put(c, check.getOrDefault(c, 0) + 1);
10            }
11        }
12
13        String answer = "";
14
15        for (String word : words) {
16            HashMap<Character, Integer> count = new HashMap<>();
17
18            for (char c : word.toCharArray()) {
19                c = Character.toLowerCase(c);
20
21                if (Character.isLetter(c)) {
22                    count.put(c, count.getOrDefault(c, 0) + 1);
23                }
24            }
25
26            boolean valid = true;
27
28            for (char c : check.keySet()) {
29                if (count.getOrDefault(c, 0) < check.get(c)) {
30                    valid = false;
31                    break;
32                }
33            }
34
35            if (valid && (answer.equals("") || answer.length() > word.length())) {
36                answer = word;
37            }
38        }
39
40        return answer;
41    }
42}