class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> count = new HashMap<>();
        List<Integer> out = new ArrayList<>();
        for (int i : arr) {
            count.put(i,count.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (e.getKey() == e.getValue()) {
                out.add(e.getValue());
            }
        }
        
        if (out.size()==0) {
            return -1;
        } else {
            int max=0;
            for (int j=0;j<out.size();j++) {
                if (out.get(j)>max) {
                    max = out.get(j);
                }
            }
            return max;
        }
    }
}
