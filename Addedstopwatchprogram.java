package day6logicalprogram;

import java.util.Scanner;

public class Addedstopwatchprogram {
	public static void printElapsedTime(long startTime, long endTime) {
		float sec;
		sec = (endTime - startTime) / 1000F; 
		System.out.println("Elapsed time in seconds is: " + sec + " seconds");


	}
	public static void main(String[] args) {
     long startTime, endTime;
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1 to start the stopwatch");
		a= sc.nextInt();

		if (a==1);
		{
			startTime = System.currentTimeMillis();
			System.out.println(" Enter 2 to stop the stopwatch");
			b= sc.nextInt();

			if (b==2);
			{
				endTime = System.currentTimeMillis();
				printElapsedTime(startTime, endTime);
				sc.close();
			}
		}
	}

	

}

