public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int n = Integer.parseInt(args[1]);
            word = word.toUpperCase();
             String aList = "AEFHILMNORSX";
            for(int i=0; i < word.length(); i++){
                char letter = word.charAt(i);
                if(aList.indexOf(letter) >= 0){
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                }else{
                     System.out.println("Give me a " + letter + ": " + letter + "!");   
                }
            }
            System.out.println("What does that spell?");
            for(int j=0; j < n; j++){
                System.out.println(word + "!!!");
            }
        }
}
