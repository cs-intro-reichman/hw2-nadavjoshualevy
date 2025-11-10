// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	  
		int terms = Integer.parseInt(args[0]);
		double count = 0.0;
		for (int i = 0; i<terms; i++){
			double neo = 2 * i + 1;
			double neoq = 1.0/neo;
			if (i%2 == 0){count = count + neoq;}
			else{count = count - neoq;}
		}
		double piApprox = count * 4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApprox);

	}

	
}
