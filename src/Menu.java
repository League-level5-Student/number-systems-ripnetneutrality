import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu implements ActionListener{
	JFrame MainF = new JFrame();
	JPanel MainP = new JPanel();
	JButton BtD = new JButton("Bin to Dec");
	JButton BtH = new JButton("Bin to Hex");
	JButton DtB = new JButton("Dec to Bin");
	JButton DtH = new JButton("Dec to Hex");
	JButton HtB = new JButton("Hex to Bin");
	JButton HtD = new JButton("Hex to Dec");
	
	Decimal dec;
	Binary bin;
	Hexadecimal hex;
	public Menu(Binary Bin, Hexadecimal Hex, Decimal Dec) {
		dec = Dec;
		bin = Bin;
		hex = Hex;
	}
	public void display() {
		MainF.add(MainP);
		
		MainP.add(BtD);
		MainP.add(BtH);
		MainP.add(DtB);
		MainP.add(DtH);
		MainP.add(HtB);
		MainP.add(HtD);
		
		BtD.addActionListener(this);
		BtH.addActionListener(this);
		DtB.addActionListener(this);
		DtH.addActionListener(this);
		HtB.addActionListener(this);
		HtD.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
