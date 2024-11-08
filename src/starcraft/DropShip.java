package starcraft;

public class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super("DropShip", 120);
	}

	@Override
	void flying() {
		System.out.println("난 날수있어요");
	}

}
