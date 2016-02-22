package cats;
import javax.swing.*;

import pressmash.StdDraw;
public class circles {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog(null, "C1 X: ");
		String y = JOptionPane.showInputDialog(null, "C1 Y: ");
		String rad = JOptionPane.showInputDialog(null, "C1 radius: ");
		double dx = Double.parseDouble(x);
		double dy = Double.parseDouble(y);
		double drad = Double.parseDouble(rad);
		String x2 = JOptionPane.showInputDialog(null, "C2 X: ");
		String y2 = JOptionPane.showInputDialog(null, "C2 Y: ");
		String rad2 = JOptionPane.showInputDialog(null, "C2 radius: ");
		double dx2 = Double.parseDouble(x2);
		double dy2 = Double.parseDouble(y2);
		double drad2 = Double.parseDouble(rad2);
		drad = drad / 1000;
		drad2 = drad2 / 1000;
        StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.circle(dx, dy, drad);
        StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(dx2, dy2, drad2);
	}	   
}
