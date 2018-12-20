package enums;

public enum TimePeriod {
	DAY("1"),
	WEEK("7"),
	MONTH("30");

	private String value;

	TimePeriod(String period) {
		this.value = period;
	}

	public String getValue() {
		return value;
	}
}
