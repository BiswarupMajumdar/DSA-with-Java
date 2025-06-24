class Solution {
    public boolean validMountainArray(int[] arr) {
        int index = 0;
        int n = arr.length;

        // Step 1: Strictly increasing part
        while(index < n - 1 && arr[index] < arr[index + 1]) {
            index++;
        }

        // Step 2: Peak cannot be first or last
        if(index == 0 || index == n - 1) {
            return false;
        }

        // Step 3: Strictly decreasing part
        while(index < n - 1 && arr[index] > arr[index + 1]) {
            index++;
        }

        // Step 4: Ensure we reached the end
        return (index == n - 1);
    }
}
