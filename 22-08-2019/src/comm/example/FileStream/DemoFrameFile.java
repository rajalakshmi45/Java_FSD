package comm.example.FileStream;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DemoFrameFile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrameFile frame = new DemoFrameFile();
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
	public DemoFrameFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterText = new JLabel("Enter Text");
		lblEnterText.setBounds(44, 27, 113, 26);
		contentPane.add(lblEnterText);
		
		textField = new JTextField();
		textField.setBounds(54, 64, 330, 121);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				FileWriter out = null;
				try {
					out = new FileWriter(new File("output.txt"));
					PrintWriter outputStream = new PrintWriter(out);
					String l;
					while((l = textField.getText().toString()) != null)
					{
						System.out.println(l);
						outputStream.write(l);
					}
					out.close();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		btnSave.setBounds(54, 210, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnRead = new JButton("read");
		btnRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileReader reader;
				try {
					reader = new FileReader("output.txt");
					BufferedReader buffer = new BufferedReader(reader);
					String line = buffer.readLine();
					while(line != null) {
						textField.setText(line);
					}
				} 
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
			
		});
		
		btnRead.setBounds(227, 210, 89, 23);
		contentPane.add(btnRead);
		
	}
	
}
