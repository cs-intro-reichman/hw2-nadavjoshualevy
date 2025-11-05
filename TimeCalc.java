public class TimeCalc {
    public static void main(String[] args) {
       
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
       

        int totalMinutes = (hours*60) + minutes + minutesToAdd; 
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMinutes- (totalHours*60);

    

        if (hours>12)
        { hours = 24-hours;}
          


        String time = "";

      if (newHours<10 && newMinutes>10) {time = "0" + newHours + ":" + newMinutes;}
      if (newHours<10 && newMinutes<10) {time = "0" + newHours + ":0" + newMinutes;}
      if (newHours>10 && newMinutes<10) {time =  + newHours + ":0" + newMinutes;}
      if (newHours>10 && newMinutes>10) {time =  + newHours + ":" + newMinutes;}
      if (newHours==10 && newMinutes==10) {time =  + newHours + ":" + newMinutes;}
      if (newHours==10 && newMinutes>10) {time =  + newHours + ":" + newMinutes;}
      if (newHours==10 && newMinutes<10) {time =  + newHours + ":0" + newMinutes;}
      if (newHours>10 && newMinutes==10) {time =  + newHours + ":" + newMinutes;}
      if (newHours<10 && newMinutes==10) {time = "0" + newHours + ":" + newMinutes;}




       System.out.println( time );
    
    
    

    
  
		
    }
}
