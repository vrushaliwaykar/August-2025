package Pac1;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Lab1_14 
{
	public static void printTime(String zone)
	{
		ZonedDateTime time=ZonedDateTime.now(ZoneId.of(zone));
		System.out.println("Time in "+zone+ " : "+time);
	}
	public static void main(String[] args) 
	{
		printTime("Asia/Tokyo");
		printTime("America/New_York");
        printTime("Europe/London");
        printTime("US/Pacific");
        printTime("Africa/Cairo");
        printTime("Australia/Sydney");

	}

}
