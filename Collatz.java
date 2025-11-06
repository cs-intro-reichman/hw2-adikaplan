// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		
			for(int i=1; i<=N ; i++ ){
				String row =  i + " " ;
				int j=i;
				int rounds =1;
				do{
					if( j % 2 != 0){
					j = (j*3)+1;
					row = row + j + " ";
				}else{
					j = j/2;
					row = row + j + " ";
				}
				rounds = rounds +1;
				}while(j != 1);

			if(mode.equals("c") == true && i == N){
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

			}else if (mode.equals("v") == true){ 
				System.out.println(row + "(" + rounds + ")");
			if(i == N){
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

			
			
			}
		}	
	}
}
}
