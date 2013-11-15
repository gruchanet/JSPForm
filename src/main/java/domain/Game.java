package domain;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private String name;
	private String subName;
	private int year = 1990;
	private Type type = Type.NONE;
	private List<Platform> platform = new ArrayList<Platform>();
	private Score score = Score.ZERO;
	private String description;
	
	public Game() {}
	
	public Game(String name, String subName, int year, Type type,
			List<Platform> platform, Score score, String description) {
		super();
		this.name = name;
		this.subName = subName;
		this.year = year;
		this.type = type;
		this.platform = platform;
		this.score = score;
		this.description = description;
	}
	
	public void clear() {		
		this.name = "";
		this.subName = "";
		this.year = 1990;
		this.type = Type.NONE;
		this.platform = new ArrayList<Platform>();
		this.score = Score.ZERO;
		this.description = "";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubName() {
		return subName;
	}
	
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public List<Platform> getPlatform() {
		return platform;
	}
	
	public void setPlatform(List<Platform> platform) {
		this.platform = platform;
	}
	
	public boolean isPlatform(Platform platform) {
		for (int i = 0; i < this.platform.size(); i++)
			if (platform.name().equals(this.platform.get(i).name()))
				return true;
		return false;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}