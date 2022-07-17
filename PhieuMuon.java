package quanly;

public class PhieuMuon {
	private String maPm,maDg;
	private int tong,ngaymuon,thangmuon,nammuon, ngaytra, thangtra, namtra;
	
	public PhieuMuon() {
		
	}
	
	public PhieuMuon(String maPm,String maDg, int ngaymuon, int thangmuon, int nmamuon, int ngaytra, int thangtra,int namtra, int tong) {
		this.maPm=maPm;
		this.maDg=maDg;
		this.tong=tong;
		this.ngaymuon=ngaymuon;
		this.thangmuon=thangmuon;
		this.nammuon=nmamuon;
		this.ngaytra=ngaytra;
		this.thangtra=thangtra;
		this.namtra=namtra;
	}
	
	public int getngaymuon() {
		return ngaymuon;
	}
	
	public String getmaDg() {
		return maDg;
	}

	public int getthangmuon() {
		return thangmuon;
	}

	public int getnammuon() {
		return nammuon;
	}
	public int getngaytra() {
		return ngaytra;
	}

	public int getthangtra() {
		return thangtra;
	}

	public int getnamtra() {
		return namtra;
	}
	public String getmaPm() {
		return this.maPm;
	}
	public int gettong() {
		return this.tong;
	}
	
	public void setmaPm(String a) {
		this.maPm=a;
	}
	public void settong(int a) {
		this.tong=a;
	}
	public void setngaymuon(int a) {
		this.ngaymuon = a;
	}

	public void setthangmuon(int a) {
		this.thangmuon = a;
	}

	public void setnammuon(int a) {
		this.nammuon = a;
	}
	public void setngaytra(int a) {
		this.ngaytra = a;
	}

	public void setthangtra(int a) {
		this.thangtra = a;
	}

	public void setnamtra(int a) {
		this.namtra= a;
	}
	public void setmaDg(String a) {
		this.maDg=a;
	}
}
