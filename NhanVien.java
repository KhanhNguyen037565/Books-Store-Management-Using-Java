package quanly;


public class NhanVien {
	private String maNv, tenNv, gioiTinh, sdt, email, diaChi, chucVu;
	private int ngays, thangs, nams;

	public NhanVien() {

	}

	public NhanVien(String maNv, String tenNv, String email, String gioiTinh, String sdt, int ngays, int thangs,
			int nams, String diaChi, String chucVu) {
		this.maNv = maNv;
		this.tenNv = tenNv;
		this.ngays = ngays;
		this.thangs = thangs;
		this.nams = nams;
		this.gioiTinh = gioiTinh;
		this.sdt = sdt;
		this.email = email;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
	}

	public String getmaNv() {
		return this.maNv;
	}

	public String gettenNv() {
		return this.tenNv;
	}

	public int getngays() {
		return this.ngays;
	}

	public int getthangs() {
		return this.thangs;
	}

	public int getnams() {
		return this.nams;
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

	public String getchucVu() {
		return this.chucVu;
	}

	public void setmaNv(String a) {
		this.maNv = a;
	}

	public void settenNv(String a) {
		this.tenNv = a;
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

	public void setgioiTinh(String a) {
		this.gioiTinh = a;
	}

	public void setsdt(String a) {
		this.sdt = a;
	}

	public void setemail(String a) {
		this.email = a;
	}

	public void setdiaChi(String a) {
		this.diaChi = a;
	}

	public void setchucVu(String a) {
		this.chucVu = a;
	}
}
