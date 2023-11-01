package studio7;

public class Rectangle {
	//instance variables
	private int length;
	private int width;

	public Rectangle(int tempLength, int tempWidth) {
		this.length = tempLength;
		this.width = tempWidth;
	}
	public int calculatedArea() {
		return length*width;
	}
	public int calculatedPreimeter() {
		return 2*(length+width);
	}
	public boolean square() {
		if(length == width) {
			return true;
		}else {
			return false;
		}
	}
	public boolean compare(Rectangle b) {
		if(b.calculatedArea() > calculatedArea()) {
			return true;
		}else {
			return false;
		}
	}
	 public String toString() {
		 return "length: " + length + " width: " + width + " area: " + calculatedArea() + " preimeter: " + calculatedPreimeter() + 
				 " Is it a square? " + square() + " Is the rectangle smaller than rectangle b? " + compare();
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
