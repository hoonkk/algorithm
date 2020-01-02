package ch0;

public class BinarySearch {
    public static void main(String[] args) {

//        이진탐색을 수행할 배열
        int[] arr = { 3, 19, 34, 50, 87 };

//        찾으려는 값
        int target = 19;

        binarySearch(arr, target);
    }

    private static void binarySearch(int[] arr, int target) {

        int left = 0;

        int right = arr.length - 1;
        int mid;

        while (left <= right) {

//            중간값 계산
            mid = (left + right) / 2;

//            값을 찾는데 성공하면 위치를 반환한다
            if (target == arr[mid]) {
                System.out.println(target + "찾고자 했던 값의 인덱 : " + mid);
                break;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
    }
}
