package java190124;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public class Phone_dialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField text_name;
	private JTextField text_age;
	private JTextField text_phoneNum;
	PhoneDAO controller;
	JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Phone_dialog dialog = new Phone_dialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Phone_dialog(JFrame frame, String title, PhoneDAO controller) {
		super(frame, title, true);
		//this.list = list;
		this.controller = controller;
		setBounds(100, 100, 294, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			SpringLayout sl_panel = new SpringLayout();
			panel.setLayout(sl_panel);
			{
				lblNewLabel = new JLabel("이름 입력 : ");
				sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, panel);
				sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -10, SpringLayout.EAST, panel);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("나이 입력 : ");
				sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 76, SpringLayout.SOUTH, lblNewLabel);
				sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("전화번호 입력 : ");
				sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -10, SpringLayout.SOUTH, panel);
				sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel);
				panel.add(lblNewLabel_2);
			}
		}
		{
			JPanel panel_1 = new JPanel();
			contentPanel.add(panel_1);
			SpringLayout sl_panel_1 = new SpringLayout();
			panel_1.setLayout(sl_panel_1);
			
			text_name = new JTextField();
			sl_panel_1.putConstraint(SpringLayout.NORTH, text_name, 10, SpringLayout.NORTH, panel_1);
			sl_panel_1.putConstraint(SpringLayout.WEST, text_name, 10, SpringLayout.WEST, panel_1);
			panel_1.add(text_name);
			text_name.setColumns(10);
			
			text_age = new JTextField();
			sl_panel_1.putConstraint(SpringLayout.NORTH, text_age, 67, SpringLayout.SOUTH, text_name);
			sl_panel_1.putConstraint(SpringLayout.WEST, text_age, 0, SpringLayout.WEST, text_name);
			panel_1.add(text_age);
			text_age.setColumns(10);
			
			text_phoneNum = new JTextField();
			sl_panel_1.putConstraint(SpringLayout.WEST, text_phoneNum, 0, SpringLayout.WEST, text_name);
			sl_panel_1.putConstraint(SpringLayout.SOUTH, text_phoneNum, -10, SpringLayout.SOUTH, panel_1);
			panel_1.add(text_phoneNum);
			text_phoneNum.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String name = "안바뀜";
						String phoneNum = "안바뀜";
						int age = -1;
						
						if(!text_name.getText().equals("") &&
								!text_phoneNum.getText().equals("") &&
								!text_age.getText().equals("")) {
							System.out.println("삽입실행!");
							name = text_name.getText();
							phoneNum = text_phoneNum.getText();
							age = Integer.parseInt(text_age.getText());
							controller.insert(name, phoneNum, age);
						}
						
						System.out.println(name+"\t"+phoneNum+"\t"+age);
						
						
						//Vector<String> model = controller.listPrint();
						//list = new JList(model);
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
