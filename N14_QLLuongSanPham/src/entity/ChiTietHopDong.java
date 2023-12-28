//Phan Nhật Hào
//19520881
package entity;

public class ChiTietHopDong {

	private HopDong HopDong;
	private String tenHD;
	private int soLuongSP;
	private double giaTriHD;
	private boolean thanhToan;
	public HopDong getMaHD() {
		return HopDong;
	}
	public void setMaHD(HopDong maHD) {
		this.HopDong = maHD;
	}
	public String getTenHD() {
		return tenHD;
	}
	public void setTenHD(String tenHD) {
		this.tenHD = tenHD;
	}
	public int getSoLuongSP() {
		return soLuongSP;
	}
	public void setSoLuongSP(int soLuongSP) {
		this.soLuongSP = soLuongSP;
	}
	public double getGiaTriHD() {
		return giaTriHD;
	}
	public void setGiaTriHD(double giaTriHD) {
		this.giaTriHD = giaTriHD;
	}
	public boolean isThanhToan() {
		return thanhToan;
	}
	public void setThanhToan(boolean thanhToan) {
		this.thanhToan = thanhToan;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((HopDong == null) ? 0 : HopDong.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHopDong other = (ChiTietHopDong) obj;
		if (HopDong == null) {
			if (other.HopDong != null)
				return false;
		} else if (!HopDong.equals(other.HopDong))
			return false;
		return true;
	}
	public ChiTietHopDong(HopDong maHD, String tenHD, int soLuongSP, double giaTriHD, boolean thanhToan) {
		super();
		this.HopDong = maHD;
		this.tenHD = tenHD;
		this.soLuongSP = soLuongSP;
		this.giaTriHD = giaTriHD;
		this.thanhToan = thanhToan;
	}
	public ChiTietHopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ChiTietHopDong(HopDong maHD) {
		super();
		this.HopDong = maHD;
	}
	@Override
	public String toString() {
		return "Mã hợp đồng: " + HopDong.getMaHD() + "\n  Tên hợp đồng: " + tenHD + "\n  Số lượng sản phẩm: " + soLuongSP + "\n  Giá trị hợp đồng: "
				+ (long)giaTriHD + "\n  Tình trạng thanh toán: " + (isThanhToan()?"Đã thanh toán":"Chưa thanh toán");
	}
	
	
}
