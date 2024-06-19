class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length;i++){set.add(nums[i]);}
        for(int k : set) {list.add(k);}
        Collections.sort(list, Collections.reverseOrder());
        if(list.size()>=3){return list.get(2);} else{return list.get(0);} 
    }
}

//기본적으로 Arrays.sort()는 기본 자료형 배열을 정렬할 때는 Comparator를 사용할 수 없습니다. 따라서 int[] 배열에 대해 Collections.reverseOrder()를 직접 사용할 수 없습니다.