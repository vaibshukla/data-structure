package io.vaibhav.problems;

public class LargestElement {

    /***
     * Given a array return the index of largest element of array
     * I/p : [10,20, 5,9,8]
     * O/P : 1
     * Time-Complexity - O(n)
     * Space Complexity -  O(1)
     * @param arr
     * @return
     */
    public int largestElement(int arr[]) {
        int size = arr.length;
        int indexOfLargestElement = 0;

        for (int i = 1; i < size; i++) {

            if (arr[i] > arr[indexOfLargestElement]){
                indexOfLargestElement = i;
            }
        }
        return indexOfLargestElement;
    }



}
