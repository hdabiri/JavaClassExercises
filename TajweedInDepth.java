import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TajweedInDepth {

	public static void main(String[] args) {

		new InDepth();
	//	new InDepth1("second try");

	}
}
	@SuppressWarnings("serial")
	class InDepth extends JFrame {
		
		InDepth() {
			
		ImageIcon logo = new ImageIcon("hifzTips.png");
		JLabel label = new JLabel(logo);
		add(label);
		setTitle("Tajweed In Depth");
		setIconImage();
	//	setPreferredSize(new Dimension(400, 300));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		
		
       }

		private void setIconImage() {
			Image icon = Toolkit.getDefaultToolkit().getImage("tidL.png");    
			setIconImage(icon);    
			//setLayout(null);     
			setSize(1000,1000);
			pack();
		}
		
	
	}

