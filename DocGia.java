package quanly;

public class DocGia {
	private String maDg, tenDg, gioiTinh, email, sdt, diaChi;
	private int ngays, thangs, nams;
	
	public DocGia() {
		
	}
	public DocGia(String maDg, String tenDg, int ngays, int thangs, int nams, String gioiTinh, String sdt,String email, String diaChi) {
		this.maDg=maDg;
		this.tenDg=tenDg;
		this.gioiTinh=gioiTinh;
		this.email=email;
		this.sdt=sdt;
		this.diaChi=diaChi;
		this.ngays=ngays;
		this.thangs=thangs;
		this.nams=nams;
	}
	public String getmaDg() {
		return this.maDg;
	}
	public String gettenDg() {
		return this.tenDg;
	}
	public int getngays() {
		return ngays;
	}

	public int getthangs() {
		return thangs;
	}

	public int getnams() {
		return nams;
	}
	public String getgioiTinh() {
		return this.gioiTinh;
	}
	public String getsdt() {
		return this.sdt;
	}
	public String getemail() {
		return this.email;
	}
	public String getdiaChi() {
		return this.diaChi;
	}
	
	public void setmaDg(String a) {
		this.maDg=a;
	}
	public void settenDg(String a) {
		this.tenDg=a;
	}
	public void setgioiTinh(String a) {
		this.gioiTinh=a;
	}
	public void setsdt(String a) {
		this.sdt=a;
	}
	public void setemail(String a) {
		this.email=a;
	}
	public void setdiaChi(String a) {
		this.diaChi=a;
	}
	public void setngays(int a) {
		this.ngays = a;
	}

	public void setthangs(int a) {
		this.thangs = a;
	}

	public void setnams(int a) {
		this.nams = a;
	}
}
