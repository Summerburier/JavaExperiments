package Statistic;

public class StatisticUtils {
    private int[] nums;

    public StatisticUtils(int num1, int num2) {
        this.nums = new int[]{num1, num2};
    }
    
    public StatisticUtils(int num1, int num2, int num3) {
        this.nums = new int[]{num1, num2, num3};
    }
    
    public StatisticUtils(int[] nums) {
        this.nums = new int[nums.length];
        System.arraycopy(nums, 0, this.nums, 0, nums.length);
    }
    
    public int sum() {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
    
    public static int sum(int num1, int num2) {
        return new StatisticUtils(num1, num2).sum();
    }
    
    public static int sum(int num1, int num2, int num3) {
        return new StatisticUtils(num1, num2, num3).sum();
    }
    public static int sum(int[] nums) {
        return new StatisticUtils(nums).sum();
    }
    
    public double mean() {
        if (nums.length == 0) return 0;
        return (double) sum() / nums.length;
    }
    
    public static double mean(int num1, int num2) {
        return new StatisticUtils(num1, num2).mean();
    }
    
    public static double mean(int num1, int num2, int num3) {
        return new StatisticUtils(num1, num2, num3).mean();
    }
    
    public static double mean(int[] nums) {
        return new StatisticUtils(nums).mean();
    }
    
    public int max() {
        if (nums.length == 0) return Integer.MIN_VALUE;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    
    public static int max(int num1, int num2) {
        return new StatisticUtils(num1, num2).max();
    }
    
    public static int max(int num1, int num2, int num3) {
        return new StatisticUtils(num1, num2, num3).max();
    }
    
    public static int max(int[] nums) {
        return new StatisticUtils(nums).max();
    }
    
    public int[] getNums() {
        return nums;
    }
}