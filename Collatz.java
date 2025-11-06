// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String input = args[1];
		if (input.equals("v") == true){
			for(int i=1; i<=N ; i++ ){
				int j=i;
				int rounds =1;
				System.out.print(i+ " ");
				if(j==1){
					j = (j*3)+1;
					System.out.print(j + " ");
					rounds = rounds +1;
				}else if (j!=1){
				while(j != 1){
				if( j % 2 != 0){
					j = (j*3)+1;
					System.out.print(j + " ");
				}else{
					j = j/2;
					System.out.print(j + " ");
				}
				rounds = rounds +1;
			    }
				System.out.print("(" + rounds + ")");
				System.out.println();
			}
		}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
		
		else if (input.equals("c") == true){
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

		}
		
		
	}
}
