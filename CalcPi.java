// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		System.out.println("pi according to Java: " + Math.PI);
		 double x = 1;
		 double sum = 0;
		 for (int i=0; i<n; i++){
			if(i % 2 != 0){
				sum = sum - (1/x);
			}else{
				sum = sum + (1/x);
			}
			x = x +2;
		 }
		 sum = sum*4;
		 System.out.println("pi, approximated:"  + sum);
		 
		 //problem with the result 
	}
}
