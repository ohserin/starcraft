package starcraft;

public class StarcraftGame {

	private StarcraftGame() {
	}

	private static StarcraftGame instance = new StarcraftGame();

	public static StarcraftGame getInstance() {
		return instance;
	}

	public void run() {

		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip drop = new DropShip();
		tank.hp = 20;
		drop.flying();
		
		
//		scv.repair(tank);
//		scv.attack(tank);
//		tank.attack(scv);
//		marine.attack(tank);
		drop.attack(scv);
		
	}
}
