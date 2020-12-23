package academy.learnprogramming;


public class Main {
	
	public static void main (String[]args) {
		
		float myMinFloatValue = Float.MIN_NORMAL;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("float minimum value =" +myMinFloatValue);		
		System.out.println("float maximum value =" +myMaxFloatValue);
		
		
		double myMindoubleValue = Double.MIN_NORMAL;
		double myMaxdoubleValue = Double.MAX_VALUE;
		System.out.println("double minimum value =" +myMindoubleValue);
		System.out.println("double maximum value =" +myMaxdoubleValue);
		
		
		
		int myIntvalue = 5;
		float myFloatvalue = 5.25f;
		double myDoublevalue = 5.25d;
		
		int myIntvValue = 5/2;
		float myFloatValue = 5/2;
		double myDoubleValue = 5d/2d;   //or instead 5.0/2.0
		System.out.println("My int value =" +myIntvalue);
		System.out.println("my float value =" +myFloatvalue);
		System.out.println("my double value =" +myDoubleValue);
		
		double numberOfPounds =200d;
		double convertedkilograms = numberOfPounds * 0.45359237d;
		System.out.println("converted kilogams is =" +convertedkilograms);
		
		
		
	}

}
