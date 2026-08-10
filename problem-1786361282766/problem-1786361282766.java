// Last updated: 8/10/2026, 4:58:02 PM
1class Solution {
2    List<String> answer = new ArrayList<>();
3
4    void backtrack(int index, int count, int turnedOn, int[] leds){
5        if (count == turnedOn) {
6            int hour = 0;
7            int minute = 0;
8
9            for (int i = 0; i < 4; i++) {
10                if (leds[i] == 1) {
11                    hour+=(1<<i);
12                }
13            }
14
15            for (int i = 4; i < 10; i++) {
16                if (leds[i] == 1) {
17                    minute += (1<<(i-4));
18                }
19            }
20
21            if (hour <= 11 && minute <=59) {
22                String time = hour + ":" + String.format("%02d", minute);
23                answer.add(time);
24            }
25            return;
26        }
27
28        if (index == 10) {
29            return;
30        }
31
32        leds[index] = 1;
33        backtrack(index+1, count+1, turnedOn, leds);
34        leds[index] = 0;
35        backtrack(index+1, count, turnedOn, leds);
36    }
37
38    public List<String> readBinaryWatch(int turnedOn) {
39        int[] leds = new int[10];
40        backtrack(0,0,turnedOn,leds);
41        return answer;
42    }
43}