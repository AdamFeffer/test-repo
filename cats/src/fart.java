import javax.swing.JOptionPane;

public class fart {
	public static void main(String[] args){
		double winnings = 0;
		double dfirstSet = Math.random() * 100 + 1; 
		double dsecondSet = Math.random() * 100 + 1;
		double dthirdSet = Math.random() * 100 + 1;
		double dfourthSet = Math.random() * 100 + 1;
		double dfifthSet = Math.random() * 100 + 1;
		double dpowerball = Math.random() * 100 + 1;
		int firstSet = (int)dfirstSet;
		int secondSet = (int)dsecondSet;
		int thirdSet = (int)dthirdSet;
		int fourthSet = (int)dfourthSet;
		int fifthSet = (int)dfifthSet;
		int powerball =  (int) dpowerball; 
		System.out.println(firstSet);
		System.out.println(secondSet);
		System.out.println(thirdSet);
		System.out.println(fourthSet);
		System.out.println(fifthSet);
		System.out.println(powerball);
		String su1 = JOptionPane.showInputDialog("First Set ");
		String su2 = JOptionPane.showInputDialog("Second Set ");
		String su3 = JOptionPane.showInputDialog("Third Set ");
		String su4 = JOptionPane.showInputDialog("Fourth Set ");
		String su5 = JOptionPane.showInputDialog("Fifth Set ");
		String sup = JOptionPane.showInputDialog("Powerball: ");
		int u1 = Integer.parseInt(su1);
		int u2 = Integer.parseInt(su2);
		int u3 = Integer.parseInt(su3);
		int u4 = Integer.parseInt(su4);
		int u5 = Integer.parseInt(su5);
		int up = Integer.parseInt(sup);
		byte t1 = 0;
		byte t2 = 0;
		byte t3 = 0;
		byte t4 = 0;
		byte t5 = 0;
		byte tp = 0;
		if (firstSet == u1) {
			t1++;
		}
		else if(secondSet == u2){
			t2++;
		}
		else if(thirdSet == u3){
			t3++;
		}
		else if (fourthSet == u4){
			t4++;
		}
		else if (fifthSet == u5){
			t5++;
		}
		else if (powerball == up){
			tp++;
		}
		int tc = t1 + t2 + t3 + t4 + t5 + tp;
		switch(tc){
			case 0:
				winnings = winnings + 0;
				break;
			case 1:
				winnings = winnings + 10;
				break;
			case 2:
				winnings = winnings + 1000;
				break;
			case 3:
				winnings = winnings + 10000;
				break;
			case 4:
				winnings = winnings + 100000;
				break;
			case 5:
				winnings = winnings + 1000000;
				break;
			case 6:
				winnings = winnings + 1500000000;
				break;
		}
		JOptionPane.showConfirmDialog(null, winnings);
}
}