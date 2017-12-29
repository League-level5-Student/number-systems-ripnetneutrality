import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu implements ActionListener{
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	
	JButton BtD = new JButton();
	JButton BtH = new JButton();
	JButton DtB = new JButton();
	JButton DtH = new JButton();
	JButton HtB = new JButton();
	JButton HtD = new JButton();
	
	Decimal dec;
	Binary bin;
	Hexadecimal hex;
	
	String frame_Title = "Number Converter"; 
	String BtD_Title = "Bin to Dec";
	String BtH_Title = "Bin to Hex"; 
	String DtB_Title = "Dec to Bin"; 
	String DtH_Title = "Dec to Hex"; 
	String HtB_Title = "Hex to Bin"; 
	String HtD_Title = "Hex to Dec"; 
	
	public Menu(Binary Bin, Hexadecimal Hex, Decimal Dec) {
		dec = Dec;
		bin = Bin;
		hex = Hex;
	}
	public void display() {
		mainFrame.add(mainPanel);
		
		mainPanel.add(BtD);
		mainPanel.add(BtH);
		mainPanel.add(DtB);
		mainPanel.add(DtH);
		mainPanel.add(HtB);
		mainPanel.add(HtD);
		
		BtD.setText(BtD_Title);
		BtH.setText(BtH_Title);
		DtB.setText(DtB_Title);
		DtH.setText(DtH_Title);
		HtB.setText(HtB_Title);
		HtD.setText(HtD_Title);
		
		BtD.addActionListener(this);
		BtH.addActionListener(this);
		DtB.addActionListener(this);
		DtH.addActionListener(this);
		HtB.addActionListener(this);
		HtD.addActionListener(this);
		
		mainFrame.pack();
		mainFrame.setTitle(frame_Title);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void performAction(String from, String to) {
		JOptionPane.showInputDialog("What " + from + " value do you want to be converted to " + to + "?");
	}
	
	public void actionPerformed(ActionEvent e) {
		String output;
		if(e.getSource() == BtD) {
			output = JOptionPane.showInputDialog("What binary value do you want to be converted to decimal?");
			JOptionPane.showMessageDialog(null, "The converted binary value is " + bin.convertDec(output) + " in decimal form.");
		}
		if(e.getSource() == BtH) {
			output = JOptionPane.showInputDialog("What binary value do you want to be converted to hexadecimal?");
			JOptionPane.showMessageDialog(null, "The converted binary value is " + bin.convertHex(output) + " in hexadecimal form.");
		}
		if(e.getSource() == DtB) {
			output = JOptionPane.showInputDialog("What decimal value do you want to be converted to binary?");
			JOptionPane.showMessageDialog(null, "The converted decimal value is " + dec.decToBin(Integer.parseInt(output)) + " in binary form.");
		}
		if(e.getSource() == DtH) {
			output = JOptionPane.showInputDialog("What decimal value do you want to be converted to hexadecimal?");
			JOptionPane.showMessageDialog(null, "The converted decimal value is " + dec.decToHex(Integer.parseInt(output)) + " in hexadecimal form.");
		}
//		if(e.getSource() == HtB) {
//			output = JOptionPane.showInputDialog("What hexadecimal value do you want to be converted to binary?");
//			JOptionPane.showMessageDialog(null, "The converted hexadecimal value is " + hex.(output) + " in binary form.");
//		}
//		if(e.getSource() == HtD) {
//			output = JOptionPane.showInputDialog("What hexadecimal value do you want to be converted to decimal?");
//			JOptionPane.showMessageDialog(null, "The converted hexadecimal value is " + hex.(output) + " in decimal form.");
//		}
	}
}
