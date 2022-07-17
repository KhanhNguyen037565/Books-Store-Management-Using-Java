package quanly;

public class Truyen {
	private String maT, tenT, nxb;
	private int soLuong;
	
	public Truyen() {
		
	}
	public Truyen(String maT, String tenT, int soLuong,String nxb) {
		this.maT=maT;
		this.tenT=tenT;
		this.nxb=nxb;
		this.soLuong=soLuong;
	}
	
	public String getmaT() {
		return this.maT;
	}
	public String gettenT() {
		return this.tenT;
	}
	public String getnxb() {
		return this.nxb;
	}
	public int getsoLuong() {
		return this.soLuong;
	}
	
	public void setmat(String a) {
		this.maT=a;
	}
	public void settenT(String a) {
		this.tenT=a;
	}
	public void setnxb(String a) {
		this.nxb=a;
	}
	public void setsoLuong(int a) {
		this.soLuong=a;
	}
}
