public class Card {
	private String suit;
	private String value;
	
	public Card(String v, String s) {
		suit = s;
		value = v;
	}
	
	public void display() {
		System.out.println(value + "  " + suit);
	}

	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
