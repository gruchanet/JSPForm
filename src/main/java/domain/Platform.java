package domain;

public enum Platform {
	PC("PC"),
	PS2("PlayStation 2"),
	PS3("PlayStation 3"),
	PS4("PlayStation 4"),
	XBOX("XBOX"),
	XBOX360("XBOX 360"),
	XBOX1("XBOX ONE");
	
	private String desc;
	
	private Platform(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
