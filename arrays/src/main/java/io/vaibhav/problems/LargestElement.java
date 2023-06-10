package io.vaibhav.problems;

public class LargestElement {

    /***
     * Given a array return the index of largest element of array
     * I/p : [10,20, 5,9,8]
     * O/P : 1
     * Time-Complexity - O(n)
     * Space Complexity -  O(1)
     * @param arr
     * @return Index of the largest Element
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

    /**
     * Time-Complexity : O(n^2)
     * @param arr
     * @return Index of the largest Element
     */
    public int largestElementNaive(int arr[]) {
        int size = arr.length;
        for (int i = 0 ; i < size; i++) {
            boolean isLargest = true;
            for (int j=0 ; j < size ; j++ ) {
                if (arr[i] < arr[j]) {
                    isLargest = false;
                    break;
                }
            }
            if (isLargest)
                return i;
        }
        return -1;
    }

    /**
     *  Given an input of integer array , find the second largest element in the array.
     *  I/P :  {10 , 20 , 12 , 15, 9 }
     *  O/P : 3 Second largest element is 15
     *
     *  I/P : {10, 10 , 10 }
     *  O/P : -1 , No second largest elemnent present in the array.
     *
     *  T: O(n)
     *
     * @param arr
     * @return Index of the second largest element
     */
    public int secondLargestElementNaive(int arr[]) {
        int indexLargestElement = largestElement(arr);
        int indexSecondLargestElement = -1 ;
        int size= arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] != arr[indexLargestElement]) {
                if (indexSecondLargestElement == -1  ) {
                    indexSecondLargestElement = i;
                }else if (arr[indexSecondLargestElement] < arr[i]) {
                    indexSecondLargestElement = i;
                }
            }
        }
        return indexSecondLargestElement;
    }


    public int secondLargestElement(int[] arr   ) {
        int firstLargest = 0 ;
        int secondLargest = -1;
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            // Case 1 , If you see the element which is greater then the largest element
            if (arr[i] > arr[firstLargest]) {
                secondLargest = firstLargest;
                firstLargest = i;
            }
            // Case 2: When you see the element which is not largest ,
            // then two case comes first you not yet see the largest or
            // just saw the largest element from current second largest
            else if (arr[i] != arr[firstLargest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }

        }
        return secondLargest;
    }

}
