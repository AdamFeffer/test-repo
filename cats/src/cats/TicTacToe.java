package cats;

import java.awt.Font;

import pressmash.StdDraw;

public class TicTacToe {

	public static void main(String[] args) {
		MGL();
	}
	public static void MGL(){
		Boolean gameover = false;
		while (gameover == false){
			arena();
			gameover = false;
		}
		
	}
	public static void arena(){
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.line(.3, 0, .3, 1);
		StdDraw.line(.7, 0, .7, 1);
		StdDraw.line(0, .3, 1, .3);
		StdDraw.line(0, .7, 1, .7);
	}
	public static void xInit(double x, double y){
	StdDraw.text(x, y, "X");	
	}
	public static void oInit(double x, double y){
	StdDraw.text(x, y, "O");	
	}
}
