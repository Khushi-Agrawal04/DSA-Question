public class SortColours {
    public static void sortColour(int nums[]) {
        for(int i=1; i<nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;

            while(prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }

            nums[prev + 1] = curr;
        }
    }
    public static void main(String args[]) {
        int nums[] = {2,0,2,1,1,0};
        sortColour(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
