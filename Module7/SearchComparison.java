package basic.TripillarAssignment.Module7;
import java.util.*;
public class SearchComparison {

        // Linear Search
        static int linearSearch(int arr[], int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key)
                    return i;
            }
            return -1;
        }

        // Binary Search
        static int binarySearch(int arr[], int key) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == key)
                    return mid;
                else if (arr[mid] < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return -1;
        }

        public static void main(String[] args) {

            int arr[] = {10, 20, 30, 40, 50};
            int key = 30;

            int linearResult = linearSearch(arr, key);
            int binaryResult = binarySearch(arr, key);

            System.out.println("Linear Search Index: " + linearResult);
            System.out.println("Binary Search Index: " + binaryResult);

            System.out.println("\nTime Complexity Comparison:");
            System.out.println("Linear Search -> Best: O(1), Worst: O(n)");
            System.out.println("Binary Search -> Best: O(1), Worst: O(log n)");
        }
    }

