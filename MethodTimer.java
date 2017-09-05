//Time Method Class to measure how long it takes to execute a method using Runnable.
public class MethodTimer {
	
	private static long startTime; //Start time
	private static long endTime; //Stop time
	
	protected static void start(Runnable method) {
		startTime = System.nanoTime(); //Store the current time in nanoseconds.
		method.run(); //Run the method.
		endTime = System.nanoTime(); //Store the end time in nanoseconds.
		double timeTaken = endTime - startTime; //Store the time it took by reducing the end time with start time.
		double seconds = (double)timeTaken / 1000000000.0; //Convert to seconds for a better human readable figure.
		//Print out the time in seconds in a more reasonable figure rather than exponential.
		System.out.println("***************************************************");
		System.out.format("Time taken: %f Seconds \r\n", seconds);
		System.out.println("***************************************************");
	}
	
}
