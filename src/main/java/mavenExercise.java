import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class mavenExercise {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        String test = "Life, The Universe, and Everything";

        System.out.printf("You Entered: '%s'\n", userInput);

        if (StringUtils.isNumeric(userInput)) {
            System.out.printf("'%s' is a number.\n", userInput);
        } else {
            System.out.printf("'%s' is not a number.\n", userInput);
        }

        System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(userInput));

        System.out.printf("Reversed: %s", StringUtils.reverse(userInput));
    }
}
