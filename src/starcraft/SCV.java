package starcraft;

public class SCV extends GroundUnit implements Repairable {

	SCV() {
		super("scv", 90);
	}

	void repair(Repairable unit) {
		if (unit instanceof Unit) {
			Unit target = (Unit) unit;

			while (target.hp < target.MAX_HP) {
				target.hp++;
				String msg = String.format("%s 수리중 [%d/%d]", target.name, target.hp, target.MAX_HP);
				System.out.println(msg);

				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
			}
			System.out.println("수리완료 >>>");
		}
	}
	
	void attack(Unit unit) {
		if(unit instanceof GroundUnit) {
			Unit target = (Unit) unit;
			
			while(target.hp > 0) {
				target.hp --;
				String msg = String.format("%s가 %s를 공격 [%d/%d]",name, target.name, target.hp, target.MAX_HP);
				System.out.println(msg);

				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
			}
			System.out.println(String.format("%s X_X", target.name));
		}
 	}
}
