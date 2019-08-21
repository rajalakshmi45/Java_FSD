package comm.example.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DemoFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
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
	public DemoFrame() {
		try {
			EmployeeService emp = new EmployeeServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][grow]", "[][][][][][][][][][][]"));
		
		JLabel label = new JLabel("");
		contentPane.add(label, "cell 0 0");
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		contentPane.add(lblEmployeeId, "cell 1 1");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 3 1,alignx left");
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		contentPane.add(lblFirstName, "cell 1 2");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 3 2,alignx left");
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		contentPane.add(lblLastName, "cell 1 3");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 3 3,alignx left");
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		contentPane.add(lblEmail, "cell 1 4");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 3 4,alignx left");
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "cell 3 5,alignx left");
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				
			}
		});
		
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		     EmployeeService emp;
			try {
				emp = new EmployeeServiceImpl();
				emp.createEmployee(new Employee(Integer.parseInt(textField.getText()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString()));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    
			}
		});
		contentPane.add(btnNewButton, "cell 1 7,aligny top");
		contentPane.add(btnNewButton_1, "flowx,cell 3 7");
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EmployeeService emp1;
				try
				{
					emp1 = new EmployeeServiceImpl();
					emp1.deleteEmployee(Integer.parseInt(textField_4.getText()));
				}catch (SQLException e2)
				{
					e2.printStackTrace();
				}
			}
		});
		
		contentPane.add(btnNewButton_2, "cell 3 7");
		
		JButton btnViewData = new JButton("view data");
		btnViewData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					new DemoFrame2();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		contentPane.add(btnViewData, "cell 2 9");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
