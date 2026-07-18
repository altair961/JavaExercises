package chapter01;

public class Exercise13 {

	public static void main(String[] args) {
		double ed = 44.5 * 0.55;
		double bf = 50.2 * 5.9;
		double ad = 3.4 * 0.55;
		double bc = 50.2 * 2.1;
		double af = 3.4 * 5.9;
		double ec = 44.5 * 2.1;
		
		System.out.println("x: " + (ed - bf) / (ad - bc));
		System.out.println("y: " + (af - ec) / (ad - bc));
	}

}
