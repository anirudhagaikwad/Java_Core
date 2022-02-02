
public enum Planet {

	EARTH(5.976e+24,6.37814e6),
	MERCURY(3.303e+23,2.4397e6),
	VENUS(4.869e+24,6.0518e6),
	MARS(6.421e+23,3.3972e6),
    JUPITER(1.9e+27,7.1492e7);
	
	private final double mass; // in kg
	private final double radius; // in meters
	
	Planet(double mass, double radius)
	{
		this.mass=mass;
		this.radius=radius;
	} // constructor
	
	
	private double mass(){return mass;}
	
	private double radius(){return radius;}
	
	// universal gravitational constant (m3 kg-1 s-2)
	public static final double G=6.67300E-11;
	
	double surfaceGravity()
	{
		return G*mass/(radius*radius);
	}
	
	double surfaceweight(double otherMass)
	{
		return otherMass*surfaceGravity();
	}
	
	
	public static void main(String ar[])
	{
		if(ar.length!=1)
		{
			System.err.println("Usage : Planet <Earth_weight>");
			System.exit(-1);
		}
		
		double erthWeight=Double.parseDouble(ar[0]);
		double mass=erthWeight/EARTH.surfaceGravity();
		
		for(Planet p : Planet.values())
		{
			System.out.printf("Your Weight on %s is %f%n",p,p.surfaceweight(mass));
		}
	} // end main
	
	
} // end enum















