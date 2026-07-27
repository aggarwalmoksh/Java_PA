// Last updated: 7/27/2026, 5:10:42 PM
1class Solution {
2    static int first_occurences(int[] arr, int target) {
3        int low = 0;
4        int high = arr.length - 1;
5        int ans = -1;
6
7        while (low <= high) {
8            int mid = low + (high - low) / 2;
9
10            if (arr[mid] == target) {
11                ans = mid;
12                high = mid-1;
13            }
14            else if (arr[mid] < target) {
15                low = mid + 1;
16            }
17            else {
18                high = mid - 1;
19            }
20        }
21
22        return ans;
23    }
24
25    static int last_occurences(int[] arr, int target) {
26        int low = 0;
27        int high = arr.length - 1;
28        int ans = -1;
29
30        while (low <= high) {
31            int mid = low + (high - low) / 2;
32
33            if (arr[mid] == target) {
34                ans = mid;
35                low = mid+1;
36            }
37            else if (arr[mid] < target) {
38                low = mid + 1;
39            }
40            else {
41                high = mid - 1;
42            }
43        }
44        return ans;
45    }
46
47    public int[] searchRange(int[] nums, int target) {
48        int[] result = {-1, -1};
49        result[0] = first_occurences(nums, target);
50        result[1] = last_occurences(nums, target);
51
52        return result;
53    }
54}