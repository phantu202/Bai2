package lesson_3;

public class BaiTap2 {
	//Tìm và in ra màn hình số lượng số nguyên lẻ, số lượng số nguyên chẵn trong mảng
	public static void main(String[] args) {
		int [] arr = {3,4,7,5,13,54,7,98,45};
		int soChan = 0;
		int soLe = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				soChan++;
			} else {
				soLe++;
			}
		}
		System.out.println("Số lượng số chẵn: " + soChan + ", số lẻ: " + soLe);
		
		
		
		
		

	}

}
