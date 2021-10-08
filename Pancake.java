package ex2;

public class Pancake extends portion {
	public String toString() {
		System.out.println(		"eat pancake");
		return String.valueOf(calories);
		
	}

	public Pancake(double radius) {
		double area=Math.PI*radius*radius;
		calories=area*10;
		// TODO Auto-generated constructor stub
		
	}

}
