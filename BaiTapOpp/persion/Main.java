package persion;

public class Main {

	public static void main(String[] args) {
		HocSinh studentA = new HocSinh("PhanTu", "Java", "A"); 
		studentA.diemMonVan = studentA.averageScore(4, 9, 6);
		studentA.diemMonToan = studentA.averageScore(6, 7, 6);
		studentA.diemMonTiengAnh = studentA.averageScore(7, 5, 4);
		
		studentA.studentMathScore();
		studentA.studentSummary();
		
	}

}
