package parkingticketsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PaymentInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfid;
	private JTextField tfmethod;
	private JTextField tfpaid;
	private JTextField tftime;
	private JTextField tftransaction;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentInfo frame = new PaymentInfo();
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
	public PaymentInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PaymentID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 38, 188, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblPaymentmethod = new JLabel("PaymentMethod");
		lblPaymentmethod.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPaymentmethod.setBounds(38, 131, 188, 52);
		contentPane.add(lblPaymentmethod);
		
		JLabel lblNewLabel_1_1 = new JLabel("AmountPaid");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(38, 217, 188, 52);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PaymentDate&Time");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(38, 304, 188, 52);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("TransactionID");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(38, 392, 188, 52);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		tfid = new JTextField();
		tfid.setBounds(287, 56, 369, 34);
		contentPane.add(tfid);
		tfid.setColumns(10);
		
		tfmethod = new JTextField();
		tfmethod.setColumns(10);
		tfmethod.setBounds(287, 149, 369, 34);
		contentPane.add(tfmethod);
		
		tfpaid = new JTextField();
		tfpaid.setColumns(10);
		tfpaid.setBounds(288, 235, 369, 34);
		contentPane.add(tfpaid);
		
		tftime = new JTextField();
		tftime.setColumns(10);
		tftime.setBounds(288, 322, 369, 34);
		contentPane.add(tftime);
		
		tftransaction = new JTextField();
		tftransaction.setColumns(10);
		tftransaction.setBounds(288, 410, 369, 34);
		contentPane.add(tftransaction);
		
		JButton btnclear = new JButton("Clear");
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnclear.setBounds(114, 506, 170, 52);
		contentPane.add(btnclear);
		
	
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSave.setBounds(449, 506, 170, 52);
		contentPane.add(btnSave);
	}

}
