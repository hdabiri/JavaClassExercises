import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chapter20Exercises {

	public static void main(String[] args) {
		JFrame tajInDepth = new JFrame();
		ImageIcon logo = new ImageIcon("tidL.png");
		JLabel label = new JLabel(logo);
		
		
		tajInDepth.add(label);
		tajInDepth.setVisible(true);
		tajInDepth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tajInDepth.pack();

	}

}
