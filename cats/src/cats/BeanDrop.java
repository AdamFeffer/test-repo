package cats;

import pressmash.StdDraw;

public class BeanDrop {
public static void main(String[] args) throws InterruptedException {
	mainGameLoop();
	}
public static void mainGameLoop() throws InterruptedException{
	double x = .5;
	double y = .9;
	for (int i = 0; i < 9; i++){
	int achoice = LR();
	System.out.println(achoice);
	arena();
	ball(x , y);
	if (achoice == 1){
		// right outcome
		x = x + .075;
	}
	else{
		//left outcome
		x = x - .075;
	}
	y = y - .1;
	Thread.sleep(1000);
	if (i > 9){
		StdDraw.clear();
	}
	}
}
public static void arena(){
	StdDraw.picture(.5, .5, "balldrop.jpeg", 1.1, 1);
}
public static int LR(){
	double dchoice = (Math.random() * 2 + 1);
	int ichoice = (int) dchoice;
	return ichoice;
}
public static void ball(double x , double y){
	StdDraw.picture(x, y, "ball.jpeg",.05,.05);
}
}