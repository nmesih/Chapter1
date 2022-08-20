package chapter01.exerxises;

public class E11 {
	public static void main(String[] args) {
		/*The U.S. Census Bureau projects population based on the 
          following assumptions:
 		■ One birth every 7 seconds
 		■ One death every 13 seconds
 		■ One new immigrant every 45 seconds
 		
 		Write a program to display the population for each of the next five years. Assume the 
		current population is 312,032,486 and one year has 365 days. Hint: In Java, if two 
		integers perform division, the result is an integer. The fractional part is truncated. For 
		example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with 
		the fractional part, one of the values involved in the division must be a number with a 
		decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
        */
		System.out.println("Number of seconds in a year: " + (60 * 60 * 24 * 365));
		System.out.println("Number of birth per year: " + (31536000 / 7.0));
		System.out.println("Number of death per year: " + (31536000 / 13.0));
		System.out.println("Number of immigrants per year: " + (31536000 / 45.0));
		
		System.out.println("Year\t\tPopulation" +
		"\n0\t\t312032486" +
		"\n1\t\t" + (312032486.0 + 4505142.857142857 - 2425846.153846154 + 700800.0) +
		"\n2\t\t" + (3.148125827032967E8 + 4505142.857142857 - 2425846.153846154 + 700800.0) +
		"\n3\t\t" + (3.1759267940659344E8 + 4505142.857142857 - 2425846.153846154 + 700800.0) +
		"\n4\t\t" + (3.2037277610989016E8 + 4505142.857142857 - 2425846.153846154 + 700800.0) +
		"\n5\t\t" + (3.231528728131869E8 + 4505142.857142857 - 2425846.153846154 + 700800.0));
	}

}
