package pressmash;

import java.awt.Font;

public class Main {

	public static void main(String[] args){
		P1 p1  = new P1(3, 3, .7, .385);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("I died");
			e.printStackTrace();
		}
		P2 p2 = new P2 (3, 3, .3, .385);		
		int C1 = cselect();
		int C2 = cselect();
		while (p1.livesleft > 0 || p2.livesleft > 0){
		arena(C1,C2);
		MGL(C1,C2,p1,p2);
		}
	}
	public static void MGL(int c1, int c2, P1 p1, P2 p2) {		
			StdDraw.picture(p1.x, p1.y, "mainbody.jpeg",.125,.25);
			StdDraw.picture(p2.x,p2.y,"mainbody.jpeg",.125,.25);
			if (StdDraw.isKeyPressed(87)){
				// start jump
			}
			else if (StdDraw.isKeyPressed(65)){
				//moveleft
				p1.x = p1.x - .01;
			}
			else if (StdDraw.isKeyPressed(68)){
				// right
				p1.x = p1.x + 0.01;
				
			}
			else if (StdDraw.isKeyPressed(83)){
				//duck
			}	
		}
	public static int cselect(){
		StdDraw.text(.5, .9 , "Republicans");
		StdDraw.picture(.1, .6, "TrumpSelect.jpeg",.25,.25);
		StdDraw.picture(.4, .6, "CruzSelect.jpeg",.25,.25);
		StdDraw.picture(.7, .6, "RubioSelect.jpeg",.25,.25);
		StdDraw.picture(.9, .6, "CarsonSelect.jpeg",.25,.25);
		StdDraw.picture(.3, .2, "BernSelect.jpeg",.25,.25);
		StdDraw.picture(.6, .2, "ClintonSelect.jpeg",.25,.25);
		int C = 0;
		boolean cc = false;
		while (cc == false){
		if (StdDraw.mousePressed() && StdDraw.mouseX() < .2 && StdDraw.mouseY() > .4){
			C = 1;
			cc = true;
		}
		else if (StdDraw.mousePressed() && StdDraw.mouseX() > .41 && StdDraw.mouseY() > .4 && StdDraw.mouseX() < .6 ){
			C = 2;
			cc = true;
		}
		else if (StdDraw.mousePressed() && StdDraw.mouseX() > .61 && StdDraw.mouseX() < .8 && StdDraw.mouseY() > .4){
			C = 3;
			cc = true;
		}
		else if (StdDraw.mousePressed() && StdDraw.mouseX() > .81 && StdDraw.mouseX() < 1 && StdDraw.mouseY() > .4){
			C = 4;
			cc = true;
		}
		else if (StdDraw.mousePressed() && StdDraw.mouseX() > .2 && StdDraw.mouseX() < .5 && StdDraw.mouseY() < .4){
			C = 5;
			cc = true;
		}
		else if (StdDraw.mousePressed() && StdDraw.mouseX() > .6 && StdDraw.mouseX() < 1 && StdDraw.mouseY() < .4){
			C = 6;
			cc = true;
		}
			if (C > 0){
		System.out.println(C);
		}
		}
		return C;
	}
	public static void arena(int C1, int C2){
		P1 p1  = new P1(C1,3, .7, .4);
		P2 p2 = new P2 (C1, 3, .3, .4);
		StdDraw.setCanvasSize(1280,920);
		double [] cx = {.1, .9, .1, .9};
		double [] cy = {.25, .2, .2, .25};
		StdDraw.picture(.5, .5, "DebateStage.jpg", 1, 1);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledPolygon(cx, cy);
		Font LiveFont = new Font("Arial", Font.BOLD, 30);
		StdDraw.setFont(LiveFont);
		switch(C1){
			case 1:
				StdDraw.picture(.8, .8, "trumplive.jpeg", .075, .075);
				StdDraw.text(.8, .7, p1.livesleft.toString());
				break;
			case 2:
				StdDraw.picture(.8, .8, "CruzLogo.jpeg",.1, .1);
				StdDraw.text(.8, .7, p1.livesleft.toString());
				break;
			case 3:
				StdDraw.picture(.8, .8, "RubioLogo.jpeg",.1, .1);
				StdDraw.text(.8, .7, p1.livesleft.toString());
				break;
			case 4:
				StdDraw.picture(.8, .8, "Carson Logo.jpg",.1, .1);
				StdDraw.text(.8, .7, p1.livesleft.toString());
				break;
			case 5:
				StdDraw.picture(.8, .8, "bernlogo.jpeg",.1, .1);
				StdDraw.text(.8, .7, p1.livesleft.toString());
				break;
			case 6:
				StdDraw.picture(.8, .8, "hilllogo.jpeg",.1, .1);
				StdDraw.text(.8, .7, p1.livesleft.toString());
				break;
		}
		switch(C2){
		case 1:
			StdDraw.picture(.2, .8, "trumplive.jpeg", .075, .075);
			StdDraw.text(.2, .7, p2.livesleft.toString());
			break;
		case 2:
			StdDraw.picture(.2, .8, "CruzLogo.jpeg",.1, .1);
			StdDraw.text(.2, .7, p2.livesleft.toString());
			break;
		case 3:
			StdDraw.picture(.2, .8, "RubioLogo.jpeg",.1, .1);
			StdDraw.text(.2, .7, p2.livesleft.toString());
			break;
		case 4:
			StdDraw.picture(.2, .8, "Carson Logo.jpg",.1, .1);
			StdDraw.text(.2, .7, p2.livesleft.toString());
			break;
		case 5:
			StdDraw.picture(.2, .8, "bernlogo.jpeg",.1, .1);
			StdDraw.text(.2, .7, p2.livesleft.toString());
			break;
		case 6:
			StdDraw.picture(.2, .8, "hilllogo.jpeg",.1, .1);
			StdDraw.text(.2, .7, p2.livesleft.toString());
			break;
	}	
	}
	}
class C{
	String name;
	int id;
	
	C(String n, int c){
		this.name = n;
		this.id = c;

	}
}

class P1{
	int cid;
	Integer livesleft;
	double x;
	double y;
P1(int cid, Integer ll, double x, double y){
		this.cid = cid;
		this.livesleft = ll;
		this.x = x;
		this.y = y;
	}
}
class P2{
	int cid;
	Integer livesleft;
	double x;
	double y;
		P2(int cid, Integer ll, double x, double y){
			this.cid = cid;
			this.livesleft = ll;
			this.x = x;
			this.y = y;
	}
}
