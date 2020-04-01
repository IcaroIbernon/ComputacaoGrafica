import java.awt.*;
import java.awt.event.*;

public class RedRect extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new RedRect();
	}
	
	@SuppressWarnings("deprecation")
	RedRect() {
		super("RedRect");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(816, 639);
		add("Center", new CvRedRect());
		show();
	}
	
}

class CvRedRect extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		Dimension d = getSize();
		 int maxX = d.width - 1, maxY = d.height - 1;
		 g.drawString("d.largura = " + d.width, 10, 30);
		 g.drawString("d.altura = " + d.height, 10, 60);
		 g.setColor(Color.red);
		 g.drawRect(0, 0, maxX, maxY);
	}
}
