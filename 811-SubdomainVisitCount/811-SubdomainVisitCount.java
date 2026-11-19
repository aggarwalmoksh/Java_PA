// Last updated: 11/19/2026, 5:37:04 PM
1class Solution {
2    public List<String> subdomainVisits(String[] cpdomains) {
3        HashMap<String, Integer> mp = new HashMap<>();
4        for (String s : cpdomains) {
5
6            String[] parts = s.split(" ");
7            int c = Integer.parseInt(parts[0]);
8            String domain = parts[1];
9
10            while (true) {
11                mp.put(domain, mp.getOrDefault(domain,0)+c);
12
13                int indx = domain.indexOf('.');
14                if (indx == -1) {
15                    break;
16                }
17                domain = domain.substring(indx+1);
18            }
19        }
20        List<String> res = new ArrayList<>();
21        for (String domain : mp.keySet()) {
22            res.add(mp.get(domain) + " " + domain);
23        }
24        return res;
25
26    }
27}