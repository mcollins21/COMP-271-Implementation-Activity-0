import java.util.Scanner;

public class rainfall {

    public static void main(final String[] args) {
        Scanner rainfallinput = new Scanner(System.in);     // initializing our scanner to scan for input values
        System.out.println("enter rainfall amounts");       // prompting user to input rainfall amounts

        String rainfall;
        double rainfallsum = 0;
        double rainfallcount = 0;

        while (true) {                                      // while loop continues to run when case is true
            rainfall = rainfallinput.nextLine();

            if (rainfall.equalsIgnoreCase("")) {           // empty input case
                System.out.println("must put valid rainfall amount");   // system prompts user to put valid amount
            }

            if (rainfall.equalsIgnoreCase("stop"))      //when loop detects the case "stop", it breaks
                break;
            else {
                double average = Double.parseDouble(rainfall);
                if (average > 0){                                   // rainfall amount must be a positive value
                    rainfallcount++;
                    rainfallsum = rainfallsum + average;

                }
            }
        }

        System.out.println("average rainfall " + rainfallsum / rainfallcount);      // prints rainfall average
        rainfallinput.close();                                                      // closes scanner
    }
}
