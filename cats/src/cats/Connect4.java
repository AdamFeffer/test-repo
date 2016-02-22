package cats;

import pressmash.StdDraw;

public class Connect4 {

public static void main(String[] args) throws InterruptedException{
	arena();
	mGL();
}
public static void mGL() throws InterruptedException{
	int[] board = {0, 0, 0, 0, 0, 0, 0};
	Boolean gameOver = false;
	byte turn = 1;
	arena();
	while (gameOver == false){
		// first number small next number big
		if (StdDraw.mousePressed()){
			if (StdDraw.mouseX() >= 0.14){
				//1
				if (turn == 1){
					switch(board[6]){
					case 0:
					rDiskInit(.9, .1);
					board[6]++;
					System.out.println(board[6]);
					Thread.sleep(100);
					
					case 1:
						rDiskInit(.9, .2);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					
					case 2:
						rDiskInit(.9, .3);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					
					case 3:
						rDiskInit(.9, .4);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					
					case 4:
						rDiskInit(.9, .5);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					case 5:
						rDiskInit(.9, .6);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					}
				}
				else if(turn == 2) {
					switch (board [6]){
					case 0:
					bDiskInit(.9, .1);
					board[6]++;
					System.out.println(board[6]);
					Thread.sleep(100);
					
					case 1:
						bDiskInit(.9, .2);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					
					case 2:
						bDiskInit(.9, .3);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					
					case 3:
						rDiskInit(.9, .4);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					
					case 4:
						bDiskInit(.9, .5);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					
					case 5:
						bDiskInit(.9, .6);
						board[6]++;
						System.out.println(board[6]);
						Thread.sleep(100);
					}
					}
				}
				else{
					bDiskInit(.07, .9);
				}
			}
			if (StdDraw.mouseX() >= 0.14 && StdDraw.mouseX() >= 0.28){
				// 2
			}
			else if (StdDraw.mouseX() >= 0.29 && StdDraw.mouseX() >= 0.42){
				//3
			}
			else if (StdDraw.mouseX() >= 0.43 && StdDraw.mouseX() >= 0.56){
				//4
			}
			else if (StdDraw.mouseX() >= 0.57 && StdDraw.mouseX() >= 0.7){
				//5
			}
			else if (StdDraw.mouseX() >= 0.71 && StdDraw.mouseX() >= 0.84){
				//6
			}
			else if (StdDraw.mouseX() >= 0.85 && StdDraw.mouseX() >= 0.98){
				//7
			}
		if (turn == 1){
			turn++;
		}
		else{
			turn--;
		}
		
	Thread.sleep(1000);
	}
}

public static void arena(){
	StdDraw.picture(0.5, 0.5, "connectboard.jpeg",1 ,1);
}
public static void rDiskInit(double x, double y){
	StdDraw.picture(x, y, "diskRed.jpg", .1, .1);
}
public static void bDiskInit(double x, double y){
	StdDraw.picture(x, y, "blackDisk.jpeg", .1 , .1);
}
}