package HashMaps;
import java.util.HashMap;

public class Basics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insert key value pairs
        map.put("Captain America", 120);
        map.put("Iron Man", 69);
        map.put("Hulk", 100);
        map.put("Scarlet Witch", 120);
        map.put("Groot", 22);
        System.out.println(map);

        // remove
        map.remove("Iron Man");
        System.out.println(map);

        // contains
        System.out.println( map.containsKey("Black Widow"));
        System.out.println(map.containsValue(22));

        // iteration
        for(String key: map.keySet()){
            int val = map.get(key);
            System.out.println(key + " " + val);
        }
        for(Integer val: map.values()){
            System.out.println(val);
        }
        for(Object pair: map.entrySet()){
            System.out.println(pair);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {-1, -1};
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                arr[0] = i;
                arr[1] = map.get(rem);
                break;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return arr;
    }















}
