package starcraft;

public class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super("DropShip", 120);
	}

	void attack(Unit unit) {
		if (unit instanceof Unit) {
			Unit target = (Unit) unit;

			while (target.hp > 0) {
				target.hp--;
				String msg = String.format("%s가 %s를 공격 [%d/%d]", name, target.name, target.hp, target.MAX_HP);
				System.out.println(msg);

				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
			}
			System.out.println(String.format("%s X_X", target.name));
		}
	}

	@Override
	void flying() {
		System.out.println("난 날수있어요");
	}

}
