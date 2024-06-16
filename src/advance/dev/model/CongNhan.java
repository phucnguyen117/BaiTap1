package advance.dev.model;

public class CongNhan extends CanBo {
	private double bacLuong;

	public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi) {
		super(ten, tuoi, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi, double bacLuong) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.bacLuong = bacLuong;
	}

	public double getBacLuong() {
		return bacLuong;
	}

	public void setBacLuong(double bacLuong) {
		this.bacLuong = bacLuong;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten:%s - Tuoi:%d - BacLuong:%.2f", null);
	}
}
