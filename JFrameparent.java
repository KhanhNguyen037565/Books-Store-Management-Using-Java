package quanly;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class JFrameparent extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameparent frame = new JFrameparent();
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
	public JFrameparent() {
		setFont(new Font("Arial", Font.PLAIN, 15));
		setForeground(SystemColor.windowText);
		setTitle("Story Rental Store");
		setDefaultCloseOperation(JFrameparent.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 757);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO STORY RENTAL STORE");
		lblNewLabel.setForeground(SystemColor.windowText);
		lblNewLabel.setFont(new Font("Britannic Bold", Font.PLAIN, 35));
		lblNewLabel.setBounds(248, 114, 589, 113);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên đăng nhập");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(433, 237, 200, 55);
		panel.add(lblNewLabel_1);
		
		txtusername = new JTextField();
		txtusername.setBounds(398, 302, 274, 51);
		panel.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mật Khẩu");
		lblNewLabel_1_1.setToolTipText("");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(467, 394, 129, 55);
		panel.add(lblNewLabel_1_1);
		
		//======== Sua lai: 97-107============================
		JButton btexit = new JButton("Thoát");
		btexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseFrame();
			}
		});
		btexit.setBackground(SystemColor.textHighlight);
		btexit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btexit.setBounds(346, 589, 152, 43);
		btexit.setBackground(Color.BLUE);
		panel.add(btexit);
		// ===================================================
		
		JButton btsignin = new JButton("Đăng Nhập");
		btsignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=txtusername.getText();
				String password=new String(txtpass.getPassword());
				
				StringBuilder sb= new StringBuilder();
				if(username.equals("")) {
					sb.append("Tên đăng nhập hiện đang trống!\n");
				}
				if(password.equals("")) {
					sb.append("Mật khẩu hiện đang trống!\n");
				}
				if(sb.length()>0) {
					JOptionPane.showMessageDialog(btsignin,sb.toString() ,"Xảy ra lỗi", JOptionPane.ERROR_MESSAGE);;
					return;
				}
				if(username.equals("storyrentalstore")&& password.equals("12345")) {
					CloseFrame();
					JFRameQL showJfRameQL= new JFRameQL();
					showJfRameQL.setVisible(true);
					
				}else JOptionPane.showMessageDialog(btsignin,"Tên đăng nhâp hoặc mật khẩu không đúng! ","Xảy ra lỗi ", JOptionPane.ERROR_MESSAGE);
			}
		});
		btsignin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsignin.setBackground(Color.BLUE);
		btsignin.setBounds(573, 589, 152, 43);
		panel.add(btsignin);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(398, 482, 274, 51);
		panel.add(txtpass);
	}
	public void CloseFrame() {
		this.dispose();
	}
}
//Chinh sua nut "Thoat" (Dong 97-107)