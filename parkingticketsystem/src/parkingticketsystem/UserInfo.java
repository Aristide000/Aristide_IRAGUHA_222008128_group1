package parkingticketsystem;

import java.awt.EventQueue;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class UserInfo extends JFrame implements ActionListener {
	String url = "jdbc:mysql://localhost/userinfo";
    String UserN = "root";
    String passD = "";

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tffirstname;
	private JTextField tfsecondname;
	private JTextField tftelephone;
	private JTextField tfaddress;
	private JTextField tfid;
	private JTextField tflicense;
	private JTextField tfmodel;
	private JTextField tfusername;
	private JTextField tfpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInfo frame = new UserInfo();
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
	public UserInfo() {
		
		setTitle("User Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 525);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIRSTNAME:");
		lblNewLabel.setBounds(10, 11, 95, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LASTNAME:");
		lblNewLabel_1.setBounds(10, 47, 95, 23);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1);
		
		tffirstname = new JTextField();
		tffirstname.setBounds(153, 16, 205, 20);
		contentPane.add(tffirstname);
		tffirstname.setColumns(10);
		
		tfsecondname = new JTextField();
		tfsecondname.setBounds(153, 48, 205, 20);
		contentPane.add(tfsecondname);
		tfsecondname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tel+:");
		lblNewLabel_2.setBounds(10, 81, 50, 40);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_2);
		
		tftelephone = new JTextField();
		tftelephone.setBounds(153, 91, 205, 20);
		contentPane.add(tftelephone);
		tftelephone.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setBounds(10, 137, 95, 30);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3);
		
		tfaddress = new JTextField();
		tfaddress.setBounds(151, 142, 207, 20);
		contentPane.add(tfaddress);
		tfaddress.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Vehicle Information:");
		lblNewLabel_4.setBounds(11, 178, 117, 40);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Vehicle ID:");
		lblNewLabel_5.setBounds(21, 224, 89, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("License Plate:");
		lblNewLabel_6.setBounds(21, 264, 89, 14);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Model:");
		lblNewLabel_7.setBounds(21, 308, 49, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_7);
		
		tfid = new JTextField();
		tfid.setBounds(153, 221, 205, 20);
		contentPane.add(tfid);
		tfid.setColumns(10);
		
		tflicense = new JTextField();
		tflicense.setBounds(153, 261, 205, 20);
		contentPane.add(tflicense);
		tflicense.setColumns(10);
		
		tfmodel = new JTextField();
		tfmodel.setBounds(154, 305, 205, 20);
		contentPane.add(tfmodel);
		tfmodel.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Login Credentials:");
		lblNewLabel_8.setBounds(10, 357, 89, 14);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Username:");
		lblNewLabel_9.setBounds(106, 357, 104, 14);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Password:");
		lblNewLabel_10.setBounds(106, 404, 125, 14);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_10);
		
		tfusername = new JTextField();
		tfusername.setBounds(195, 354, 163, 20);
		contentPane.add(tfusername);
		tfusername.setColumns(10);
		
		tfpassword = new JTextField();
		tfpassword.setBounds(195, 401, 163, 20);
		contentPane.add(tfpassword);
		tfpassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBounds(134, 429, 95, 43);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
	
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(10, 429, 95, 43);
		contentPane.add(btnSave);
		btnSave.addActionListener(this);
		
		JButton btnreset = new JButton("Reset");
		btnreset.setBounds(263, 429, 95, 43);
		contentPane.add(btnreset);
		btnreset.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
        if (e.getActionCommand().equals("Save")){
            String firstName = tffirstname.getText();
            String lastName = tfsecondname.getText();
            String phoneNumber = tftelephone.getText();
            String address = tfaddress.getText();
          //  String password = tfpassword.getText();
            String identity = tfid.getText();
            String license = tflicense.getText();
            String model = tfmodel.getText();
          //  String username = tfusername.getText();
            
            
            String inSql = "INSERT INTO userinfo (Firstname, Lastname, Telephone, Address, VehicleID, LicensePlate, Model) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (
            		Connection conn = DriverManager.getConnection(url, UserN, passD);
            		PreparedStatement Stmt = conn.prepareStatement(inSql, Statement.RETURN_GENERATED_KEYS)
            						
            		) {
            				Stmt.setString(1, firstName);
                            Stmt.setString(2, lastName);
                            Stmt.setString(3, phoneNumber);
                            Stmt.setString(4, address);
                          //  Stmt.setString(5, password);
                            Stmt.setString(5, identity);
                            Stmt.setString(6, license);
                            Stmt.setString(7, model);
                         //   Stmt.setString(9, username);
                         
                                 int affectedRows = Stmt.executeUpdate();

                                    if (affectedRows > 0) {
                                    	JOptionPane.showMessageDialog(null, "Signup Successful!");
                                        // Optionally, you can close the signup frame or perform other actions
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Failed to insert login credentials!");
                                    }
                                                
                                        }
            catch (SQLException ex) {
            	//JOptionPane.showMessageDialog(null, "Enter all fields");
                ex.printStackTrace();
            }
            
        }else if (e.getActionCommand().equals("Update")) {
        	String sql = "SELECT * FROM userinfo ORDER BY id DESC LIMIT 1";
        	try (Connection conn = DriverManager.getConnection(url, UserN, passD);
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {

                   if (rs.next()) {
                       int id = rs.getInt("id");
                       String fname = rs.getString("Firstname");
                       String lname = rs.getString("Lastname");
                       String phoneNumber = rs.getString("Telephone");
                       String address = rs.getString("Address");
                       String identity = rs.getString("VehicleID");
                       String license = rs.getString("LicensePlate");
                       String model = rs.getString("Model");
                      

                       JFrame viewFrame = new JFrame("Update");
                       viewFrame.getContentPane().setLayout(new GridLayout(0,2));
                     //  viewFrame.setLocationRelativeTo(null);
                      viewFrame.setBounds(150, 50, 400, 300);
                       
                       addLabelAndData(viewFrame, "ID:", String.valueOf(id));
                       addLabelAndData(viewFrame, "First Name:", fname);
                       addLabelAndData(viewFrame, "Last Name:", lname);
                       addLabelAndData(viewFrame, "Telephone:", phoneNumber);
                       addLabelAndData(viewFrame, "Model:", model);
                       addLabelAndData(viewFrame, "Address:", address);
                       addLabelAndData(viewFrame, "identity:", identity);
                       addLabelAndData(viewFrame, "license:", license);
                       
                       viewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                      // viewFrame.pack();
                       viewFrame.setVisible(true);
                   } else {
                       JOptionPane.showMessageDialog(null, "No data found!", "Error", JOptionPane.ERROR_MESSAGE);
                   }
               } catch (SQLException ex) {
                   ex.printStackTrace();
                   JOptionPane.showMessageDialog(null, "Failed to view data!", "Error", JOptionPane.ERROR_MESSAGE);
               }
           }

			
		}
    
	private void addLabelAndData(Container container, String labelText, String data) {
		container.add(new JLabel(labelText));
        container.add(new JLabel(data));
		
	}
}
		
	
