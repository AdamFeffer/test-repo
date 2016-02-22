package smash2;
public class Main {
	C Bernie = new C("Bernie", 1);
	C Rubio = new C("Rubio",2);
	C Cruz = new C("Cruz",3);
	C Trump = new C("Trump", 4);
	C Clinton = new C("Clinton", 5);
	C Carson = new C("Carson", 6);
	public static void main(String[] args) throws InterruptedException{
		int C1 = cselect();
		Thread.sleep(1000);
		int C2 = cselect();
		 arena(C1,C2);
	}
	public static int cselect(){
		StdDraw.text(.5, .9 , "Republicans");
		StdDraw.picture(.2, .6, "TrumpSelect.jpeg",.25,.25);
		StdDraw.picture(.4, .6, "CruzSelect.jpeg",.25,.25);
		StdDraw.picture(.6, .6, "RubioSelect.jpeg",.25,.25);
		StdDraw.picture(.8, .6, "CarsonSelect.jpeg",.25,.25);
		StdDraw.picture(.3, .2, "BernSelect.jpeg",.25,.25);
		StdDraw.picture(.6, .2, "ClintonSelect.jpeg",.25,.25);
		int C = 0;
		boolean cc = false;
		while (cc == false){
		if (StdDraw.mousePressed() && StdDraw.mouseX() < .2 && StdDraw.mouseY() > .4){
			C = 1;
			cc = true;
		}
		if (StdDraw.mousePressed() && StdDraw.mouseX() < .41 && StdDraw.mouseX() > .6 && StdDraw.mouseY() > .4){
			C = 2;
			cc = true;
		}
		if (StdDraw.mousePressed() && StdDraw.mouseX() < .61 && StdDraw.mouseX() > .8 && StdDraw.mouseY() > .4){
			C = 3;
			cc = true;
		}
		if (StdDraw.mousePressed() && StdDraw.mouseX() < .81 && StdDraw.mouseX() > 1 && StdDraw.mouseY() > .4){
			C = 4;
			cc = true;
		}
		System.out.println(C);}
		return C;
	}
	public static void arena(int C1, int C2){
		StdDraw.picture(.5, .5, "paperarena.jpeg", 1, 1);
	}
}
class C{
	String name;
	int cid;
	C(String n, int c){
		name = n;
		cid = c;
	}
}
