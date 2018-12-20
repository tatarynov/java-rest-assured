package enums;

import com.google.gson.annotations.SerializedName;

public enum Section {
	@SerializedName("Admin")
	ADMIN("Admin"),

	@SerializedName("Arts")
	ARTS("Arts"),

	@SerializedName("Automobiles")
	AUTOMOBILES("Automobiles"),

	@SerializedName("Blogs")
	BLOGS("Blogs"),

	@SerializedName("Books")
	BOOKS("Books"),

	@SerializedName("Business Day")
	BUSINESS_DAY("Business Day"),

	@SerializedName("Briefing")
	BRIEFING("Briefing"),

	@SerializedName("Climate")
	CLIMATE("Climate"),

	@SerializedName("Crosswords & Games")
	CROSSWORDS_AND_GAMES("Crosswords & Games"),

	@SerializedName("Education")
	EDUCATION("Education"),

	@SerializedName("Fashion & Style")
	FASHION_AND_STYLE("Fashion & Style"),

	@SerializedName("Food")
	FOOD("Food"),

	@SerializedName("Health")
	HEALTH("Health"),

	@SerializedName("Job Market")
	JOB_MARKET("Job Market"),

	@SerializedName("Magazine")
	MAGAZINE("Magazine"),

	@SerializedName("Lens")
	LENS("Lens"),

	@SerializedName("membercenter")
	MEMBER_CENTER("membercenter"),

	@SerializedName("Movies")
	MOVIES("Movies"),

	@SerializedName("Multimedia")
	MULTIMEDIA("Multimedia"),

	@SerializedName("N.Y. / Region")
	NY_REGION("nyregion"),

	@SerializedName("NYT Now")
	NYT_NOW("NYT Now"),

	@SerializedName("Obituaries")
	OBITUARIES("Obituaries"),

	@SerializedName("Open")
	OPEN("Open"),

	@SerializedName("Opinion")
	OPINION("Opinion"),

	@SerializedName("Public Editor")
	PUBLIC_EDITOR("Public Editor"),

	@SerializedName("Podcasts")
	PODCASTS("Podcasts"),

	@SerializedName("Real Estate")
	REAL_ESTATE("Real Estate"),

	@SerializedName("Reader Center")
	READER_CENTER("Reader Center"),

	@SerializedName("Science")
	SCIENCE("Science"),

	@SerializedName("Sports")
	SPORTS("Sports"),

	@SerializedName("Style")
	STYLE("Style"),

	@SerializedName("Sunday Review")
	SUNDAY_REVIEW("Sunday Review"),

	@SerializedName("T Magazine")
	T_MAGAZINE("T Magazine"),

	@SerializedName("Technology")
	TECHNOLOGY("Technology"),

	@SerializedName("The Upshot")
	THE_UPSHOT("The Upshot"),

	@SerializedName("The Learning Network")
	THE_LEARNING_NETWORK("The Learning Network"),

	@SerializedName("Theater")
	THEATER("Theater"),

	@SerializedName("Times Insider")
	TIMES_INSIDER("Times Insider"),

	@SerializedName("Today’s Paper")
	TODAYS_PAPER("Today’s Paper"),

	@SerializedName("Travel")
	TRAVEL("Travel"),

	@SerializedName("U.S.")
	US("U.S."),

	@SerializedName("World")
	WORLD("World"),

	@SerializedName("Your Money")
	YOUR_MONEY("Your Money"),

	@SerializedName("all-sections")
	ALL_SECTIONS("all-sections"),

	@SerializedName("Smarter Living")
	SMARTER_LIVING("Smarter Living"),

	@SerializedName("Watching")
	WATCHING("Watching"),

	@SerializedName("Universal")
	UNIVERSAL("Universal"),

	@SerializedName("Well")
	WELL("Well");

	private String value;

	Section(String section) {
		this.value = section;
	}

	public String getValue() {
		return value;
	}
}
