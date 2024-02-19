package parkingticketsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class parkingticketinfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txttime;
	private JTextField txtlocation;
	private JTextField txtviolation;
	private JTextField txtfine;
	private JTextField txtstatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parkingticketinfo frame = new parkingticketinfo();
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
	public parkingticketinfo() {
		setTitle("PARKING TICKET INFORMATION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(76, 24, 143, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblIssueDateAnd = new JLabel("Issue Date and Time");
		lblIssueDateAnd.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIssueDateAnd.setBounds(76, 97, 143, 47);
		contentPane.add(lblIssueDateAnd);
		
		JLabel lblNewLabel_1_1 = new JLabel("Location");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(76, 173, 143, 47);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("violation type");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(76, 238, 143, 47);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fine Amount\r\n");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(76, 310, 143, 47);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Status");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(76, 380, 143, 47);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		txtID = new JTextField();
		txtID.setBounds(353, 39, 361, 32);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txttime = new JTextField();
		txttime.setColumns(10);
		txttime.setBounds(353, 112, 361, 32);
		contentPane.add(txttime);
		
		txtlocation = new JTextField();
		txtlocation.setColumns(10);
		txtlocation.setBounds(353, 188, 361, 32);
		contentPane.add(txtlocation);
		
		txtviolation = new JTextField();
		txtviolation.setColumns(10);
		txtviolation.setBounds(353, 253, 361, 32);
		contentPane.add(txtviolation);
		
		txtfine = new JTextField();
		txtfine.setColumns(10);
		txtfine.setBounds(353, 325, 361, 32);
		contentPane.add(txtfine);
		
		txtstatus = new JTextField();
		txtstatus.setColumns(10);
		txtstatus.setBounds(353, 395, 361, 32);
		contentPane.add(txtstatus);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(64, 462, 171, 47);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Update");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(371, 462, 171, 47);
		contentPane.add(btnClear);
		
		JButton btnNewButton_1_1 = new JButton("clear");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(670, 462, 171, 47);
		contentPane.add(btnNewButton_1_1);
	}

}
