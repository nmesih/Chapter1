package chapter01.exerxises;

public class E12 {
	public static void main(String[] args) {
		/*Assume a runner runs 24 miles in 1 hour, 40  minutes,and 35 seconds. 
		 * Write a program that displays the average speed in kilometers per 
           hour. (Note that 1 mile is 1.6 kilometers.)
           */ 
		
		System.out.println("Miles to kilometers is " + (24 * 1.6) + ".");
		System.out.println("Number of hours in fraction is " + 
				(((60 * 60) + (40 * 60) + 35)) / (60.0 * 60));
		
		System.out.println("The runner ran " + (38.400000000000006 / 1.676388888888889) + " kilometers per hour");
	}

}
