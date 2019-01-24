package java190124;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PhoneGUI {

	private JFrame frame;
	static Vector<String> model;
	PhoneDAO controller = new PhoneDAO();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhoneGUI window = new PhoneGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PhoneGUI() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("PhoneGUI예제");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		//Phone_dialog dialog = new Phone_dialog(frame, "데이터베이스에 정보 삽입!");
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 69, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 424, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 141, SpringLayout.SOUTH, panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("전화목록");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_1424730655040");
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 424, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 42, SpringLayout.SOUTH, panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		model = controller.listPrint();
		JList<String> list = new JList<>(model);
		panel_4.add(new JScrollPane(list));
		
		
//		list.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				lblMusicPlayList.setText(con.prePlay());
//			}
//		});
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("이름    -");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, panel_3);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("나이    -");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 36, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호    -");
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -10, SpringLayout.SOUTH, panel_3);
		panel_3.add(lblNewLabel_3);
		
		JLabel lbl_name_print = new JLabel("");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lbl_name_print, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel_3.putConstraint(SpringLayout.WEST, lbl_name_print, 6, SpringLayout.EAST, lblNewLabel_1);
		panel_3.add(lbl_name_print);
		
		JLabel lbl_phoneNum_print = new JLabel("");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lbl_phoneNum_print, 0, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, lbl_phoneNum_print, 6, SpringLayout.EAST, lblNewLabel_3);
		panel_3.add(lbl_phoneNum_print);
		
		JLabel lbl_age_print = new JLabel("");
		sl_panel_3.putConstraint(SpringLayout.WEST, lbl_age_print, 6, SpringLayout.EAST, lblNewLabel_2);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lbl_age_print, 0, SpringLayout.SOUTH, lblNewLabel_2);
		panel_3.add(lbl_age_print);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 424, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JButton btn_phone_delete = new JButton("연락처삭제");
		sl_panel_2.putConstraint(SpringLayout.SOUTH, btn_phone_delete, -3, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, btn_phone_delete, -54, SpringLayout.EAST, panel_2);
		panel_2.add(btn_phone_delete);
		
		JButton btn_phone_insert = new JButton("연락처추가");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btn_phone_insert, 0, SpringLayout.NORTH, btn_phone_delete);
		sl_panel_2.putConstraint(SpringLayout.WEST, btn_phone_insert, 72, SpringLayout.WEST, panel_2);
		panel_2.add(btn_phone_insert);
		String selected;
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting()) {
					String temp = model.get(list.getSelectedIndex());
					lbl_name_print.setText(controller.getName(temp));
					lbl_age_print.setText(controller.getAge(temp));
					lbl_phoneNum_print.setText(controller.getPhoneNum(temp));
				}
			}
		});
		
		btn_phone_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Phone_dialog dialog = new Phone_dialog(frame, "데이터베이스에 정보 삽입!", controller);
				dialog.setVisible(true);
				lblNewLabel.setText("모달 다이얼로그에서 탈출!");
				model = controller.listPrint();
				list.setListData(model);
			}
		});
		
		btn_phone_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = model.get(list.getSelectedIndex());
				controller.delete(temp);
				model = controller.listPrint();
				list.setListData(model);
			}
		});
	}
}
