package timkiemnhiphan;

public class Main {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		timkiem(arr, 1);

	}
	public static void timkiem(int arr[], int a) {
		int left = 0;
		int right = arr.length -1;
		
		for (int i = left; left<= right; i++) {
			int mid = (left + right )/2;
			if(arr[mid] == a) {
				System.out.println("Số cần tìm ở vị trị " + mid);
				break;
			} else if (arr[mid]>a) {
				right = mid;
			} else {
				left = mid;
			}
		}
	}
	
}
