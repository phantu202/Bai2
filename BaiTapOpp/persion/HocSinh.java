package persion;

import java.nio.file.attribute.FileOwnerAttributeView;

public class HocSinh {
	String fullName;
	String tenLop;
	String tenKhoi;
	float diemMonVan;
	float diemMonToan;
	float diemMonTiengAnh;
	
	public HocSinh() {
		
	}
	
	public HocSinh(String fullName, String tenLop, String tenKhoi, float diemMonVan, 
			float diemMonToan, float diemMonTiengAnh) {
		this.fullName = fullName;
		this.tenLop = tenLop;
		this.tenKhoi = tenKhoi;
		this.diemMonVan = diemMonVan;
		this.diemMonToan = diemMonToan;
		this.diemMonTiengAnh = diemMonTiengAnh;
		
	}
	public HocSinh(String fullName, String tenLop, String tenKhoi) {
		this.fullName = fullName;
		this.tenLop = tenLop;
		this.tenKhoi = tenKhoi;
		
	}
	
	public HocSinh(String fullName,float diemMonVan, float diemMonToan, float diemMonTiengAnh) {
		this.fullName = fullName;
		this.diemMonVan = diemMonVan;
		this.diemMonToan = diemMonToan;
		this.diemMonTiengAnh = diemMonTiengAnh;
		
	}
	
	public void studentInfo() {
		System.out.println("Thông tin học sinh: " + fullName + 
				tenLop + tenKhoi + diemMonToan + diemMonVan + diemMonTiengAnh);
	}
	
	public float averageScore (float score15, float score1T, float scoreCK) {
		float avrScore = (score15 + score1T*2 + scoreCK*3)/6;
		return avrScore;
	}
	
	public void studentMathScore () {
		System.out.println(fullName + " lớp " + tenLop + " điểm trung bình môn toán là: " + diemMonToan);
	}
	
	public void studentSummary () {
		System.out.println("Học sinh: " + fullName);
		System.out.println("Lớp: " + tenLop);
		System.out.println("Điểm trung bình môn toán: " + diemMonToan);
		System.out.println("Điểm trung bình môn văn: " + diemMonVan);
		System.out.println("Điểm trung bình môn anh: " + diemMonTiengAnh);
		float diemTBNam = (diemMonToan+diemMonVan+diemMonTiengAnh)/3;
		System.out.println("Điểm trung bình năm: " + diemTBNam);
		String xepHang;
		if(diemTBNam<5) {
			xepHang = "Trung Bình";
		} else if (diemTBNam < 8) {
			xepHang = "Khá";
		} else {
			xepHang = "Giỏi";
		}
		System.out.println("Xếp hạng: " + xepHang);
	}
	
	
	
}
