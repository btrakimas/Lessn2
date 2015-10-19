package Lesson2;

public class conditional {
	
	public static int getDays(String month)
	{
		switch (month)
		{
		case "January":
			return 31;
		case "February":
			return 28;
		case "March":
			return 31;
		default:
			break;
				
		}
		// this is an error because the input month was not recognized
		return 0;
		
	}

}


