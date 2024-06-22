class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
    for(int i=1; i<=nums.length; i++){set.add(i);}
    for(int k : nums){if(set.contains(k)){set.remove(k);}}
    ArrayList<Integer> list = new ArrayList<>(set);
    return list;
    }
}

/*time over
public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
    for(int i=1; i<=nums.length; i++){list.add(i);}
    for(int k : nums){if(list.contains(k)){list.remove(Integer.valueOf(k));}}
    return list;*/