// Find duplicates in O(n) time and O(n) extra space
public class twosum {

    public static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        while(slow!=fast);
        slow = nums[0];

        while (slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
        
        return slow;
    }
    public static void main(String[] args) {
        int nums[] = {8,8,4,8,8,6,3};
        int duplicates = findDuplicate(nums);
        System.out.println(duplicates);
    }
}
