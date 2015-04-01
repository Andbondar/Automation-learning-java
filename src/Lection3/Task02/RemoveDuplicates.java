package Lection3.Task02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bondar on 4/1/2015.
 */
//variants of realization can be found here http://codereview.stackexchange.com/questions/29210/removing-duplicate-values-from-an-array
public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> alreadyPresent = new HashSet<Integer>();
        int[] clearArray = new int[arr.length];

        int i = 0;
        for (int element : arr) {
            if (alreadyPresent.add(element)) {//we add element to HashSet only if it is absent here. If adding is successful - we can add this element to returned array too
                clearArray[i++] = element;//Only unique elements are added to clearArray
            }
        }
        return Arrays.copyOf(clearArray, i);//i is incremented AFTER element adding so value of i after adding of last element is equal to current array size
    }
}
