import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class SparseFactorialDiv2
{
	public long getCount(long lo, long hi, long divisor)
	{
		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, long p0, long p1, long p2, boolean hasAnswer, long p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2);
		System.out.println("]");
		SparseFactorialDiv2 obj;
		long answer;
		obj = new SparseFactorialDiv2();
		long startTime = System.currentTimeMillis();
		answer = obj.getCount(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p3);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p3;
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}
	public static void main(String[] args) {
		boolean all_right;
		all_right = true;
		
		long p0;
		long p1;
		long p2;
		long p3;
		
		// ----- test 0 -----
		p0 = 4L;
		p1 = 8L;
		p2 = 3L;
		p3 = 3L;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 9L;
		p1 = 11L;
		p2 = 7L;
		p3 = 1L;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1L;
		p1 = 1000000000000L;
		p2 = 2L;
		p3 = 999999999999L;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 16L;
		p1 = 26L;
		p2 = 11L;
		p3 = 4L;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 10000L;
		p1 = 20000L;
		p2 = 997L;
		p3 = 1211L;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 123456789L;
		p1 = 987654321L;
		p2 = 71L;
		p3 = 438184668L;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!