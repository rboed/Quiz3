// Ryan Boedeker
package mainPackage;
public class Triangle extends GeometricObject{

	private double side1;
	private double side2;
	private double side3;
	
	/**
	 * Creates a triangle with three sides, all with a length of 1.0
	 */
	public Triangle(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	/**
	 * Create a triangle with given lengths of each side
	 * @param side1 the length of side1
	 * @param side2 the length of side2
	 * @param side3 the length of side2
	 */
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/**
	 * 
	 * @return length of side1
	 */
	public double getSide1(){
		return side1;
	}
	
	/**
	 * 
	 * @return length of side2
	 */
	public double getSide2(){
		return side2;
	}
	
	/**
	 * 
	 * @return length of side3
	 */
	public double getSide3(){
		return side3;
	}
	
	/**
	 * Finds the area of a triangle
	 * @return the area of the triangle at hand
	 */
	public double getArea(){ 
		double semiPerimeter = 1/2 * (side1 + side2 + side3);
		double finalArea = Math.sqrt(semiPerimeter * (semiPerimeter - side1)*(semiPerimeter - side2)*(semiPerimeter - side3));
		return finalArea;
	}
	
	/**
	 * Finds the perimeter of a triangle
	 * @return the perimeter of the triangle at hand
	 */
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	/**
	 * Returns a string description for the triangle
	 */
	public String toString(){
		return "The triangle has sides with lenghts of " + this.side1 + ", " + this.side2 + ",and " + this.side3 + ". The triangle has a perimeter of " + this.getArea() + "and area of " + this.getPerimeter() + ".";
	}
}