package starcraft;

public class Unit {

	protected final int MAX_HP;
	protected int hp;
	protected String name;

	protected Unit(String name, int hp) {
		MAX_HP = hp;
		this.hp = hp;
		this.name = name;

		System.out.println(name + "의 탄생..");
	}

}
