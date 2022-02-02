
/*
 * Write a class whose instance represent a single playing card from a deck of cards.Playing cards have tow distinguishing properties i.e rank and suit. 
 */
public class Card {
	private final int rank;
	private final int suit;
	
	//kinds of suite
	public final static int DIAMONDS=1;
	public final static int CLUBS=2;
	public final static int SPADES=4;
	public final static int HEARTS=3;
	
	//kind of ranks
	public final static int KING=13;
	public final static int QUEEN=12;
	public final static int JACK=11;
	public final static int TEN=10;
	public final static int NINE=9;
	public final static int EIGHT=8;
	public final static int SEVEN=7;
	public final static int SIX=6;
	public final static int FIVE=5;
	public final static int FOUR=4;
	public final static int THREE=3;
	public final static int DEUCE=2;
	public final static int ACE=1;
	
	public Card(int rank,int suit)
	{
		assert isValidRank(rank);
		assert isValidSuit(suit);
		this.rank=rank;
		this.suit=suit;
	}//constructor
	
	public static boolean isValidRank(int rank)
	{
		return ACE<=rank && rank<=KING;
	}
	
	
	public static boolean isValidSuit(int suit)
	{
		return DIAMONDS<=suit && suit<=SPADES;
	}
	
	

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}
	
//	public final static int DIAMONDS=1;
//	public final static int CLUBS=2;
//	public final static int SPADES=4;
//	public final static int HEARTS=3;
	
	public static String suiteToString(int suit)
	{
		switch(suit)
		{
		case DIAMONDS:
			return "DIAMONDS";
		case CLUBS:
			return "CLUBS";
		case HEARTS:
			return "HEARTS";
		case SPADES:
			return "SPADES";
		default:
			return null;
		}
		
	} // end suiteToString(int suit)
	
	
//	public final static int KING=13;
//	public final static int QUEEN=12;
//	public final static int JACK=11;
//	public final static int TEN=10;
//	public final static int NINE=9;
//	public final static int EIGHT=8;
//	public final static int SEVEN=7;
//	public final static int SIX=6;
//	public final static int FIVE=5;
//	public final static int FOUR=4;
//	public final static int THREE=3;
//	public final static int DEUCE=2;
//	public final static int ACE=1;
	
	public static String rankToString(int rank)
	{
		switch(rank)
		{
		case ACE:
			return "ACE";
		case DEUCE:
			return "DEUCE";
		case THREE:
			return "THREE";
		case FOUR:
			return "FOUR";
		case FIVE:
			return "FIVE";
		case SIX:
			return "SIX";
		case SEVEN:
			return "SEVEN";
		case EIGHT:
			return "EIGHT";
		case NINE:
			return "NINE";
		case TEN:
			return "TEN";
		case JACK:
			return "JACK";
		case QUEEN:
			return "QUEEN";
		case KING:
			return "KING";
		default:
			return null;
		}
	} // end rankToString(int rank)
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assert rankToString(ACE)=="ACE";
		assert rankToString(DEUCE)=="DEUCE";
		assert rankToString(THREE)=="THREE";
		assert rankToString(FOUR)=="FOUR";
		assert rankToString(FIVE)=="FIVE";
		assert rankToString(SIX)=="SIX";
		assert rankToString(SEVEN)=="SEVEN";
		assert rankToString(EIGHT)=="EIGHT";
		assert rankToString(NINE)=="NINE";
		assert rankToString(TEN)=="TEN";
		assert rankToString(JACK)=="JACK";
		assert rankToString(QUEEN)=="QUEEN";
		assert rankToString(KING)=="KING";
		
		assert suiteToString(DIAMONDS)=="DIAMONDS";
		assert suiteToString(CLUBS)=="CLUBS";
		assert suiteToString(HEARTS)=="HEARTS";
		assert suiteToString(SPADES)=="SPADES";
	} // end main

} //end class
