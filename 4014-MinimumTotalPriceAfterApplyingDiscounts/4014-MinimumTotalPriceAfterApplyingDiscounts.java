// Last updated: 8/12/2026, 1:34:59 PM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        double total = 0;
6
7        int n = prices.length;
8        int m = discounts.length;
9
10        for (int i = 0; i < Math.min(n,m); i++) {
11            int price = prices[n-1-i];
12            int discount = discounts[m-1-i];
13
14            total += (price * (100 - discount))/100.0;
15        }
16
17        for (int i = Math.min(n,m); i < n; i++) {
18            total += prices[n-1-i];
19        }
20
21        return total;
22    }
23}