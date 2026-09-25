class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2)
            throw new IllegalArgumentException("Invalid input");
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            long sum = (long) numbers[left] + numbers[right];
            if (sum == target)
                return new int[] {left + 1, right + 1};
            if (sum < target)
                left++;
            else
                right--;
        }
        throw new IllegalArgumentException("No solution");
    }
}