package quanly;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.KeyStore.TrustedCertificateEntry;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.PreparableStatement.PreparableStatementFinalizer;
import com.mysql.cj.xdevapi.Statement;

public class ConnJDBC {
	public static  Connection getJDBC() {
		final String url="jdbc:mysql://localhost:3306/quanlytruyen";
		final String user="root";
		final String password="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<NhanVien>showAllnv(){
		List<NhanVien> nvList=new ArrayList<>();
		String query="select*from nhanvien ";
		try {
			Connection connection=getJDBC();
			java.sql.Statement stmt=connection.createStatement();
			ResultSet rSult=stmt.executeQuery(query);
			while(rSult.next()) {
				NhanVien nv=new NhanVien(rSult.getString("manv"), rSult.getString("TEN"), rSult.getString("EMAIL"), rSult.getString("GIOITINH"), rSult.getString("SDT"), rSult.getInt("NGAYSINH"),rSult.getInt("THANGSINH"),rSult.getInt("NAMSINH"), rSult.getString("DIACHI"), rSult.getString("CHUCVU"));
			nvList.add(nv);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nvList;
	}
	public static void insertNV(NhanVien nv) {
		String query= "INSERT INTO nhanvien (MANV, TEN, EMAIL, GIOITINH, SDT, NGAYSINH, THANGSINH, NAMSINH, DIACHI, CHUCVU) VALUES (?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection connection=getJDBC();
			PreparedStatement pstmt =connection.prepareStatement(query);
			pstmt.setString(1,nv.getmaNv());
			pstmt.setString(2,nv.gettenNv());
			pstmt.setString(3,nv.getemail());
			pstmt.setString(4,nv.getgioiTinh());
			pstmt.setString(5,nv.getsdt());
			pstmt.setInt(6, nv.getngays());
			pstmt.setInt(7, nv.getthangs());
			pstmt.setInt(8,nv.getnams());
			pstmt.setString(9,nv.getdiaChi());
			pstmt.setString(10,nv.getchucVu());
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void deletaNV(NhanVien nv) {
		String aString=nv.getmaNv();
		String query ="delete from nhanvien where manv='"+aString+"' ";
		try {
			Connection connection=getJDBC();
			PreparedStatement pstmt =connection.prepareStatement(query);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void updateNV(NhanVien nv) {
		String aString=nv.getmaNv();
		String query="Update nhanvien set manv=?,ten=?,email=?,gioitinh=?,sdt=?,ngaysinh=?,thangsinh=?,namsinh=?,diachi=?,chucvu=? where manv='"+aString+"'";
		try {
			Connection connection=getJDBC();
			PreparedStatement pstmt =connection.prepareStatement(query);
			pstmt.setString(1,nv.getmaNv());
			pstmt.setString(2,nv.gettenNv());
			pstmt.setString(3,nv.getemail());
			pstmt.setString(4,nv.getgioiTinh());
			pstmt.setString(5,nv.getsdt());
			pstmt.setInt(6, nv.getngays());
			pstmt.setInt(7, nv.getthangs());
			pstmt.setInt(8,nv.getnams());
			pstmt.setString(9,nv.getdiaChi());
			pstmt.setString(10,nv.getchucVu());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	 public static List<NhanVien> findNameNV(NhanVien nv){
		 List<NhanVien> nvList_1=new ArrayList<>();
		 String aString=nv.gettenNv();
			String query="select*from nhanvien where ten='"+aString+"'";
		 try {
				Connection connection=getJDBC();
				java.sql.Statement stmt=connection.createStatement();
				ResultSet rSult=stmt.executeQuery(query);
				while(rSult.next()) {
					NhanVien nv_1=new NhanVien(rSult.getString("manv"), rSult.getString("TEN"), rSult.getString("EMAIL"), rSult.getString("GIOITINH"), rSult.getString("SDT"), rSult.getInt("NGAYSINH"),rSult.getInt("THANGSINH"),rSult.getInt("NAMSINH"), rSult.getString("DIACHI"), rSult.getString("CHUCVU"));
					nvList_1.add(nv_1);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return nvList_1;
	 }
	 
	 public static List<Truyen>showAllT(){
			List<Truyen> truyens=new ArrayList<>();
			String query="select*from truyen";
			try {
				Connection connection=getJDBC();
				java.sql.Statement stmt=connection.createStatement();
				ResultSet rSult=stmt.executeQuery(query);
				while(rSult.next()) {
					Truyen t=new Truyen(rSult.getString("maTruyen"), rSult.getString("tenTruyen"), rSult.getInt("soLuong"), rSult.getString("NXB"));
				truyens.add(t);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return truyens;
		}
	 public static void insertT(Truyen t) {
			String query= "insert into truyen(maTruyen,tenTruyen,soLuong,nxb)values(?,?,?,?)";
			try {
				Connection connection=getJDBC();
				PreparedStatement pstmt=connection.prepareStatement(query);
				pstmt.setString(1,t.getmaT());
				pstmt.setString(2,t.gettenT());
				pstmt.setInt(3,t.getsoLuong());
				pstmt.setString(4,t.getnxb());
				pstmt.execute();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public static void deletaT(Truyen t) {
			String aString=t.getmaT();
			String query ="delete from truyen where maTruyen='"+ aString+"' ";
			try {
				Connection connection=getJDBC();
				PreparedStatement pstmt =connection.prepareStatement(query);
				pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		public static void updateT(Truyen t) {
			String aString=t.getmaT();
			String query="Update truyen set maTruyen=?,tenTruyen=?,soluong=?,nxb=? where matruyen='"+aString+"' ";
			try {
				Connection connection=getJDBC();
				PreparedStatement pstmt =connection.prepareStatement(query);
				pstmt.setString(1,t.getmaT());
				pstmt.setString(2,t.gettenT());
				pstmt.setInt(3,t.getsoLuong());
				pstmt.setString(4,t.getnxb());
				pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		 public static List<Truyen> findNameT(Truyen t){
			 List<Truyen> truyens=new ArrayList<>();
			 String astring=t.gettenT();
				String query="select*from truyen where tentruyen='"+astring+"'";
			 try {
					Connection connection=getJDBC();
					java.sql.Statement stmt=connection.createStatement();
					ResultSet rSult=stmt.executeQuery(query);
					while(rSult.next()) {
						Truyen tmp=new Truyen(rSult.getString("maTruyen"), rSult.getString("tenTruyen"), rSult.getInt("soLuong"), rSult.getString("NXB"));
					truyens.add(tmp);
				} 
			 }catch (Exception e) {
					// TODO: handle exception
				}
				return truyens;

		 }
		 public static List<TacGia>showAllTG(){
				List<TacGia> tgList=new ArrayList<>();
				String query="select*from tacgia";
				try {
					Connection connection=getJDBC();
					java.sql.Statement stmt=connection.createStatement();
					ResultSet rSult=stmt.executeQuery(query);
					while(rSult.next()) {
						TacGia tg =new TacGia(rSult.getString("maTG"), rSult.getString("ten"), rSult.getInt("ngaysinh"),rSult.getInt("thangsinh"),rSult.getInt("namsinh"));
					tgList.add(tg);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				return tgList;
			}
		 public static void insertTG(TacGia tg) {
				String query= "insert into tacgia(maTG,ten,ngaysinh,thangsinh,namsinh)values(?,?,?,?,?)";
				try {
					Connection connection=getJDBC();
					PreparedStatement pstmt=connection.prepareStatement(query);
					pstmt.setString(1,tg.getmaTG());
					pstmt.setString(2,tg.gettenTG());
					pstmt.setInt(3,tg.getngays());
					pstmt.setInt(4,tg.getthangs());
					pstmt.setInt(5,tg.getnams());
					
					pstmt.execute();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			public static void deletaTG(TacGia tg) {
				String query =" delete from tacgia where maTG='"+tg.getmaTG()+"' ";
				try {
					Connection connection=getJDBC();
					PreparedStatement pstmt =connection.prepareStatement(query);
					pstmt.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			public static void updateTG(TacGia tg) {
				String query="Update tacgia set maTG=?,ten=?,ngaysinh=?,thangsinh=?,namsinh=? where maTG='"+tg.getmaTG()+"' ";
				try {
					Connection connection=getJDBC();
					PreparedStatement pstmt =connection.prepareStatement(query);
					pstmt.setString(1,tg.getmaTG());
					pstmt.setString(2,tg.gettenTG());
					pstmt.setInt(3,tg.getngays());
					pstmt.setInt(4, tg.getthangs());
					pstmt.setInt(5, tg.getnams());
					pstmt.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			 public static List<TacGia> findNameTG(TacGia tg){
				 List<TacGia> tgList_1=new ArrayList<>();
				 String query="select*from tacgia where ten='"+tg.gettenTG()+"' ";
				 try {
						Connection connection=getJDBC();
						java.sql.Statement stmt=connection.createStatement();
						ResultSet rSult=stmt.executeQuery(query);
						while(rSult.next()) {
							TacGia tg_1=new TacGia(rSult.getString("maTG"), rSult.getString("ten"), rSult.getInt("ngaysinh"),rSult.getInt("thangsinh"),rSult.getInt("namsinh"));
						tgList_1.add(tg_1);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					return tgList_1;
			 }
			 public static List<DocGia>showAllDG(){
					List<DocGia> dgList=new ArrayList<>();
					String query="select*from docgia";
					try {
						Connection connection=getJDBC();
						java.sql.Statement stmt=connection.createStatement();
						ResultSet rSult=stmt.executeQuery(query);
						while(rSult.next()) {
							DocGia dg =new DocGia(rSult.getString("maDG"), rSult.getString("ten"),rSult.getInt("ngaysinh"),rSult.getInt("thangsinh"),rSult.getInt("namsinh"),rSult.getString("gioitinh"),rSult.getString("sdt"),rSult.getString("email"),rSult.getString("diachi"));
						dgList.add(dg);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					return dgList;
				}
			 public static void insertDG(DocGia dg) {
					String query= "INSERT INTO docgia (MADG,TEN,NGAYSINH,THANGSINH,NAMSINH,GIOITINH,SDT,EMAIL,DIACHI) VALUES (?,?,?,?,?,?,?,?,?)";
					try {
						Connection connection=getJDBC();
						PreparedStatement pstmt=connection.prepareStatement(query);
								 
						pstmt.setString(1, dg.getmaDg());
						pstmt.setString(2, dg.gettenDg());
						pstmt.setInt(3, dg.getngays());
						pstmt.setInt(4, dg.getthangs());
						pstmt.setInt(5, dg.getnams());
						pstmt.setString(6, dg.getgioiTinh());
						pstmt.setString(7, dg.getsdt());
						pstmt.setString(8, dg.getemail());
						pstmt.setString(9,dg.getdiaChi());
						pstmt.execute();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				public static void deletaDG(DocGia dg) {
					String query ="delete from docgia where maDG='"+dg.getmaDg()+"' ";
					try {
						Connection connection=getJDBC();
						PreparedStatement pstmt =connection.prepareStatement(query);
						pstmt.executeUpdate();
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				public static void updateDG(DocGia dg) {
					String query="Update docgia set maDG=?,ten=?,ngaysinh=?,thangsinh=?,namsinh=?,gioitinh=?,sdt=?,email=?,diachi=? where maDG='"+dg.getmaDg()+"' ";
					try {
						Connection connection=getJDBC();
						PreparedStatement pstmt =connection.prepareStatement(query);
						pstmt.setString(1,dg.getmaDg());
						pstmt.setString(2,dg.gettenDg());
						pstmt.setInt(3,dg.getngays());
						pstmt.setInt(4, dg.getthangs());
						pstmt.setInt(5, dg.getnams());
						pstmt.setString(6,dg.getgioiTinh());
						pstmt.setString(7,dg.getsdt());
						pstmt.setString(8,dg.getemail());
						pstmt.setString(9,dg.getdiaChi());
						pstmt.executeUpdate();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				 public static List<DocGia> findNameDG(DocGia dg){
					 List<DocGia> dgList_1=new ArrayList<>();
					 String aString=dg.gettenDg();
					 String query="select*from docgia where ten='"+aString+"' ";
					 try {
							Connection connection=getJDBC();
							java.sql.Statement stmt=connection.createStatement();
							ResultSet rSult=stmt.executeQuery(query);
							while(rSult.next()) {
								DocGia dg_1 =new DocGia(rSult.getString("maDG"), rSult.getString("ten"),rSult.getInt("ngaysinh"),rSult.getInt("thangsinh"),rSult.getInt("namsinh"),rSult.getString("gioitinh"),rSult.getString("sdt"),rSult.getString("email"),rSult.getString("diachi"));
								dgList_1.add(dg_1);
							}
						} catch (Exception e) {
							// TODO: handle exception
						}
						return dgList_1;
				 }
				 public static List<PhieuMuon>showAllPM(){
						List<PhieuMuon> pmList=new ArrayList<>();
						String query="select*from phieumuon";
						try {
							Connection connection=getJDBC();
							java.sql.Statement stmt=connection.createStatement();
							ResultSet rSult=stmt.executeQuery(query);
							while(rSult.next()) {
								PhieuMuon pm =new PhieuMuon(rSult.getString("maphieumuon"),rSult.getString("madg"), rSult.getInt("ngaymuon"), rSult.getInt("thangmuon"),rSult.getInt("nammuon"), rSult.getInt("ngaytra"), rSult.getInt("thangtra"),rSult.getInt("namtra"),rSult.getInt("Tongsl"));
							pmList.add(pm);
							}
						} catch (Exception e) {
							// TODO: handle exception
						}
						return pmList;
					}
				 public static void insertPM(PhieuMuon pm) {
						String query= "insert into phieumuon(maphieumuon,madg,ngaymuon,thangmuon,nammuon,ngaytra, thangtra, namtra,tongsl)value(?,?,?,?,?,?,?,?,?)";
						try {
							Connection connection=getJDBC();
							PreparedStatement pstmt=connection.prepareStatement(query);
							pstmt.setString(1,pm.getmaPm());
							pstmt.setString(2,pm.getmaDg());
							pstmt.setInt(3,pm.getngaymuon());
							pstmt.setInt(4,pm.getthangmuon());
							pstmt.setInt(5,pm.getnammuon());
							pstmt.setInt(6,pm.getngaytra());
							pstmt.setInt(7,pm.getthangtra());
							pstmt.setInt(8,pm.getnamtra());
							pstmt.setInt(9,pm.gettong());
							pstmt.execute();
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					public static void deletaPM(PhieuMuon pm) {
						String aString=pm.getmaPm();
						String query =" delete from phieumuon where maphieumuon='"+aString+"' ";
						try {
							Connection connection=getJDBC();
							PreparedStatement pstmt =connection.prepareStatement(query);
							pstmt.executeUpdate();
						} catch (Exception e) {
							// TODO: handle exception
						}
						
					}
					public static void updatePM(PhieuMuon pm) {
						String aString=pm.getmaPm();
						String query="Update phieumuon set maphieumuon=?,madg=?,ngaymuon=?,thangmuon=?,nammuon=?,ngaytra=?,thangtra=?,namtra=?,tongsl=? where maphieumuon='"+aString+"'";
						try {
							Connection connection=getJDBC();
							PreparedStatement pstmt =connection.prepareStatement(query);
							pstmt.setString(1,pm.getmaPm());
							pstmt.setString(2,pm.getmaDg());
							pstmt.setInt(3,pm.getngaymuon());
							pstmt.setInt(4,pm.getthangmuon());
							pstmt.setInt(5,pm.getnammuon());
							pstmt.setInt(6,pm.getngaytra());
							pstmt.setInt(7,pm.getthangtra());
							pstmt.setInt(8,pm.getnamtra());
							pstmt.setInt(9,pm.gettong());
							pstmt.executeUpdate();
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					 public static List<PhieuMuon> findNamePM(PhieuMuon pm){
						 String aString=pm.getmaPm();
						 List<PhieuMuon> pmList_1=new ArrayList<>();
						 String query= "select*from phieumuon where maphieumuon='"+aString+"' ";
						 try {
								Connection connection=getJDBC();
								java.sql.Statement stmt=connection.createStatement();
								ResultSet rSult=stmt.executeQuery(query);
								while(rSult.next()) {
									PhieuMuon p =new PhieuMuon(rSult.getString("maphieumuon"),rSult.getString("madg"), rSult.getInt("ngaymuon"), rSult.getInt("thangmuon"),rSult.getInt("nammuon"), rSult.getInt("ngaytra"), rSult.getInt("thangtra"),rSult.getInt("namtra"),rSult.getInt("Tongsl"));
									pmList_1.add(p);
								}
							} catch (Exception e) {
								// TODO: handle exception
							}
							return pmList_1;
					 }
					 
					 public static List<String> showdatacombobox(){
						 List<String> pmList_1=new ArrayList<>();
						 String query= "select*from phieumuon";
						 try {
								Connection connection=getJDBC();
								java.sql.Statement stmt=connection.createStatement();
								ResultSet rSult=stmt.executeQuery(query);
								while(rSult.next()) {
									String aString=new String(rSult.getString("maphieumuon"));
									pmList_1.add(aString);
								}
							} catch (Exception e) {
								// TODO: handle exception
							}
							return pmList_1;
					 }
		 
}
	