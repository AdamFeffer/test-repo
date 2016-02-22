package cats;

public class ObjectTest {

	public static void main(String[] args) {
		Soldier Adam = new Soldier(15);
		System.out.println(Adam.attack);

	}

}
class Soldier{
	int attack;
	Soldier(int attack){
		this.attack = attack;
	}
}
