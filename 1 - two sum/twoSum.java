import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        
        return result;
    }


    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(numbers, target);
        System.out.println(numbers[result[0]] + " + " +  numbers[result[1]] + "= " + target);
    }
}
