public class binarySearch {

    public static int search(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is at mid
            if (arr[mid] == key)
                return mid;

            // If key is greater, ignore the left half
            if (arr[mid] < key)
                left = mid + 1;

            // If key is smaller, ignore the right half
            else
                right = mid - 1;
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 50;

        int result = search(arr, key);
        if (result == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element found at index: " + result);
    }
}
