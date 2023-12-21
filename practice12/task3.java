package practice12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class task3 {
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
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        int moves = 0;

        for (int i = 0; i < 5; i++) {
            deque1.offerLast(Character.getNumericValue(player1.charAt(i)));
            deque2.offerLast(Character.getNumericValue(player2.charAt(i)));
        }

        while (moves < 106) {
            moves++;
            int card1 = deque1.pollFirst();
            int card2 = deque2.pollFirst();

            if (card1 > card2) {
                deque1.offerLast(card2);
                deque1.offerLast(card1);
            } else {
                deque2.offerLast(card1);
                deque2.offerLast(card2);
            }

            if (deque1.isEmpty()) {
                return "second " + moves;
            } else if (deque2.isEmpty()) {
                return "first " + moves;
            }
        }

        return "botva";
    }
}
