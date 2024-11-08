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
		tank.hp = 30;
		
		scv.repair(tank);
	}
}
