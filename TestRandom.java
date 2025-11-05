
public  class  TestRandom {
	public static void main(String[]  args) {
	    int n = Integer.parseInt(args[0]);
		int heads = 0;
		int tales = 0;
		for(int i = 0; i< n ; i++){
			if(Math.random() > 0.5){
				heads = heads +1;
			}else{
				tales = tales +1;
			}

		}
		System.out.println("> 0.5: " + heads + " times");
		System.out.println("<= 0.5: " + tales + " times");
		if( heads != 0 && tales != 0){
			double ratio = (double)heads / tales;

			System.out.println("Ratio: " + ratio);
		}
	}
}
