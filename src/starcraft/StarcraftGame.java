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
		SCV scv = new SCV();
		DropShip drop = new DropShip();
		tank.hp = 70;
		drop.flying();
		
		
//		scv.repair(tank);
		scv.attack(tank);
	}
}
