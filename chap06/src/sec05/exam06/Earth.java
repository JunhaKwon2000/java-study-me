package sec05.exam06;

public class Earth {
	
	// Creating constant(unchangeable)
	static final double EARTH_RAIDUS = 6400; // Conventionally all letters are capitalized, connect words by _
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RAIDUS * EARTH_RAIDUS; // Constants must be initialized
	
	// public Earth() {
	//	EARTH_AREA = 4 * Math.PI * EARTH_RAIDUS * EARTH_RAIDUS; // Initializing constant at constructor does not work
	//}
	
	// (remind)
	// if you did not initialize a constant, you can initialize it at a static block
	// static {
	//	EARTH_AREA = 4 * Math.PI * EARTH_RAIDUS * EARTH_RAIDUS;
	//}
}
