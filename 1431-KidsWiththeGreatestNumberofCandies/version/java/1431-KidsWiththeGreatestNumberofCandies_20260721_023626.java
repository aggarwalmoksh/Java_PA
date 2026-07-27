// Last updated: 7/21/2026, 2:36:26 AM
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        int maxCandy = 0;
4        for (int candy : candies) {
5            maxCandy = Math.max(maxCandy, candy);
6        }
7
8        ArrayList<Boolean> result = new ArrayList<>();
9        for (int candy:candies) {
10            if ((candy + extraCandies) >= maxCandy) {
11                result.add(true);
12            }
13            else {
14                result.add(false);
15            }
16        }
17        return result;
18    }
19}