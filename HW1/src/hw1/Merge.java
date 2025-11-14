package hw1;

import java.util.Scanner;

public class Merge {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter elements of list 1 separated by spaces: ");
            String input1 = scanner.nextLine();
            String[] elements1 = input1.split(" ");
            int[] list1 = new int[elements1.length];
            for  (int i = 0; i < elements1.length; i++) {
                list1[i] = Integer.parseInt(elements1[i]);
            }
            System.out.println("Enter elements of list 2 separated by spaces: ");
            String input2 = scanner.nextLine();
            String[] elements2 = input2.split(" ");
            int[] list2 = new int[elements2.length];
            for (int i = 0; i < elements2.length; i++) {
                list2[i] = Integer.parseInt(elements2[i]);
            }
            int[] mergedList = mergeSortMerge(list1, list2);
            System.out.println("Merged and sorted list: ");
            for (int num : mergedList) {
                System.out.print(num + " ");
            }
        }
        public static int[] mergeSortMerge(int[] l1, int[] l2) {
            l1 = sortArray(l1);
            l2 = sortArray(l2);
            int[] merged = new int[l1.length + l2.length];
            int i = 0, j = 0, k = 0;
            while (i < l1.length && j < l2.length) {
                if (l1[i] < l2[j]) {
                    merged[k++] = l1[i++];
                } else {
                    merged[k++] = l2[j++];
                }
            }
            while (i < l1.length) {
                merged[k++] = l1[i++];
            }
            while (j < l2.length) {
                merged[k++] = l2[j++];
            }
            return merged;
        }
        private static int[] sortArray(int[] list) {
            boolean didSwap;
            do {
                didSwap = false;
                for (int i = 0; i < list.length - 1; i++) {
                    if (list[i] > list[i + 1]) {
                        int temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        didSwap = true;
                    }
                }
            }
            while (didSwap);
            return list;
        }
    }

