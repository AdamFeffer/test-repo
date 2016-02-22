package cats;
import javax.swing.*;
import java.util.*;
public class coinflip {

	public static void main(String[] args) {
		String nof = JOptionPane.showInputDialog(null, "How many flips do you want");
		double dnof = Double.parseDouble(nof);
		float H = 0f;
		float T = 0f;
		Random rand = new Random();
		while (dnof > 0){
			int flip = rand.nextInt(2);
			if (flip == 1){
				H++;
			}
			else{
				T++;
			}
			dnof--;
		}
		JOptionPane.showConfirmDialog(null, "The flips recived " + T + " tails and " + H + " heads");

	}

}
