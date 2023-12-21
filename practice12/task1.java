package practice12;

import java.util.Scanner;
import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two-player cards (without spaces): ");
        String input = scanner.nextLine();

        String player1 = input.substring(0, 5);
        String player2 = input.substring(5);

        String result = playPyanitsa(player1, player2);

        System.out.println(result);
    }

    public static String playPyanitsa(String player1, String player2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int moves = 0;

        for (int i = 4; i >= 0; i--) {
            stack1.push(Character.getNumericValue(player1.charAt(i)));
            stack2.push(Character.getNumericValue(player2.charAt(i)));
        }

        while (moves < 106) {
            moves++;
            int card1 = stack1.pop();
            int card2 = stack2.pop();

            if (card1 > card2) {
                stack1.push(card2);
                stack1.push(card1);
            } else {
                stack2.push(card1);
                stack2.push(card2);
            }

            if (stack1.isEmpty()) {
                return "second " + moves;
            } else if (stack2.isEmpty()) {
                return "first " + moves;
            }
        }

        return "botva";
    }
}
