package starcraft;

public class DropShip extends AirUnit implements Repairable {
	protected DropShip(String name, int hp) {
		super("DropShip", 120);
	}

	@Override
	void flying() {
		System.out.println("난 날수있어요");
	}

}
