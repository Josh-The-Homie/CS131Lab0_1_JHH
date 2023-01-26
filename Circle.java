//Joshua Henderson
//CS131Lab0_1_JHH
public class Circle {
	//Radius variable
	private double radius;
	/**
	 * Default constructor
	 * @param i 
	 */
	public Circle(double i){
		this.radius=1;
	}//end Circle method
	/**
	 * 
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}//end getRadius
	/**
	 * 
	 * @param radius to be set
	 */
	public void setRadius(double radius) {
		this.radius=radius;
	}//end area
	/** 
	 * @return area of circle
	 */
	public double area() {
		return Math.PI * Math.pow(radius,2);
	}//end area
	
	}//end class