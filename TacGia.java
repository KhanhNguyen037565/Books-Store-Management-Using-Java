package quanly;

public class TacGia {
	private String maTG, tenTG;
	private int ngays, thangs, nams;
	
	public TacGia() {
		
	}
	
	public TacGia(String maTG, String tenTG, int ngaySinh, int thangs, int nams) {
		this.maTG=maTG;
		this.tenTG=tenTG;
		this.ngays=ngaySinh;
		this.thangs=thangs;
		this.nams=nams;
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
	public String getmaTG() {
		return this.maTG;
	}
	public String gettenTG() {
		return this.tenTG;
	}
	public void setmaTG(String maTG) {
		this.maTG=maTG;
	}
	public void settenTG(String tenTG) {
		this.tenTG=tenTG;
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
