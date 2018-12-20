package enums;

public enum MostPopularOption {
	MOST_MAILED("mostemailed"),
	MOST_SHARED("mostshared"),
	MOST_VIEWED("mostviewed");

	private String value;

	MostPopularOption(String stringValue) {
		this.value = stringValue;
	}

	public String getValue() {
		return value;
	}
}
