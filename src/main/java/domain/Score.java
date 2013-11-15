package domain;

public enum Score {
	ZERO(0, "N/C (0/10)"),
	ONE(1, "WORST!!! (1/10)"),
	TWO(2, "Piece of s***!! (2/10)"),
	THREE(3, "Very Bad! (3/10)"),
	FOUR(4, "Bad (4/10)"),
	FIVE(5, "Not so bad (5/10)"),
	SIX(6, "So so (6/10)"),
	SEVEN(7, "Good (7/10)"),
	EIGHT(8, "Very Good! (8/10)"),
	NINE(9, "Excellent!! (9/10)"),
	TEN(10, "MASTERPIECE!!! (10/10)");
	
	private int score;
	private String desc;
	
	private Score(int score, String desc) {
		this.score = score;
		this.desc = desc;
	}

	public int getNumber() {
		return score;
	}

	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
