class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int result[] = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){result[nums[i]]++;}
        for(int i=0; i<nums.length+1; i++){if(result[i]==0&&i!=0){list.add(Integer.valueOf(i));}}
        return list;
    }
}

/*time over
public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
    for(int i=1; i<=nums.length; i++){list.add(i);}
    for(int k : nums){if(list.contains(k)){list.remove(Integer.valueOf(k));}}
    return list;*/

    /* 22ms
    class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
    for(int i=1; i<=nums.length; i++){set.add(i);}
    for(int k : nums){if(set.contains(k)){set.remove(k);}}
    ArrayList<Integer> list = new ArrayList<>(set);
    return list;
    }
}
*/