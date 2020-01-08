package ch4;

import java.util.Arrays;

// 피봇을 중간에 놓고하는 코드

public class QuickSort {
    public void sort(int[] data, int l, int r) {

        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];

        do {
            while (data[left] < pivot)
                left++;
            while (data[right] > pivot)
                right--;
            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }

        } while (left <= right);
        if (l < right)
            sort(data, l, right);
        if (r > left)
            sort(data, left, r);

    }

    public static void main(String[] args) {
        int[] data = { 1, 88, 4, 9, 5, 6};

        System.out.println("원본: "+Arrays.toString(data));
        QuickSort app = new QuickSort();

        app.sort(data, 0, data.length - 1);
        System.out.println("정렬: " + Arrays.toString(data));
    }
}
