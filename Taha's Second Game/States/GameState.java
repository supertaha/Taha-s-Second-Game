package States;

import java.awt.Graphics;

import Entities.Creatures.Player;
import Main.Game;

public class GameState extends State{

	private Player player;
	
	public GameState(Game game){
		super(game);
		player = new Player(100,100);
	}
	
	public void tick() {
		player.tick();
	}

	public void render(Graphics g) {
		player.render(g);
	}
	
}
