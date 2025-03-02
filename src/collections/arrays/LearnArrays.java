package collections.arrays;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {

        int arr[] = {5, -1, 0, 23, -7, 99};

        // 1. asList
        System.out.println(arr);                  // [I@7b23ec81
        System.out.println(arr.getClass());      //class [I
        System.out.println(Arrays.asList(arr).getClass()); //class java.util.Arrays$ArrayList

        // 2. inplace sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[-7, -1, 0, 5, 23, 99]

        // 3. binarySearch(arr, key)
        System.out.println(Arrays.binarySearch(arr, 10));     // -5
        System.out.println(Arrays.binarySearch(arr, 5));      // 3

        // 4. fill
        Arrays.fill(arr, 93);
        System.out.println(Arrays.toString(arr));    // [93, 93, 93, 93, 93, 93]
    }
}
