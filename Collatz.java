public class Collatz {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean isVerbose = mode.equals("v");

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sequenceLength = 0;

            do {
                if (isVerbose) {
                    System.out.print(temp + " ");
                }
                sequenceLength++;

                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = (temp * 3) + 1;
                }
            } while (temp != 1);

            sequenceLength++;
            if (isVerbose) {
                System.out.print(1);
            }

            if (isVerbose) {
                System.out.println(" (" + sequenceLength + ")");
            }
        }

        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}