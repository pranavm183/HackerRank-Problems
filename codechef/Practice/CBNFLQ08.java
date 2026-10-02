// Problem: Player Score Datatype
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/skill-test/PHQSMO2/problems/CBNFLQ08
// Solved on: 2026-10-02T17:05:11.083Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int totalSecondsInput = 7384;

        // Calculate full hours
        int hours=totalSecondsInput/(60*60);
        
        int remaining=totalSecondsInput%(60*60);

        // Calculate full minutes from remaining seconds
        int minutes=remaining/60;

        // Remaining seconds after extracting minutes
        int seconds=remaining%60;

        // Output the result
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

	}
}
