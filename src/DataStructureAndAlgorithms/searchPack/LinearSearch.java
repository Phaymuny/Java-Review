package DataStructureAndAlgorithms.searchPack;

public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid; // Return the index if found
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 12, 18, 21, 24 };
        int target = 7;
        int result = linearSearch(arr, target);
        int resultBinary = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        if (resultBinary != -1) {
            System.out.println("Element found at index: " + resultBinary);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
