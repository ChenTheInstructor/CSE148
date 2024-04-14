package p3_binary_search;

public class MainBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 10, 13, 23, 34 };
		int index = binarySearch(arr, 23, 0, arr.length - 1);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int value, int start, int end) {
		if (start > end) { // base case
			return -1;
		}

		int mid = (start + end) / 2;

		if (arr[mid] == value) {
			return mid;
		} else if (arr[mid] < value) {
			start = mid + 1;
		} else {
			end = mid - 1;
		}

		return binarySearch(arr, value, start, end);
	}

}
