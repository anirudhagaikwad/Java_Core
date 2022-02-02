


public class EnumTest {
	
//	public enum Day
//	{
//		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
//	}

	Day day;
	
	EnumTest(Day day)
	{
		this.day=day;
	}
	
	public void tellItLike()
	{
		switch(day) {
		case MONDAY:
			System.out.println("Monday is bad..");
			break;
		case FRIDAY:
			System.out.println("Friday are better..");
			break;
		case SATURDAY: case SUNDAY:
			System.out.println("Weekends is best...");
			break;
			
		default:	
			System.out.println("Midweek daysssssssssssssssssssss....");
			break;
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumTest firstDay=new EnumTest(Day.MONDAY);
		firstDay.tellItLike();
		
		EnumTest firstDay1=new EnumTest(Day.WEDNESDAY);
		firstDay1.tellItLike();
		
		EnumTest firstDay2=new EnumTest(Day.SATURDAY);
		firstDay2.tellItLike();
		
		EnumTest firstDay3=new EnumTest(Day.SUNDAY);
		firstDay3.tellItLike();
		
		

	} // end main()

}// end class
