/**Author:George Samu
Date:6/3/2020
Purpose: This covers chapter four concepts up to
 page 84- 


*/
import java.util.*; 

public class ChptFourPartTwo
{
	public static void main (String[]args)
	{
	/**
	String phrase = "one potato     two  potato three potato four";
	//making a scanner object one that uses the string phrase

	Scanner scan= new Scanner(phrase);
	System.out.println(scan.next());
	System.out.println(scan.next());
	System.out.println(scan.next());
	System.out.println(scan.next());
	
	
	String data="one,potato,two,potato";
	Scanner scan= new Scanner(data);
	scan.useDelimiter(",");
	System.out.println(scan.next());
	System.out.println(scan.next());
	System.out.println(scan.next());
	System.out.println(scan.next());
	
	System.out.println();
	
	
	Date dateAndTimeNow= new Date();
	
	System.out.println(dateAndTimeNow);
	
	//using toString
	String dateAndTime=dateAndTimeNow.toString();
	
	System.out.println(dateAndTime);
	
	
	//The method equals
	Date dateAndTimeOne= new Date(1989, 10, 12);
	
	Date dateAndTimeTwo=new Date();
	
	
	System.out.println(dateAndTimeOne.equals(dateAndTimeTwo));
	
	//The method compareTo
	System.out.println("The date and time compare is: "+
						dateAndTimeOne.compareTo(dateAndTimeTwo));
						
	//The methods before and after
	boolean result=dateAndTimeOne.before(dateAndTimeTwo);
	System.out.println("The comparison between dateAndTimeOne before and dateAndTimeTwo: "+
						result);
						
	boolean	resultOne=dateAndTimeOne.after(dateAndTimeTwo);
	System.out.println("The comparison between dateAndTimeOne after and dateAndTimeTwo: "+
						resultOne);
	*/
	//End of page  90
	// Beginning page 91
	Integer ten = new Integer(10);
	Integer fiftyTwo = new Integer("52");
	Integer eighty=80;
	
	//get the value of an integer object as a primitive using .intValue() and doubleValue()
	System.out.println("The value of ten is:"+ ten.intValue());
	
	System.out.println("The value of fiftyTwo is: "+fiftyTwo.doubleValue());
	
	System.out.println("The value of 80 is: "+eighty.floatValue());
	
	
	
	}//end main
}// end ChptFourPartTwo