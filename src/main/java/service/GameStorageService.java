package service;

import java.util.ArrayList;
import java.util.List;

import domain.Game;

public class GameStorageService {
	private List<Game> gameDB = new ArrayList<Game>();
	
	public void add(Game game) {
		Game newGame = new Game(game.getName(), game.getSubName(), game.getYear(), 
				game.getType(), game.getPlatform(), game.getScore(), game.getDescription());
		gameDB.add(newGame);
	}
	
	public List<Game> getAllGames() {
		return gameDB;
	}
}
