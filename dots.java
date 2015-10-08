/* For the Monte Carlo algorithm, I consulted various sites such as http://people.cs.pitt.edu/~ramirez/cs1538/handouts/Circle.java,
http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java, http://www.eveandersson.com/pi/monte-carlo-circle,
http://stackoverflow.com/questions/25346042/monte-carlo-simulation-of-pi-in-simple-java, and http://www.dreamincode.net/forums/topic/352222-monte-carlo-technique-help/
 Also, 4 billion is too much for Java to handle so I had to cut it down to a more manageablesize.
 */

public class dots
    {
    public static void main(String[] args){
    	int radius = 2;
    double area = (Math.PI*radius * radius)/4; // Finds the area of the quadrant
    int hit = 0; // Stores hits
    int miss = 0; // Stores misses
	int i = 0; // Controls number of points
	while(i < 400000000)
	{

     double x = (Math.random() * area - 0.0 ); // Gets random x coordinate
     double y = (Math.random() * area - 0.0 ); // Gets random y coordinate
     double point = Math.sqrt(x*x + y*y);  // Get distance of the point
		if (point <= 2.0)	//Checks if the distance is within the circle
			hit++;			// the point is in the circle
		else
			miss++;      	// the point is outside the circle
		i++;
	}
	double ratio = (double)hit/i; // Ratio of area
	System.out.println("The number of hits is " + hit);
	System.out.println("The number of misses is  " + miss);
	System.out.println("The ratio is " + ratio);
    }
    }
    