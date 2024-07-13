import java.text.NumberFormat;
import java.util.Scanner;

public class CalorieWeeklyAverage {
    public static void main(String[] args) {

        // first question to choose what to check
        System.out.println("Do you want a weekly overview (y/n)? ");
        Scanner scanner = new Scanner(System.in);

        String initialAnswer = scanner.nextLine();

        int dailyCalories = 1700;
        int weeklyGoal = 0;
        int dailyAverage = 0;
        int dailyDifference = 0;
        int consumedCalories = 0;

        // Checks answer and ignores capitals Y = y etc
        if (initialAnswer.equalsIgnoreCase("y")) {
            System.out.println("Please enter the calories for each day:");

            int[] sevenDayCalories = new int[7];
            int sumSevenDays = 0;
            String[] days = {"Mon: ", "Tues: ", "Weds: ", "Thurs: ", "Fri: ", "Sat: ", "Sun: "};

            // Gathers 7 values from the user because the array is set to 7 above
            for (int i = 0; i < sevenDayCalories.length; i++) {

                // Gives a label next to each user input
                System.out.print(days[i]);
                sevenDayCalories[i] = scanner.nextInt();
            }

            for (int i = 0; i < sevenDayCalories.length; i++) {
                sumSevenDays = sumSevenDays + sevenDayCalories[i];
            }

            // sets out the calculations for daily goal calories, how much you ate over the week
            // the average consumed daily and how much over or under that is per day

            dailyAverage = sumSevenDays / 7;
            weeklyGoal = dailyCalories * 7;
            consumedCalories = sumSevenDays - weeklyGoal;
            dailyDifference = consumedCalories / 7;


            if (sumSevenDays < weeklyGoal) {
                System.out.println("\n" + "Calories under weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                System.out.println("Calories under daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
            } else if (sumSevenDays > weeklyGoal) {
                System.out.println("\n" + "Calories over weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                System.out.println("Calories over daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
            }
            System.out.println("Average calories consumed: " + NumberFormat.getInstance().format(Math.abs(dailyAverage)));
            System.out.println("Daily calorie goal: " + NumberFormat.getInstance().format(Math.abs(dailyCalories)));
        }
        // Switch case to check between multiple days

        else if (initialAnswer.equalsIgnoreCase("n")) {
            System.out.println("How many days would you like to check?");
            int secondAnswer = scanner.nextInt();

            String[] cases = {"1: ","2: ","3: ","4: ","5: ","6:  "};

            switch (secondAnswer) {
                case 2:
                    int[] twoDayCalories = new int[2];
                    int sumTwoDays = 0;
                   for (int i = 0; i < twoDayCalories.length; i++) {

                        // Gives a label next to each user input
                        System.out.print(cases[i]);
                        twoDayCalories[i] = scanner.nextInt();
                    }


                    for (int i = 0; i < twoDayCalories.length; i++) {
                        sumTwoDays = sumTwoDays + twoDayCalories[i];
                    }

                    // sets out the calculations for daily goal calories, how much you ate over the week
                    // the average consumed daily and how much over or under that is per day

                    dailyAverage = sumTwoDays / 2;
                    weeklyGoal = dailyCalories * 2;
                    consumedCalories = sumTwoDays - weeklyGoal;
                    dailyDifference = consumedCalories / 2;


                    if (sumTwoDays < weeklyGoal) {
                        System.out.println("\n" + "Calories under weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories under daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    } else if (sumTwoDays > weeklyGoal) {
                        System.out.println("\n" + "Calories over weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories over daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    }
                    System.out.println("Average calories consumed: " + NumberFormat.getInstance().format(Math.abs(dailyAverage)));
                    System.out.println("Daily calorie goal: " + NumberFormat.getInstance().format(Math.abs(dailyCalories)));
                    break;

                case 3:
                    int[] threeDayCalories = new int[3];
                    int sumThreeDays = 0;
                    for (int i = 0; i < threeDayCalories.length; i++) {

                        // Gives a label next to each user input
                        System.out.print(cases[i]);
                        threeDayCalories[i] = scanner.nextInt();
                    }

                    for (int i = 0; i < threeDayCalories.length; i++) {
                        sumThreeDays = sumThreeDays + threeDayCalories[i];
                    }

                    // sets out the calculations for daily goal calories, how much you ate over the week
                    // the average consumed daily and how much over or under that is per day

                    dailyAverage = sumThreeDays / 3;
                    weeklyGoal = dailyCalories * 3;
                    consumedCalories = sumThreeDays - weeklyGoal;
                    dailyDifference = consumedCalories / 3;


                    if (sumThreeDays < weeklyGoal) {
                        System.out.println("\n" + "Calories under weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories under daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    } else if (sumThreeDays > weeklyGoal) {
                        System.out.println("\n" + "Calories over weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories over daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    }
                    System.out.println("Average calories consumed: " + NumberFormat.getInstance().format(Math.abs(dailyAverage)));
                    System.out.println("Daily calorie goal: " + NumberFormat.getInstance().format(Math.abs(dailyCalories)));
                    break;

                case 4:
                    int[] fourDayCalories = new int[4];
                    int sumFourDays = 0;
                    for (int i = 0; i < fourDayCalories.length; i++) {

                        // Gives a label next to each user input
                        System.out.print(cases[i]);
                        fourDayCalories[i] = scanner.nextInt();
                    }

                    for (int i = 0; i < fourDayCalories.length; i++) {
                        sumFourDays = sumFourDays + fourDayCalories[i];
                    }

                    // sets out the calculations for daily goal calories, how much you ate over the week
                    // the average consumed daily and how much over or under that is per day

                    dailyAverage = sumFourDays / 4;
                    weeklyGoal = dailyCalories * 4;
                    consumedCalories = sumFourDays - weeklyGoal;
                    dailyDifference = consumedCalories / 4;


                    if (sumFourDays < weeklyGoal) {
                        System.out.println("\n" + "Calories under weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories under daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    } else if (sumFourDays > weeklyGoal) {
                        System.out.println("\n" + "Calories over weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories over daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    }
                    System.out.println("Average calories consumed: " + NumberFormat.getInstance().format(Math.abs(dailyAverage)));
                    System.out.println("Daily calorie goal: " + NumberFormat.getInstance().format(Math.abs(dailyCalories)));
                    break;

                case 5:
                    int[] fiveDayCalories = new int[5];
                    int sumFiveDays = 0;
                    for (int i = 0; i < fiveDayCalories.length; i++) {

                        // Gives a label next to each user input
                        System.out.print(cases[i]);
                        fiveDayCalories[i] = scanner.nextInt();
                    }

                    for (int i = 0; i < fiveDayCalories.length; i++) {
                        sumFiveDays = sumFiveDays + fiveDayCalories[i];
                    }

                    // sets out the calculations for daily goal calories, how much you ate over the week
                    // the average consumed daily and how much over or under that is per day

                    dailyAverage = sumFiveDays / 5;
                    weeklyGoal = dailyCalories * 5;
                    consumedCalories = sumFiveDays - weeklyGoal;
                    dailyDifference = consumedCalories / 5;


                    if (sumFiveDays < weeklyGoal) {
                        System.out.println("\n" + "Calories under weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories under daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    } else if (sumFiveDays > weeklyGoal) {
                        System.out.println("\n" + "Calories over weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories over daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    }
                    System.out.println("Average calories consumed: " + NumberFormat.getInstance().format(Math.abs(dailyAverage)));
                    System.out.println("Daily calorie goal: " + NumberFormat.getInstance().format(Math.abs(dailyCalories)));
                    break;

                case 6:
                    int[] sixDayCalories = new int[6];
                    int sumSixDays = 0;
                    for (int i = 0; i < sixDayCalories.length; i++) {

                        // Gives a label next to each user input
                        System.out.print(cases[i]);
                        sixDayCalories[i] = scanner.nextInt();
                    }

                    for (int i = 0; i < sixDayCalories.length; i++) {
                        sumSixDays = sumSixDays + sixDayCalories[i];
                    }

                    // sets out the calculations for daily goal calories, how much you ate over the week
                    // the average consumed daily and how much over or under that is per day

                    dailyAverage = sumSixDays / 6;
                    weeklyGoal = dailyCalories * 6;
                    consumedCalories = sumSixDays - weeklyGoal;
                    dailyDifference = consumedCalories / 6;


                    if (sumSixDays < weeklyGoal) {
                        System.out.println("\n" + "Calories under weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories under daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    } else if (sumSixDays > weeklyGoal) {
                        System.out.println("\n" + "Calories over weekly goal: " + NumberFormat.getInstance().format(Math.abs(consumedCalories)));
                        System.out.println("Calories over daily: " + NumberFormat.getInstance().format(Math.abs(dailyDifference)));
                    }
                    System.out.println("Average calories consumed: " + NumberFormat.getInstance().format(Math.abs(dailyAverage)));
                    System.out.println("Daily calorie goal: " + NumberFormat.getInstance().format(Math.abs(dailyCalories)));
                    break;

                default: System.out.println("To compare, please a number between 2 and 6.");

            }
        }
    }
}
