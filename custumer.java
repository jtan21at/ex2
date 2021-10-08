package ex2;
import ex2.portion;

public class custumer {
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
			// TODO Auto-generated method stub

		}

	}

	double cal_in=0;
	public void eat(portion food) {
		cal_in+=Double.valueOf(food.toString());
		System.out.println(cal_in);
		if (cal_in>10000){
			System.out.println("custumer explode");
			is_safe=false;
		}
	}
	public boolean is_safe=true;
	public custumer() {
		// TODO Auto-generated constructor stub
	}

}
