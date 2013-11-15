package domain;

public enum Type {
	NONE("None... WTF?!"),
	ACTION("Action"),
	FPS("First-person shooter (FPS)"),
	RTS("Real time strategy (RTS)"),
	TBS("Turn-based strategy (TBS)"),
	RPG("Role-playing game (RPG)"),
	LOGICAL("Logical");
	
	private String desc;
	
	private Type(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
