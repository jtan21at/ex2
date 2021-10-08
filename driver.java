/**
 * 
 */
package ex2;
import ex2.portion;
import ex2.custumer;
import java.util.Scanner;
import java.util.Random;
/**
 * @author j
 *
 */
public class driver {

	/**
	 * 
	 */
	public driver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter pancake size in radius");
		double radius=0;
		if(myObj.hasNextInt()) {
			 radius=Double.valueOf(myObj.nextLine()); 
    
		}
		else {
		
		
		      System.out.println("Something's wrong.");
	    
		}
		try {
		portion cupcake=new Pancake(radius);
		System.out.println("Enter cupcake height");
		double height=Double.valueOf(myObj.nextLine());
		System.out.println("Enter cupcake radius");
		double radius_1=Double.valueOf(myObj.nextLine());
		portion pancake=new Cupcake(radius_1,height);
		
		custumer one=new custumer();
		int random_num=0;
		Random rand=new Random();
		while (one.is_safe) {
			random_num=rand.nextInt(2);
			if (random_num==1) {
				one.eat(pancake);
			}else {
				one.eat(cupcake);
				
			}
			
		
		}
	}
	catch(Exception e) {
	      System.out.println("Something's wrong.");
    // TODO Auto-generated method stub

	}

}}
