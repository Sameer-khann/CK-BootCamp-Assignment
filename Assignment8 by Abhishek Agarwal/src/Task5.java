//import java.util.ArrayList;
import java.util.*;
//import java.util.Collection;

//5. You are given two sorted ArrayLists<Integer>. Merge them into a single sorted list.

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1, 1, 3, 5, 8);

        ArrayList<Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2, 2, 4, 7, 9);

        ArrayList<Integer> merged = new ArrayList<>(arr1);

        merged.addAll(arr2);

        Collections.sort(merged);

        System.out.println("the Merged List is : " + merged);
    }
}
