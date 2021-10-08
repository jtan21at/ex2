package ex2;

public class Cupcake extends portion {
	public String toString() {
		System.out.println("eat cupcake");
		 return String.valueOf(calories);
		}
	public Cupcake(double radius,double height) {
		
		double vol=4*Math.PI*radius*radius*height;
		calories=4*vol;// TODO Auto-generated constructor stub
	}

}
