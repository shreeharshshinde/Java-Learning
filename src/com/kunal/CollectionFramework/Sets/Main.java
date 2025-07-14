package com.kunal.CollectionFramework.Sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Union (A ∪ B) - Combines both sets
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet); // Output: [1, 2, 3, 4, 5, 6, 7, 8]

        // Intersection (A ∩ B) - Common elements
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet); // Output: [4, 5]

        // Difference (A - B) - Elements in A but not in B
        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference (A - B): " + differenceSet); // Output: [1, 2, 3]

        // Symmetric Difference (A ⊕ B) - Elements in either A or B but not both
        Set<Integer> symmetricDifferenceSet = new HashSet<>(unionSet);
        symmetricDifferenceSet.removeAll(intersectionSet);
        System.out.println("Symmetric Difference: " + symmetricDifferenceSet); // Output: [1, 2, 3, 6, 7, 8]

        // Checking if set1 contains all elements of set2
        System.out.println("set1 contains all elements of set2: " + set1.containsAll(set2)); // Output: false
    }
}
