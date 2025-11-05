public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
		if (hours == 0){
			hours = 24;
		}
		int TotalMinutes = hours*60 + minutes + minutesToAdd;
        int TotalHours = TotalMinutes / 60;
        int NewHours = TotalHours % 24;
        int NewMinutes = TotalMinutes - (TotalHours * 60);

		if (NewHours <= 9){
			System.out.print("0" + NewHours + ":");
		}else{
			System.out.print( NewHours + ":");
		}if (NewMinutes <= 9){
			System.out.print("0" + NewMinutes);
		}else{
			System.out.print( NewMinutes);
		}

    }
}
