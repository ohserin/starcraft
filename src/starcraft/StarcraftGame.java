package starcraft;

public class StarcraftGame {

	private StarcraftGame() {
	}

	private static StarcraftGame instance = new StarcraftGame();

	public static StarcraftGame getInstance() {
		return instance;
	}

	public void run() {

		interface Repairable {

		}
		
		abstract class Unit {
			final int MAX_HP;
			int hp;
			String name;
			
			Unit(String name, int hp) {
				MAX_HP = hp;
				this.hp = hp;
				this.name = name;
				
				System.out.println(name + "의 탄생");
			}
		}
	}
}
