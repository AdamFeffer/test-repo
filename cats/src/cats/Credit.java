package cats;
import javax.swing.*;
public class Credit {
public static void main(String[] args){
	String swC = JOptionPane.showInputDialog(null, "(1)Visa, (2)Amex, (3)Master, or (4)Discover");
	String sCardNumber = JOptionPane.showInputDialog(null,"Card Number");
	int cardNumber = Integer.parseInt(sCardNumber);
	int wC = Integer.parseInt(swC);
	String fN = sCardNumber.substring(0,1);
	switch (wC){
	case 1:
		visaCheck(cardNumber);
	
	case 2:
		amexCheck(cardNumber);
	}
}
private static boolean visaCheck(int x){
	boolean good = false;
	 
	return good;
}
private static boolean amexCheck(int x){
	boolean good = false;
	return good;
}

}

