// Problem: Player Score Datatype
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/skill-test/PHQSMO/problems/CBNFLQ08
// Solved on: 2026-10-07T17:35:10.300Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int totalSecondsInput = 7384;

        // Calculate full hours
        int hours=totalSecondsInput/3600;
        int remainingSecondsAfterHours=totalSecondsInput%3600;

        // Calculate full minutes from remaining seconds
        int minutes=remainingSecondsAfterHours/60;

        // Remaining seconds after extracting minutes
        int seconds=remainingSecondsAfterHours%60;

        // Output the result
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

	}
}
