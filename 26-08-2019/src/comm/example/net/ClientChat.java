package comm.example.net;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ClientChat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientChat frame = new ClientChat();
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
	public ClientChat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(35, 26, 347, 132);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton(" Send");
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try
				{
					int portnumber = 1236;
			       
			        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
			        InetAddress group = InetAddress.getByName("224.0.0.1");
			       
			        chatMulticastSocket.joinGroup(group);
			        String msg = "";
			       
			        msg = textField.getText().toString();
			        // Send the message to Multicast address
			        DatagramPacket data = new DatagramPacket(msg.getBytes(), 0,msg.length(), group, portnumber);
			        chatMulticastSocket.send(data);
			        
			        // Close the socket
			        chatMulticastSocket.close();
				}catch (Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
		});
		btnSend.setBounds(165, 189, 89, 23);
		contentPane.add(btnSend);
	}
}
