
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
        int amount = Integer.parseInt(args[1]);
                String an = "AEFHILMNORSXaefhilmnorsx";
                word= word.toUpperCase();
            for (int i = 0 ; i<word.length() ; i++){
                char c = word.charAt(i);
                if (an.indexOf(c)==-1) { System.out.println("Give me a  " + (word.charAt(i)) + ": " + word.charAt(i) + "!");}
                  else { System.out.println("Give me an " + word.charAt(i) + ": " + word.charAt(i) + "!");       
        
            }
        }
                System.out.println("What does that spell?");

                for (int i = 0; i<amount; i++){
                        System.out.println(word + "!!!");
                }
}
}
