package cats;

import javax.swing.JOptionPane;

public class Queens {
	
	public static void main(String[] args) {

		
		//First Queen

		int squareOne = vert() + horiz();
		
		//Second Queen

		int squareTwo = vert() + horiz();
		//Third Queen

		int squareThree = vert() + horiz();
		
		//Fourth Queen

		int squareFour = vert() + horiz();
		//Fifth Queen

		int squareFive = vert() + horiz();
		
		//Sixth Queen

		int squareSix = vert() + horiz();
		
		//Seventh Queen

		int squareSeven = vert() + horiz();
		
		//Eighth Queen

		int squareEight = vert() + horiz();
		
		int[] queenOne = {squareTwo, squareThree, squareFour, squareFive, squareSix, squareSeven, squareEight};
		
		if (squareOne > -5){
			for (int i = 0; i < queenOne.length; i++);
				int i = 0;
				int compare = queenOne[i];
				if (squareOne == compare || squareOne % 8 == compare % 8 || Math.abs(squareOne - compare) < 7 || Math.abs(squareOne - compare) % 7 == 0 || Math.abs(squareOne - compare) % 9 == 0){
					System.out.println("Sorry, this is not a solution");
				}
					
		}
		
		int[] queenTwo = {squareOne, squareThree, squareFour, squareFive, squareSix, squareSeven, squareEight};
		
		if (squareOne > -5){
			for (int i = 0; i < queenOne.length; i++);
				int i = 0;
				int compare = queenTwo[i];
				if (squareTwo == compare || squareTwo % 8 == compare % 8 || Math.abs(squareTwo - compare) < 7 || Math.abs(squareTwo - compare) % 7 == 0 || Math.abs(squareTwo - compare) % 9 == 0){
					System.out.println("Second Queen wrong. Sorry, this is not a solution");
				}
		}
		
		int[] queenThree = {squareTwo, squareOne, squareFour, squareFive, squareSix, squareSeven, squareEight};
		
		if (squareOne > -5){
			for (int i = 0; i < queenOne.length; i++);
				int i = 0;
				int compare = queenThree[i];
				if (squareThree == compare || squareThree % 8 == compare % 8 || Math.abs(squareThree - compare) < 7 || Math.abs(squareThree - compare) % 7 == 0 || Math.abs(squareThree - compare) % 9 == 0){
					System.out.println("Third Queen Wrong. Sorry, this is not a solution");
				}
		}
		
		int[] queenFour = {squareTwo, squareThree, squareOne, squareFive, squareSix, squareSeven, squareEight};
		
		if (squareOne > -5){
			for (int i = 0; i < queenOne.length; i++);
				int i = 0;
				int compare = queenFour[i];
				if (squareFour == compare || squareFour % 8 == compare % 8 || Math.abs(squareFour - compare) < 7 || Math.abs(squareFour - compare) % 7 == 0 || Math.abs(squareFour - compare) % 9 == 0){
					System.out.println("Fourth Queen Wrong. Sorry, this is not a solution");
				}
		}
		
		int[] queenFive = {squareTwo, squareThree, squareFour, squareOne, squareSix, squareSeven, squareEight};
		
		if (squareOne > -5){
			for (int i = 0; i < queenOne.length; i++);
				int i = 0;
				int compare = queenFive[i];
				if (squareFive == compare || squareFive % 8 == compare % 8 || Math.abs(squareFive - compare) < 7 || Math.abs(squareFive - compare) % 7 == 0 || Math.abs(squareFive - compare) % 9 == 0){
					System.out.println("Fifth Queen Wrong. Sorry, this is not a solution");
				}
		}
		
		int[] queenSix = {squareTwo, squareThree, squareFour, squareFive, squareOne, squareSeven, squareEight};
		
		if (squareOne > -5){
			for (int i = 0; i < queenOne.length; i++);
				int i = 0;
				int compare = queenSix[i];
				if (squareFive == compare || squareSix % 8 == compare % 8 || Math.abs(squareSix - compare) < 7 || Math.abs(squareSix - compare) % 7 == 0 || Math.abs(squareSix - compare) % 9 == 0){
					System.out.println("Sixth Queen Wrong. Sorry, this is not a solution");
				}
		}
		
		int[] queenSeven = {squareTwo, squareThree, squareFour, squareFive, squareSix, squareOne, squareEight};
		
		if (squareOne > -5){
			for (int i = 0; i < queenOne.length; i++);
				int i = 0;
				int compare = queenSeven[i];
				if (squareSeven == compare || squareSeven % 8 == compare % 8 || Math.abs(squareSeven - compare) < 7 || Math.abs(squareSeven - compare) % 7 == 0 || Math.abs(squareSeven - compare) % 9 == 0){
					System.out.println("Seventh Queen Wrong. Sorry, this is not a solution");
				}
				else
					System.out.println("YOU WIN!");
		}

	}
	public static int horiz() {
		int queenH = 0;
		String horiz = JOptionPane.showInputDialog("Input the rank of the queen: ");
		 int rank = Integer.parseInt(horiz);
		if (rank == 1) {
			queenH = 0;
			return queenH;
		}
		if (rank == 2) {
			queenH = 8;
			return queenH;
		}
		if (rank == 3) {
			queenH = 16;
			return queenH;
		}
		if (rank == 4) {
			queenH = 24;
			return queenH;
		}
		if (rank == 5) {
			queenH = 32;
			return queenH;
		}
		if (rank == 6) {
			queenH = 40;
			return queenH;
		}
		if (rank == 7) {
			queenH = 48;
			return queenH;
		}
		if (rank == 8) {
			queenH = 56;
			return queenH;
		}
		return queenH;
		
	}
	
	public static int vert() {
		
		int queenV = 0;
		String vert = JOptionPane.showInputDialog("Input the file of the queen: ");
		
		if (vert.equals("a")) {
			queenV = 1;
		}
			
		if (vert.equals("b")) {
			queenV = 2;
		}
		if (vert.equals("c")) {
			queenV = 3;
		}
		if (vert.equals("d")) {
			queenV = 4;
		}
		if (vert.equals("e")) {
			queenV = 5;
			
		}
		if (vert.equals("f")) {
			queenV = 6;

		}
		if (vert.equals("g")) {
			queenV = 7;

		}
		if (vert.equals("h")) {
			queenV = 8;

		}
		return queenV;
	}

			
}
