import java.util.*;
public class binarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int location = binarySearch(arr, arr.length, 9);

        if(location == -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found at " + location);
        }
    }

    static int binarySearch(int[] arr, int size, int target){
        int left = 0;
        int right = size - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
