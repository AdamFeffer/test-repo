package cats;
import javax.swing.*;

import pressmash.StdDraw;

import java.awt.Font;
public class PunnetSqaure {
	public static void main(String[] args) {		 
		String fg = JOptionPane.showInputDialog(null,"Fathers genotype");
		String mg = JOptionPane.showInputDialog(null, "Mothers genotype");
		String m1 = Character.toString(mg.charAt(0));
		String m2 = Character.toString(mg.charAt(1));
		String one = Character.toString(fg.charAt(0));
		String two = Character.toString(fg.charAt(1));
		String[] ma = {m1 , m2};
		String[] fa = {one, two};
		StdDraw.picture(.5, .5, "blackDisk.jpeg");
		StdDraw.setPenColor(StdDraw.BOOK_RED);
		StdDraw.filledSquare(.7, .7, .2);
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.filledSquare(.3, .3, .2);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledSquare(.7, .3, .2);
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledSquare(.3, .7, .2);
		StdDraw.setPenColor(StdDraw.BLACK);
		Font font = new Font("Arial", Font.BOLD, 22);
		StdDraw.setFont(font);
		StdDraw.text(.3, .95, ma[0]);
		StdDraw.text(.7, .95, ma[1]);
		StdDraw.text(.1, .7, fa[0]);
		StdDraw.text(.1, .3, fa[1]);
		StdDraw.text(.3, .7, ma[0] + fa[0]);
		StdDraw.text(.3, .3, ma[0] + fa[1]);
		StdDraw.text(.7, .7, ma[1] + fa[0]);
		StdDraw.text(.7, .3, ma[1] + fa[1]);
		}
}