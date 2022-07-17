package quanly;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.ls.LSException;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Panel;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.nio.file.ClosedFileSystemException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;


public class JFRameQL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFRameQL frame = new JFRameQL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFRameQL() {
		
		setTitle("Story Rental Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 771);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 10, 985, 104);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		//============== Sua lai: 88 - 163 ==================
		// Them nut "Tro ve" (Dong 112 - 126). Them phuong thuc CloseFrame(); (Dong 1590)
		//Chinh sua lai gia tri cac button khac (vi tri, khoang cach, kich thuoc)
		JButton btnNewButton_1_1 = new JButton("Phiếu Mượn");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelPM(panel_1);
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1_1.setBounds(321, 10, 180, 75);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Tác Giả");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelTG(panel_1);
			}
		});
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1_1_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1_1_1.setBounds(499, 10, 165, 75);
		panel.add(btnNewButton_1_1_1);
		
		JButton quaylaiButton = new JButton("Trở về");
		quaylaiButton.setForeground(SystemColor.infoText);
		quaylaiButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CloseFrame();
				JFRameQL jQL = new JFRameQL();
				jQL.setVisible(true);
			}
		});
		quaylaiButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		quaylaiButton.setBackground(SystemColor.info);
		quaylaiButton.setBounds(844, 10, 131, 73);
		panel.add(quaylaiButton);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Truyện");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelT(panel_1);
			}
		});
		btnNewButton_1_1_1_1.setBounds(164, 10, 159, 75);
		panel.add(btnNewButton_1_1_1_1);
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1_1_1_1.setBackground(new Color(32, 178, 170));
		
		JButton btnNewButton = new JButton("Nhân Viên");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelNV(panel_1);
			}
		});
		btnNewButton.setBounds(0, 10, 165, 75);
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JButton btncGi = new JButton("Độc Giả");
		btncGi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelDG(panel_1);
			}
		});
		btncGi.setBounds(660, 10, 165, 75);
		panel.add(btncGi);
		btncGi.setForeground(Color.BLACK);
		btncGi.setFont(new Font("Tahoma", Font.BOLD, 22));
		btncGi.setBackground(new Color(32, 178, 170));
	}
	//============================================================
	public void creaPanelNV(JPanel x) {
		x.setVisible(false);
		JTextField txtmanv;
		JTextField txttennv;
		JTextField txtemail;
		JTextField txtphone;
		JTextField txtngay;
		JTextField txtthang;
		JTextField txtnam;
		JTextField txtaddress;
		JTextField txtnn;
		JTable table;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 24, 96, 29);
		panel_2.add(lblNewLabel);
		
		JComboBox boxsex = new JComboBox();
		boxsex.setBackground(SystemColor.info);
		boxsex.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		boxsex.setBounds(100, 178, 62, 34);
		panel_2.add(boxsex);
		
		JLabel lblNewLabel2 = new JLabel("@gmail.com");
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel2.setBounds(190, 130, 96, 29);
		panel_2.add(lblNewLabel2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 130, 96, 29);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tên nhân viên");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 75, 96, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Giới tính");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 180, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Số điện thoại");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 234, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Ngày sinh");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(10, 288, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(90, 277, 45, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tháng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(133, 277, 45, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(183, 277, 70, 13);
		panel_2.add(lblNewLabel_2);
		
		txtngay = new JTextField();
		txtngay.setColumns(10);
		txtngay.setBackground(SystemColor.info);
		txtngay.setBounds(100, 292, 26, 29);
		panel_2.add(txtngay);
		
		txtthang = new JTextField();
		txtthang.setColumns(10);
		txtthang.setBackground(SystemColor.info);
		txtthang.setBounds(143, 292, 26, 29);
		panel_2.add(txtthang);
		
		txtnam = new JTextField();
		txtnam.setColumns(10);
		txtnam.setBackground(SystemColor.info);
		txtnam.setBounds(193, 292, 50, 29);
		panel_2.add(txtnam);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Địa chỉ");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 338, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Chức vụ");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 394, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1);
		
		txtmanv = new JTextField();
		txtmanv.setBackground(SystemColor.info);
		txtmanv.setBounds(100, 25, 171, 29);
		panel_2.add(txtmanv);
		txtmanv.setColumns(10);
		
		txttennv = new JTextField();
		txttennv.setColumns(10);
		txttennv.setBackground(SystemColor.info);
		txttennv.setBounds(100, 76, 171, 29);
		panel_2.add(txttennv);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBackground(SystemColor.info);
		txtemail.setBounds(100, 132, 100, 29);
		panel_2.add(txtemail);
		
		txtphone = new JTextField();
		txtphone.setColumns(10);
		txtphone.setBackground(SystemColor.info);
		txtphone.setBounds(100, 238, 171, 29);
		panel_2.add(txtphone);
		
		
		txtaddress = new JTextField();
		txtaddress.setColumns(10);
		txtaddress.setBackground(SystemColor.info);
		txtaddress.setBounds(100, 344, 171, 29);
		panel_2.add(txtaddress);
		
		txtnn = new JTextField();
		txtnn.setColumns(10);
		txtnn.setBackground(SystemColor.info);
		txtnn.setBounds(100, 395, 171, 29);
		panel_2.add(txtnn);
		
		JButton btlammoi = new JButton("Làm mới");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmanv.setText("");
				txttennv.setText("");
				txtemail.setText("");
				txtphone.setText("");
				txtngay.setText("");
				txtthang.setText("");
				txtnam.setText("");
				txtaddress.setText("");
				txtnn.setText("");
			}
		});
		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(111, 460, 85, 21);
		panel_2.add(btlammoi);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"MANV", "TENNV", "EMAIL", "GIOITINH", "SDT", "NGAYSINH","THANGSINH","NAMSINH", "DIACHI", "CHUCVU"
			}
		));
		
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		showDataNV(ConnJDBC.showAllnv(), table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		
		JButton btthem = new JButton("Thêm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nVien=new NhanVien();
				int dem=0;
				nVien.setmaNv(txtmanv.getText()); dem++;
				nVien.settenNv(txttennv.getText()); dem++;
				nVien.setgioiTinh((String)boxsex.getSelectedItem()); dem++;
				String email = txtemail.getText();
				if((email.charAt(0) >=48 && email.charAt(0) <=57) || (email.charAt(0) >=65 && email.charAt(0) <=90) || (email.charAt(0) >= 97 && email.charAt(0) <=122)) {
					if((email.charAt(email.length()-1) >=48 && email.charAt(email.length()-1) <=57) || (email.charAt(email.length()-1) >=65 && email.charAt(email.length()-1) <=90) || (email.charAt(email.length()-1) >= 97 && email.charAt(email.length()-1) <=122)) {
						for(int i=1; i<email.length()-1;) {
							if(email.charAt(i) != 46 && email.charAt(i) < 48 || (email.charAt(i) > 57 && email.charAt(i) < 65) || (email.charAt(i) > 90 && email.charAt(i) < 97) || email.charAt(i) > 122) {
								JOptionPane.showMessageDialog(btthem,"Tên email không hợp lệ, tên chỉ chứa ký tự ascii (a-z), số (0-9) và dấu chấm (.)", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								break;
							}
							else {
								nVien.setemail(txtemail.getText() + lblNewLabel2.getText()); dem++;
								break;
							}
						}
					}		
					else
						JOptionPane.showMessageDialog(btthem,"Ký tự cuối cùng của email phải là số hoặc chữ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(btthem,"Ký tự đầu tiên của email phải là số hoặc chữ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				
				String sdt = txtphone.getText();
				if(sdt.length() == 10) {
					if(sdt.charAt(0) == '0') {
						for(int i=0; i<sdt.length();) {
							if(sdt.charAt(i) < 48 || sdt.charAt(i) > 57) {
								JOptionPane.showMessageDialog(btthem,"SĐT không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								break;
							}
							else {
								nVien.setsdt(txtphone.getText()); dem++;
								break;
							}
						}
					}
					else
						JOptionPane.showMessageDialog(btthem,"SĐT không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(btthem,"SĐT không hợp lệ!", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				
				int date = Integer.parseInt(txtngay.getText());
				int month = Integer.parseInt(txtthang.getText());
				int year = Integer.parseInt(txtnam.getText());
				if (year<0)
					JOptionPane.showMessageDialog(btthem,"Năm không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					if(month<=0 || month>12)
						JOptionPane.showMessageDialog(btthem,"Tháng không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
						if(date > 31)
							JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText()));
							nVien.setthangs(Integer.parseInt(txtthang.getText()));
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem+=3;
						}
					}
					else if(month==4 || month ==6 || month == 9 || month ==11){
				        if(date > 30)
				        	JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText()));
							nVien.setthangs(Integer.parseInt(txtthang.getText()));
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem+=3;
						}
				    }  
					else if(month==2){
						if(year %4 ==0 && year !=0){
				        	if(date > 29)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText()));
								nVien.setthangs(Integer.parseInt(txtthang.getText()));
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem+=3;
							}
				    	}  
				    	else{
				        	if(date > 28)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText()));
								nVien.setthangs(Integer.parseInt(txtthang.getText()));
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem+=3;
							}
				    	}
					}
				}
				nVien.setdiaChi(txtaddress.getText()); dem++;
				nVien.setchucVu(txtnn.getText()); dem++;
				if(dem == 10) {
					ConnJDBC.insertNV(nVien);
					JOptionPane.showMessageDialog(null, "Lưu Thành Công!");
				}
				else
					JOptionPane.showMessageDialog(null, "Lưu Không Thành Công!");
				showDataNV(ConnJDBC.showAllnv(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("Tìm kiếm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nVien=new NhanVien();
				nVien.settenNv(txttennv.getText());
				showDataNV(ConnJDBC.findNameNV(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("Xóa");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nVien=new NhanVien();
				nVien.setmaNv(txtmanv.getText());
				ConnJDBC.deletaNV(nVien);
				showDataNV(ConnJDBC.showAllnv(), table);
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("Sửa");
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nVien=new NhanVien();
				int dem=0;
				nVien.setmaNv(txtmanv.getText()); dem++;
				nVien.settenNv(txttennv.getText());dem++;
				nVien.setgioiTinh((String)boxsex.getSelectedItem());dem++;
				String email = txtemail.getText();
				if((email.charAt(0) >=48 && email.charAt(0) <=57) || (email.charAt(0) >=65 && email.charAt(0) <=90) || (email.charAt(0) >= 97 && email.charAt(0) <=122)) {
					if((email.charAt(email.length()-1) >=48 && email.charAt(email.length()-1) <=57) || (email.charAt(email.length()-1) >=65 && email.charAt(email.length()-1) <=90) || (email.charAt(email.length()-1) >= 97 && email.charAt(email.length()-1) <=122)) {
						for(int i=1; i<email.length()-1;) {
							if(email.charAt(i) != 46 && email.charAt(i) < 48 || (email.charAt(i) > 57 && email.charAt(i) < 65) || (email.charAt(i) > 90 && email.charAt(i) < 97) || email.charAt(i) > 122) {
								JOptionPane.showMessageDialog(btthem,"Tên email không hợp lệ, tên chỉ chứa ký tự ascii (a-z), số (0-9) và dấu chấm (.)", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								break;
							}
							else {
								nVien.setemail(txtemail.getText() + lblNewLabel2.getText()); dem++;
								break;
							}
						}
					}		
					else
						JOptionPane.showMessageDialog(btthem,"Ký tự cuối cùng của email phải là số hoặc chữ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(btthem,"Ký tự đầu tiên của email phải là số hoặc chữ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				
				String sdt = txtphone.getText();
				if(sdt.length() == 10) {
					if(sdt.charAt(0) == '0') {
						for(int i=0; i<sdt.length();) {
							if(sdt.charAt(i) < 48 || sdt.charAt(i) > 57) {
								JOptionPane.showMessageDialog(btthem,"SĐT không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								break;
							}
							else {
								nVien.setsdt(txtphone.getText()); dem++;
								break;
							}
						}
					}
					else
						JOptionPane.showMessageDialog(btthem,"SĐT không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(btthem,"SĐT không hợp lệ!", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				
				int date = Integer.parseInt(txtngay.getText());
				int month = Integer.parseInt(txtthang.getText());
				int year = Integer.parseInt(txtnam.getText());
				if (year<0)
					JOptionPane.showMessageDialog(btthem,"Năm không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					if(month<=0 || month>12)
						JOptionPane.showMessageDialog(btthem,"Tháng không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
						if(date > 31)
							JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
							nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
						}
					}
					else if(month==4 || month ==6 || month == 9 || month ==11){
				        if(date > 30)
				        	JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
							nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
						}
				    }  
					else if(month==2){
						if(year %4 ==0 && year !=0){
				        	if(date > 29)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
								nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
							}
				    	}  
				    	else{
				        	if(date > 28)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
								nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
							}
				    	}
					}
				}
				nVien.setdiaChi(txtaddress.getText()); dem++;
				nVien.setchucVu(txtnn.getText()); dem++;
				if(dem == 10) {
					ConnJDBC.updateNV(nVien);
					JOptionPane.showMessageDialog(null, "Lưu Thành Công!");
				}
				else
					JOptionPane.showMessageDialog(null, "Lưu Không Thành Công!");
					showDataNV(ConnJDBC.showAllnv(), table);
				}
		});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBackground(new Color(65, 105, 225));
		btsua.setBounds(289, 25, 134, 44);
		panel_4.add(btsua);
		panel_1.setVisible(true);
	}
	public void showDataNV(List<NhanVien> nv,JTable table ) {
		List<NhanVien> listnNhanViens=new ArrayList<>();
		listnNhanViens=nv;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listnNhanViens.size();i++) {
			tableModel.addRow(new Object [] {
					listnNhanViens.get(i).getmaNv(), listnNhanViens.get(i).gettenNv(),listnNhanViens.get(i).getemail(),listnNhanViens.get(i).getgioiTinh(),listnNhanViens.get(i).getsdt(),listnNhanViens.get(i).getngays(),listnNhanViens.get(i).getthangs(), listnNhanViens.get(i).getnams(),listnNhanViens.get(i).getdiaChi(),listnNhanViens.get(i).getchucVu()});
		}
	}
	public void creaPanelT(JPanel x) {
		x.setVisible(false);
		JTable table;
		JTextField txtmat;
		JTextField txttent;
		JTextField txtsl;
		JTextField txtnxb;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtmat = new JTextField();
		txtmat.setColumns(10);
		txtmat.setBackground(SystemColor.info);
		txtmat.setBounds(68, 60, 141, 29);
		panel_2.add(txtmat);
		
		txttent = new JTextField();
		txttent.setColumns(10);
		txttent.setBackground(SystemColor.info);
		txttent.setBounds(68, 148, 141, 29);
		panel_2.add(txttent);
		
		JLabel lblNewLabel_1 = new JLabel("Tên truyện");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(88, 109, 96, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Mã truyện");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(88, 21, 96, 29);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Số lượng");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(88, 201, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		txtsl = new JTextField();
		txtsl.setColumns(10);
		txtsl.setBackground(SystemColor.info);
		txtsl.setBounds(68, 240, 141, 29);
		panel_2.add(txtsl);
		
		txtnxb = new JTextField();
		txtnxb.setColumns(10);
		txtnxb.setBackground(SystemColor.info);
		txtnxb.setBounds(68, 346, 141, 29);
		panel_2.add(txtnxb);
		
		JButton btlammoi = new JButton("Làm mới");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmat.setText("");
				txttent.setText("");
				txtsl.setText("");
				txtnxb.setText("");
			}
		});
		
		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(99, 415, 85, 21);
		panel_2.add(btlammoi);
		
		
		
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nhà xuất bản");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(88, 301, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"MAT", "TENT", "MATL", "NXB"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		scrollPane.setViewportView(table);
		showDataT(ConnJDBC.showAllT(), table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btthem = new JButton("Thêm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truyen nVien=new Truyen();
				int dem=0;
				nVien.setmat(txtmat.getText()); dem++;
				nVien.settenT(txttent.getText()); dem++;
				int slt = Integer.parseInt(txtsl.getText());
				if(slt<0 || slt>20)
					JOptionPane.showMessageDialog(btthem,"Số lượng truyện không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					nVien.setsoLuong(Integer.parseInt(txtsl.getText())); dem++;
				}
				nVien.setnxb(txtnxb.getText()); dem++;
				if(dem == 4) {
					ConnJDBC.insertT(nVien);
					JOptionPane.showMessageDialog(null, "Lưu thành công!");
				}
				else
					JOptionPane.showMessageDialog(null, "Lưu Không thành công!");
				showDataT(ConnJDBC.showAllT(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("Tìm kiếm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truyen nVien=new Truyen();
				nVien.settenT(txttent.getText());
				showDataT(ConnJDBC.findNameT(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("Xóa");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truyen nVien=new Truyen();
				nVien.setmat(txtmat.getText());
				ConnJDBC.deletaT(nVien);
				showDataT(ConnJDBC.showAllT(), table);
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("Sửa");
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truyen nVien=new Truyen();
				int dem=0;
				nVien.setmat(txtmat.getText()); dem++;
				nVien.settenT(txttent.getText()); dem++;
				int slt = Integer.parseInt(txtsl.getText());
				if(slt<0 || slt>20)
					JOptionPane.showMessageDialog(btthem,"Số lượng truyện không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					nVien.setsoLuong(Integer.parseInt(txtsl.getText())); dem++;
				}
				nVien.setnxb(txtnxb.getText()); dem++;
				if(dem == 4) {
					ConnJDBC.updateT(nVien);
					JOptionPane.showMessageDialog(null, "Lưu thành công!");
				}
				else
					JOptionPane.showMessageDialog(null, "Lưu Không thành công!");
				showDataT(ConnJDBC.showAllT(), table);
			}
		});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBounds(289, 25, 134, 44);
		btsua.setBackground(new Color(65, 105, 225));
		panel_4.add(btsua);
		panel_1.setVisible(true);
		
	}
	public void showDataT(List<Truyen> truyens,JTable table ) {
		List<Truyen> listTruyens=new ArrayList<>();
		listTruyens=truyens;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listTruyens.size();i++) {
			tableModel.addRow(new Object [] {
					listTruyens.get(i).getmaT(), listTruyens.get(i).gettenT(),listTruyens.get(i).getsoLuong(),listTruyens.get(i).getnxb()});
		}
		
	}
	public void creaPanelPM(JPanel x) {
		JTable table;
		JTextField txtmaP;
		JTextField txtmadg;
		JTextField txtsl;
		JTextField txtngaymuon;
		JTextField txtthangmuon;
		JTextField txtnammuon;
		JTextField txtnamtra;
		JTextField txtthangtra;
		JTextField txtngaytra ;
		
		x.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtmaP = new JTextField();
		txtmaP.setColumns(10);
		txtmaP.setBackground(SystemColor.info);
		txtmaP.setBounds(68, 30, 141, 29);
		panel_2.add(txtmaP);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(180, 158, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tháng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(112, 158, 45, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(57, 158, 45, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		txtngaymuon = new JTextField();
		txtngaymuon.setColumns(10);
		txtngaymuon.setBackground(SystemColor.info);
		txtngaymuon.setBounds(68, 181, 26, 29);
		panel_2.add(txtngaymuon);
		
		txtthangmuon = new JTextField();
		txtthangmuon.setColumns(10);
		txtthangmuon.setBackground(SystemColor.info);
		txtthangmuon.setBounds(120, 181, 26, 29);
		panel_2.add(txtthangmuon);
		
		txtnammuon = new JTextField();
		txtnammuon.setColumns(10);
		txtnammuon.setBackground(SystemColor.info);
		txtnammuon.setBounds(177, 181, 50, 29);
		panel_2.add(txtnammuon);
		
		JLabel lblNewLabel_10 = new JLabel("Mã độc giả");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(110, 60, 96, 29);
		panel_2.add(lblNewLabel_10);
		
		txtmadg = new JTextField();
		txtmadg.setColumns(10);
		txtmadg.setBackground(SystemColor.info);
		txtmadg.setBounds(68, 87, 141, 29);
		panel_2.add(txtmadg);
		
		JLabel lblNewLabel_1 = new JLabel("Ngày mượn");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(88, 119, 96, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Mã phiếu mượn");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(88, 3, 96, 29);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ngày trả");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(88, 218, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		txtsl = new JTextField();
		txtsl.setColumns(10);
		txtsl.setBackground(SystemColor.info);
		txtsl.setBounds(68, 356, 141, 29);
		panel_2.add(txtsl);
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Tổng truyện");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(88, 311, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Năm");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(180, 254, 45, 13);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Tháng");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setBounds(112, 254, 45, 13);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(57, 254, 45, 13);
		panel_2.add(lblNewLabel_2_1_1_1);
		
		txtnamtra = new JTextField();
		txtnamtra.setColumns(10);
		txtnamtra.setBackground(SystemColor.info);
		txtnamtra.setBounds(177, 272, 50, 29);
		panel_2.add(txtnamtra);
		
		txtthangtra = new JTextField();
		txtthangtra.setColumns(10);
		txtthangtra.setBackground(SystemColor.info);
		txtthangtra.setBounds(120, 272, 26, 29);
		panel_2.add(txtthangtra);
		
		txtngaytra = new JTextField();
		txtngaytra.setColumns(10);
		txtngaytra.setBackground(SystemColor.info);
		txtngaytra.setBounds(68, 272, 26, 29);
		panel_2.add(txtngaytra);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		JButton btlammoi = new JButton("Làm mới");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmaP.setText("");
				txtmadg.setText("");
				txtngaymuon.setText("");
				txtthangmuon.setText("");
				txtnammuon.setText("");
				txtsl.setText("");
				txtngaytra.setText("");
				txtthangtra.setText("");
				txtnamtra.setText("");
			}
		});
		
		

		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(99, 425, 85, 21);
		panel_2.add(btlammoi);
		
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
			},
			new String[] {
				"MAPM","MADG","NGAYMUON","THANGMUON","NAMMUON", "NGAYTRA","THANGTRA","NAMTRA", "TONGSL"
			}
		));
		showDataPM(ConnJDBC.showAllPM(), table);
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btthem = new JButton("Thêm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuMuon nVien=new PhieuMuon();
				int dem=0;
				nVien.setmaPm(txtmaP.getText()); dem++;
				nVien.setmaDg(txtmadg.getText()); dem++;
				
				int date = Integer.parseInt(txtngaymuon.getText());
				int month = Integer.parseInt(txtthangmuon.getText());
				int year = Integer.parseInt(txtnammuon.getText());
				if (year<0)
					JOptionPane.showMessageDialog(btthem,"Năm mượn không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					if(month<=0 || month>12)
						JOptionPane.showMessageDialog(btthem,"Tháng mượn không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
						if(date > 31)
							JOptionPane.showMessageDialog(btthem,"Ngày mượn không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText())); dem++;
							nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText())); dem++;
							nVien.setnammuon(Integer.parseInt(txtnammuon.getText())); dem++;
						}
					}
					else if(month==4 || month ==6 || month == 9 || month ==11){
				        if(date > 30)
				        	JOptionPane.showMessageDialog(btthem,"Ngày mượn không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText())); dem++;
							nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText())); dem++;
							nVien.setnammuon(Integer.parseInt(txtnammuon.getText())); dem++;
						}
				    }  
					else if(month==2){
						if(year %4 ==0 && year !=0){
				        	if(date > 29)
				        		JOptionPane.showMessageDialog(btthem,"Ngày mượn không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText())); dem++;
								nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText())); dem++;
								nVien.setnammuon(Integer.parseInt(txtnammuon.getText())); dem++;
							}
				    	}  
				    	else{
				        	if(date > 28)
				        		JOptionPane.showMessageDialog(btthem,"Ngày mượn không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText())); dem++;
								nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText())); dem++;
								nVien.setnammuon(Integer.parseInt(txtnammuon.getText())); dem++;
							}
				    	}
					}
				}
				
				int date1 = Integer.parseInt(txtngaytra.getText());
				int month1 = Integer.parseInt(txtthangtra.getText());
				int year1 = Integer.parseInt(txtnamtra.getText());
				if(year1<0)
					JOptionPane.showMessageDialog(btthem,"Năm trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else if (year>year1)
					JOptionPane.showMessageDialog(btthem,"Năm trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else if (year == year1) {
					if(month1<=0 || month1>12)
						JOptionPane.showMessageDialog(btthem,"Tháng trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else if(month>month1)
						JOptionPane.showMessageDialog(btthem,"Tháng trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else if(month == month1) {
						if(month1==1 || month1 ==3 || month1 == 5 || month1 ==7 || month1 ==8 || month1 ==10 || month1==12){
							if(date1 > 31)
								JOptionPane.showMessageDialog(btthem,"Ngày trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else if(date>date1)
								JOptionPane.showMessageDialog(btthem,"Ngày trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngaytra(Integer.parseInt(txtngaytra.getText())); dem++;
							}
						}
						else if(month1==4 || month1 ==6 || month1 == 9 || month1==11) {
							 if(date1 > 30)
						        JOptionPane.showMessageDialog(btthem,"Ngày trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							 else if(date>date1)
								 JOptionPane.showMessageDialog(btthem,"Ngày trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							 else {
								 nVien.setngaytra(Integer.parseInt(txtngaytra.getText())); dem++;
							 }
						}
						else if(month1==2) {
							if(year1 %4 ==0 && year1 !=0){
					        	if(date1 > 29)
					        		JOptionPane.showMessageDialog(btthem,"Ngày trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else if(date>date1)
									JOptionPane.showMessageDialog(btthem,"Ngày trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else {
									nVien.setngaytra(Integer.parseInt(txtngaytra.getText())); dem++;
								}
					    	}  
					    	else{
					    		if(date1 > 28)
					        		JOptionPane.showMessageDialog(btthem,"Ngày trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else if(date>date1)
									JOptionPane.showMessageDialog(btthem,"Ngày trả không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else {
									nVien.setngaytra(Integer.parseInt(txtngaytra.getText())); dem++;
								}
					    	}
						}
					}
					else {
						nVien.setthangtra(Integer.parseInt(txtthangtra.getText())); dem++;
					}
				}
				else {
					nVien.setnamtra(Integer.parseInt(txtnamtra.getText())); dem++;
				}
				
				int tong = Integer.parseInt(txtsl.getText());
				if(tong<1 || tong>50)
					JOptionPane.showMessageDialog(btthem,"Tổng truyện không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					nVien.settong(Integer.parseInt(txtsl.getText())); dem++;
				}
				System.out.println(txtmaP);
				
				if(dem == 9) {
					ConnJDBC.insertPM(nVien);
					JOptionPane.showMessageDialog(null, "Lưu Thành Công!");
				}
				else
					JOptionPane.showMessageDialog(null, "Lưu Không Thành Công!");
				showDataPM(ConnJDBC.showAllPM(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("Tìm kiếm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuMuon nVien=new PhieuMuon();
				nVien.setmaPm(txtmaP.getText());
				showDataPM(ConnJDBC.findNamePM(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("Xóa");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuMuon nVien=new PhieuMuon();
				nVien.setmaPm(txtmaP.getText());
				ConnJDBC.deletaPM(nVien);
				showDataPM(ConnJDBC.showAllPM(), table);
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("Sửa");
			btsua.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PhieuMuon nVien=new PhieuMuon();
					int dem=0;
					nVien.setmaPm(txtmaP.getText()); dem++;
					nVien.setmaDg(txtmadg.getText()); dem++;
					int date = Integer.parseInt(txtngaymuon.getText());
					int month = Integer.parseInt(txtthangmuon.getText());
					int year = Integer.parseInt(txtnammuon.getText());
					if (year<0)
						JOptionPane.showMessageDialog(btthem,"Năm không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else {
						if(month<=0 || month>12)
							JOptionPane.showMessageDialog(btthem,"Tháng không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
							if(date > 31)
								JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText())); dem++;
								nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText())); dem++;
								nVien.setnammuon(Integer.parseInt(txtnammuon.getText())); dem++;
							}
						}
						else if(month==4 || month ==6 || month == 9 || month ==11){
					        if(date > 30)
					        	JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText())); dem++;
								nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText())); dem++;
								nVien.setnammuon(Integer.parseInt(txtnammuon.getText())); dem++;
							}
					    }  
						else if(month==2){
							if(year %4 ==0 && year !=0){
					        	if(date > 29)
					        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else {
									nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText())); dem++;
									nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText())); dem++;
									nVien.setnammuon(Integer.parseInt(txtnammuon.getText())); dem++;
								}
					    	}  
					    	else{
					        	if(date > 28)
					        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else {
									nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText())); dem++;
									nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText())); dem++;
									nVien.setnammuon(Integer.parseInt(txtnammuon.getText())); dem++;
								}
					    	}
						}
					}
					
					int date1 = Integer.parseInt(txtngaymuon.getText());
					int month1 = Integer.parseInt(txtthangmuon.getText());
					int year1 = Integer.parseInt(txtnammuon.getText());
					if (year1<0)
						JOptionPane.showMessageDialog(btthem,"Năm không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else {
						if(month1<=0 || month1>12)
							JOptionPane.showMessageDialog(btthem,"Tháng không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else if(month1==1 || month1 ==3 || month1 == 5 || month1 ==7 || month1 ==8 || month1 ==10 || month1==12){
							if(date1 > 31)
								JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngaytra(Integer.parseInt(txtngaytra.getText())); dem++;
								nVien.setthangtra(Integer.parseInt(txtthangtra.getText())); dem++;
								nVien.setnamtra(Integer.parseInt(txtnamtra.getText())); dem++;
							}
						}
						else if(month1==4 || month1 ==6 || month1 == 9 || month1==11){
					        if(date1 > 30)
					        	JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngaytra(Integer.parseInt(txtngaytra.getText())); dem++;
								nVien.setthangtra(Integer.parseInt(txtthangtra.getText())); dem++;
								nVien.setnamtra(Integer.parseInt(txtnamtra.getText())); dem++;
							}
					    }  
						else if(month1==2){
							if(year1 %4 ==0 && year1 !=0){
					        	if(date1 > 29)
					        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else {
									nVien.setngaytra(Integer.parseInt(txtngaytra.getText())); dem++;
									nVien.setthangtra(Integer.parseInt(txtthangtra.getText())); dem++;
									nVien.setnamtra(Integer.parseInt(txtnamtra.getText())); dem++;
								}
					    	}  
					    	else{
					        	if(date1 > 28)
					        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else {
									nVien.setngaytra(Integer.parseInt(txtngaytra.getText())); dem++;
									nVien.setthangtra(Integer.parseInt(txtthangtra.getText())); dem++;
									nVien.setnamtra(Integer.parseInt(txtnamtra.getText())); dem++;
								}
					    	}
						}
					}
					int tong = Integer.parseInt(txtsl.getText());
					if(tong<1 || tong>50)
						JOptionPane.showMessageDialog(btthem,"Tổng truyện không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else {
						nVien.settong(Integer.parseInt(txtsl.getText())); dem++;
					}
					if(dem == 9) {
						ConnJDBC.updatePM(nVien);
						JOptionPane.showMessageDialog(null, "Lưu Thành Công!");
					}
					else
						JOptionPane.showMessageDialog(null, "Lưu Không Thành Công!");
					showDataPM(ConnJDBC.showAllPM(), table);
				}
			});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBackground(new Color(65, 105, 225));
		btsua.setBounds(289, 25, 134, 44);
		panel_4.add(btsua);
		panel_1.setVisible(true);

	}
	public void showDataPM(List<PhieuMuon> truyens,JTable table ) {
		List<PhieuMuon> listTruyens=new ArrayList<>();
		listTruyens=truyens;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listTruyens.size();i++) {
			tableModel.addRow(new Object [] {
					listTruyens.get(i).getmaPm(),listTruyens.get(i).getmaDg(), listTruyens.get(i).getngaymuon(),listTruyens.get(i).getthangmuon(),listTruyens.get(i).getnammuon(),listTruyens.get(i).getngaytra(),listTruyens.get(i).getthangtra(),listTruyens.get(i).getnamtra(),listTruyens.get(i).gettong()});
		}
		
	}
	public void creaPanelTG(JPanel x) {
		x.setVisible(false);
		JTable table;
		JTextField txtten;
		JTextField txtmatg;
		JTextField txtngay;
		JTextField txtthang;
		JTextField txtnam;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ngày sinh");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(88, 296, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		txtten = new JTextField();
		txtten.setColumns(10);
		txtten.setBackground(SystemColor.info);
		txtten.setBounds(68, 210, 141, 29);
		panel_2.add(txtten);
		
		JLabel lblNewLabel_1 = new JLabel("Tên");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(88, 172, 96, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Mã tác giả");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(88, 32, 96, 29);
		panel_2.add(lblNewLabel);
		
		txtmatg = new JTextField();
		txtmatg.setColumns(10);
		txtmatg.setBackground(SystemColor.info);
		txtmatg.setBounds(68, 81, 141, 29);
		panel_2.add(txtmatg);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(174, 335, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tháng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(109, 335, 45, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(47, 335, 45, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		txtngay = new JTextField();
		txtngay.setColumns(10);
		txtngay.setBackground(SystemColor.info);
		txtngay.setBounds(57, 356, 26, 29);
		panel_2.add(txtngay);
		
		txtthang = new JTextField();
		txtthang.setColumns(10);
		txtthang.setBackground(SystemColor.info);
		txtthang.setBounds(120, 356, 26, 29);
		panel_2.add(txtthang);
		
		txtnam = new JTextField();
		txtnam.setColumns(10);
		txtnam.setBackground(SystemColor.info);
		txtnam.setBounds(175, 356, 50, 29);
		panel_2.add(txtnam);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		JButton btlammoi = new JButton("Làm mới");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmatg.setText("");
				txtten.setText("");
				txtngay.setText("");
				txtthang.setText("");
				txtnam.setText("");
			}
		});
		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(99, 415, 85, 21);
		panel_2.add(btlammoi);
		
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null,null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
			},
			new String[] {
				"MATG", "TEN", "NGAYSINH","THANGSINH","NAMSINH"
			}
		));
		showDataTG(ConnJDBC.showAllTG(), table);
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btthem = new JButton("Thêm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacGia nVien=new TacGia();
				int dem =0;
				nVien.setmaTG(txtmatg.getText()); dem++;
				nVien.settenTG(txtten.getText()); dem++;
				int date = Integer.parseInt(txtngay.getText());
				int month = Integer.parseInt(txtthang.getText());
				int year = Integer.parseInt(txtnam.getText());
				if (year<0)
					JOptionPane.showMessageDialog(btthem,"Năm không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					if(month<=0 || month>12)
						JOptionPane.showMessageDialog(btthem,"Tháng không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
						if(date > 31)
							JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
							nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
						}
					}
					else if(month==4 || month ==6 || month == 9 || month ==11){
				        if(date > 30)
				        	JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
							nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
						}
				    }  
					else if(month==2){
						if(year %4 ==0 && year !=0){
				        	if(date > 29)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
								nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
							}
				    	}  
				    	else{
				        	if(date > 28)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
								nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
							}
				    	}
					}
				}
				
				if(dem == 5) {
					ConnJDBC.insertTG(nVien);
					JOptionPane.showMessageDialog(null, "Lưu Thành Công!");
				}
				else
					JOptionPane.showMessageDialog(null, "Lưu Không Thành Công!");
				showDataTG(ConnJDBC.showAllTG(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("Tìm kiếm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacGia nVien=new TacGia();
				nVien.settenTG(txtten.getText());
				showDataTG(ConnJDBC.findNameTG(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("Xóa");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacGia nVien=new TacGia();
				nVien.setmaTG(txtmatg.getText());
				ConnJDBC.deletaTG(nVien);
				showDataTG(ConnJDBC.showAllTG(), table);
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("Sửa");
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacGia nVien=new TacGia();
				int dem=0;
				nVien.setmaTG(txtmatg.getText()); dem++;
				nVien.settenTG(txtten.getText()); dem++;
				int date = Integer.parseInt(txtngay.getText());
				int month = Integer.parseInt(txtthang.getText());
				int year = Integer.parseInt(txtnam.getText());
				if (year<0)
					JOptionPane.showMessageDialog(btthem,"Năm không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					if(month<=0 || month>12)
						JOptionPane.showMessageDialog(btthem,"Tháng không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
						if(date > 31)
							JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
							nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
						}
					}
					else if(month==4 || month ==6 || month == 9 || month ==11){
				        if(date > 30)
				        	JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
							nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
						}
				    }  
					else if(month==2){
						if(year %4 ==0 && year !=0){
				        	if(date > 29)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
								nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
							}
				    	}  
				    	else{
				        	if(date > 28)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
								nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
							}
				    	}
					}
				}
				if(dem == 5) {
					ConnJDBC.updateTG(nVien);
					JOptionPane.showMessageDialog(null, "Lưu Thành Công!");
				}
				else
					JOptionPane.showMessageDialog(null, "Lưu Không Thành Công!");
				showDataTG(ConnJDBC.showAllTG(), table);
			}
		});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBackground(new Color(65, 105, 225));
		btsua.setBounds(289, 25, 134, 44);
		panel_4.add(btsua);
		panel_1.setVisible(true);
	}
	public void showDataTG(List<TacGia> truyens,JTable table ) {
		List<TacGia> listTruyens=new ArrayList<>();
		listTruyens=truyens;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listTruyens.size();i++) {
			tableModel.addRow(new Object [] {
					listTruyens.get(i).getmaTG(), listTruyens.get(i).gettenTG(),listTruyens.get(i).getngays(),listTruyens.get(i).getthangs(),listTruyens.get(i).getnams(),listTruyens.get(i).getnams()});
		}
		
	}
	public void creaPanelDG(JPanel x) {
		x.setVisible(false);
		JTable table;
		JTextField txtmadg;
		JTextField txtten;
		JTextField txtsdt;
		JTextField txtemail;
		JTextField txtdiachi;
		JTextField txtngay;
		JTextField txtthang;
		JTextField txtnam;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã độc giả");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 27, 96, 29);
		panel_2.add(lblNewLabel);
		
		txtmadg = new JTextField();
		txtmadg.setColumns(10);
		txtmadg.setBackground(SystemColor.info);
		txtmadg.setBounds(116, 27, 141, 29);
		panel_2.add(txtmadg);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tên");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 100, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ngày sinh");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 179, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(205, 162, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tháng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(148, 162, 45, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(105, 162, 45, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		txtngay = new JTextField();
		txtngay.setColumns(10);
		txtngay.setBackground(SystemColor.info);
		txtngay.setBounds(115, 180, 26, 29);
		panel_2.add(txtngay);
		
		txtthang = new JTextField();
		txtthang.setColumns(10);
		txtthang.setBackground(SystemColor.info);
		txtthang.setBounds(158, 180, 26, 29);
		panel_2.add(txtthang);
		
		txtnam = new JTextField();
		txtnam.setColumns(10);
		txtnam.setBackground(SystemColor.info);
		txtnam.setBounds(205, 180, 50, 29);
		panel_2.add(txtnam);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Địa chỉ");
		lblNewLabel_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(10, 403, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 350, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Giới tính");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(10, 236, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Số điện thoại");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 292, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		
		txtten = new JTextField();
		txtten.setColumns(10);
		txtten.setBackground(SystemColor.info);
		txtten.setBounds(116, 100, 141, 29);
		panel_2.add(txtten);
		
		txtsdt = new JTextField();
		txtsdt.setColumns(10);
		txtsdt.setBackground(SystemColor.info);
		txtsdt.setBounds(116, 292, 141, 29);
		panel_2.add(txtsdt);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBackground(SystemColor.info);
		txtemail.setBounds(116, 350, 141, 29);
		panel_2.add(txtemail);
		
		txtdiachi = new JTextField();
		txtdiachi.setColumns(10);
		txtdiachi.setBackground(SystemColor.info);
		txtdiachi.setBounds(116, 409, 141, 29);
		panel_2.add(txtdiachi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		comboBox.setBounds(116, 236, 64, 26);
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		JButton btlammoi = new JButton("Làm mới");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmadg.setText("");
				txtten.setText("");
				txtngay.setText("");
				txtthang.setText("");
				txtnam.setText("");
				txtsdt.setText("");
				txtemail.setText("");
				txtdiachi.setText("");
			}
		});
		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(107, 460, 85, 21);
		panel_2.add(btlammoi);
		
		
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
			},
			new String[] {
				"MADG", "TEN", "NGAYSINH","THANGSINH","NAMSINH", "GIOITINH", "SDT", "EMAIL", "DIACHI"
			}
		));
		showDataDG(ConnJDBC.showAllDG(), table);
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btthem = new JButton("Thêm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DocGia nVien=new DocGia();
				int dem=0;
				nVien.setmaDg(txtmadg.getText()); dem++;
				nVien.settenDg(txtten.getText()); dem++;
				
				int date = Integer.parseInt(txtngay.getText());
				int month = Integer.parseInt(txtthang.getText());
				int year = Integer.parseInt(txtnam.getText());
				if (year<0)
					JOptionPane.showMessageDialog(btthem,"Năm không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				else {
					if(month<=0 || month>12)
						JOptionPane.showMessageDialog(btthem,"Tháng không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
					else if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
						if(date > 31)
							JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
							nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
						}
					}
					else if(month==4 || month ==6 || month == 9 || month ==11){
				        if(date > 30)
				        	JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
							nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
							nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
						}
				    }  
					else if(month==2){
						if(year %4 ==0 && year !=0){
				        	if(date > 29)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
								nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
							}
				    	}  
				    	else{
				        	if(date > 28)
				        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else {
								nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
								nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
								nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
							}
				    	}
					}
				}
				
				nVien.setgioiTinh((String)comboBox.getSelectedItem()); dem++;
				String sdt = txtsdt.getText();
				if(sdt.length() == 10) {
					if(sdt.charAt(0) == '0') {
						for(int i=0; i<sdt.length();) {
							if(sdt.charAt(i) < 48 || sdt.charAt(i) > 57) {
								JOptionPane.showMessageDialog(btthem,"SĐT không hop lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								break;
							}
							else {
								nVien.setsdt(txtsdt.getText()); dem++;
								break;
							}
						}
					}
					else
						JOptionPane.showMessageDialog(btthem,"SĐT không hop lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(btthem,"SĐT không hop lệ!", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				
				String email = txtemail.getText();
				if((email.charAt(0) >=48 && email.charAt(0) <=57) || (email.charAt(0) >=65 && email.charAt(0) <=90) || (email.charAt(0) >= 97 && email.charAt(0) <=122)) {
					if((email.charAt(email.length()-1) >=48 && email.charAt(email.length()-1) <=57) || (email.charAt(email.length()-1) >=65 && email.charAt(email.length()-1) <=90) || (email.charAt(email.length()-1) >= 97 && email.charAt(email.length()-1) <=122)) {
						for(int i=1; i<email.length()-1;) {
							if(email.charAt(i) != 46 && email.charAt(i) < 48 || (email.charAt(i) > 57 && email.charAt(i) < 65) || (email.charAt(i) > 90 && email.charAt(i) < 97) || email.charAt(i) > 122) {
								JOptionPane.showMessageDialog(btthem,"Tên email không hợp lệ, tên chỉ chứa ký tự ascii (a-z), số (0-9) và dấu chấm (.)", "Xay ra lỗi", JOptionPane.ERROR_MESSAGE);
								break;
							}
							else {
								nVien.setemail(txtemail.getText()); dem++;
								break;
							}
						}
					}		
					else
						JOptionPane.showMessageDialog(btthem,"Ký tự cuối cùng của email phải là số hoặc chữ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(btthem,"Ký tự đầu tiên của email phải là số hoặc chữ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
				
				nVien.setdiaChi(txtdiachi.getText()); dem++;
				if(dem == 8) {
					ConnJDBC.insertDG(nVien);
					JOptionPane.showMessageDialog(null, "Lưu Thành Công!");
				}
				else
					JOptionPane.showMessageDialog(null, "Lưu Không Thành Công!");
				showDataDG(ConnJDBC.showAllDG(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("Tìm kiếm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DocGia nVien=new DocGia();
				nVien.settenDg(txtten.getText());
				showDataDG(ConnJDBC.findNameDG(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("Xóa");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btxoa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DocGia nVien=new DocGia();
						nVien.setmaDg(txtmadg.getText());
						ConnJDBC.deletaDG(nVien);
						showDataDG(ConnJDBC.showAllDG(), table);
					}
				});
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("Sửa");
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btsua.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DocGia nVien=new DocGia();
						int dem=0;
						nVien.setmaDg(txtmadg.getText()); dem++;
						nVien.settenDg(txtten.getText()); dem++;
						
						int date = Integer.parseInt(txtngay.getText());
						int month = Integer.parseInt(txtthang.getText());
						int year = Integer.parseInt(txtnam.getText());
						if (year<0)
							JOptionPane.showMessageDialog(btthem,"Năm không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						else {
							if(month<=0 || month>12)
								JOptionPane.showMessageDialog(btthem,"Tháng không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
							else if(month==1 || month ==3 || month == 5 || month ==7 || month ==8 || month ==10 || month==12){
								if(date > 31)
									JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else {
									nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
									nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
									nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
								}
							}
							else if(month==4 || month ==6 || month == 9 || month ==11){
						        if(date > 30)
						        	JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
								else {
									nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
									nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
									nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
								}
						    }  
							else if(month==2){
								if(year %4 ==0 && year !=0){
						        	if(date > 29)
						        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
									else {
										nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
										nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
										nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
									}
						    	}  
						    	else{
						        	if(date > 28)
						        		JOptionPane.showMessageDialog(btthem,"Ngày không hợp lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
									else {
										nVien.setngays(Integer.parseInt(txtngay.getText())); dem++;
										nVien.setthangs(Integer.parseInt(txtthang.getText())); dem++;
										nVien.setnams(Integer.parseInt(txtnam.getText())); dem++;
									}
						    	}
							}
						}
						
						nVien.setgioiTinh((String)comboBox.getSelectedItem());
						
						String sdt = txtsdt.getText();
						if(sdt.length() == 10) {
							if(sdt.charAt(0) == '0') {
								for(int i=0; i<sdt.length();) {
									if(sdt.charAt(i) < 48 || sdt.charAt(i) > 57) {
										JOptionPane.showMessageDialog(btthem,"SĐT không hop lệ", "Xay ra lỗi", JOptionPane.ERROR_MESSAGE);
										break;
									}
									else {
										nVien.setsdt(txtsdt.getText()); dem++;
										break;
									}
								}
							}
							else
								JOptionPane.showMessageDialog(btthem,"SĐT không hop lệ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						}
						else
							JOptionPane.showMessageDialog(btthem,"SĐT không hop lệ!", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						
						String email = txtemail.getText();
						if((email.charAt(0) >=48 && email.charAt(0) <=57) || (email.charAt(0) >=65 && email.charAt(0) <=90) || (email.charAt(0) >= 97 && email.charAt(0) <=122)) {
							if((email.charAt(email.length()-1) >=48 && email.charAt(email.length()-1) <=57) || (email.charAt(email.length()-1) >=65 && email.charAt(email.length()-1) <=90) || (email.charAt(email.length()-1) >= 97 && email.charAt(email.length()-1) <=122)) {
								for(int i=1; i<email.length()-1;) {
									if(email.charAt(i) != 46 && email.charAt(i) < 48 || (email.charAt(i) > 57 && email.charAt(i) < 65) || (email.charAt(i) > 90 && email.charAt(i) < 97) || email.charAt(i) > 122) {
										JOptionPane.showMessageDialog(btthem,"Tên email không hợp lệ, tên chỉ chứa ký tự ascii (a-z), số (0-9) và dấu chấm (.)", "Xay ra lỗi", JOptionPane.ERROR_MESSAGE);
										break;
									}
									else {
										nVien.setemail(txtemail.getText()); dem++;
										break;
									}
								}
							}		
							else
								JOptionPane.showMessageDialog(btthem,"Ký tự cuối cùng của email phải là số hoặc chữ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						}
						else
							JOptionPane.showMessageDialog(btthem,"Ký tự đầu tiên của email phải là số hoặc chữ", "Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);
						
						nVien.setdiaChi(txtdiachi.getText()); dem++;
						if(dem == 8) {
							ConnJDBC.updateDG(nVien);
							JOptionPane.showMessageDialog(null, "Lưu Thành Công!");
						}
						else
							JOptionPane.showMessageDialog(null, "Lưu Không Thành Công!");
						showDataDG(ConnJDBC.showAllDG(), table);
					}
				});
			}
		});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBackground(new Color(65, 105, 225));
		btsua.setBounds(289, 25, 134, 44);
		panel_4.add(btsua);
		panel_1.setVisible(true);
	}
	public void showDataDG(List<DocGia> truyens,JTable table ) {
		List<DocGia> listTruyens=new ArrayList<>();
		listTruyens=truyens;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listTruyens.size();i++) {
			tableModel.addRow(new Object [] {
					listTruyens.get(i).getmaDg(),listTruyens.get(i).gettenDg(),listTruyens.get(i).getngays(),listTruyens.get(i).getthangs(),listTruyens.get(i).getnams(), listTruyens.get(i).getgioiTinh(),listTruyens.get(i).getsdt(),listTruyens.get(i).getemail(),listTruyens.get(i).getdiaChi()});
		}
		
	}
	public void CloseFrame() {
		this.dispose();
	}
}
//============== Sua lai: 88 - 163 ==================
// Them nut "Tro ve" (Dong 112 - 126). Them phuong thuc CloseFrame(); (Dong 1590)
//Chinh sua lai gia tri cac button khac (vi tri, khoang cach, kich thuoc)