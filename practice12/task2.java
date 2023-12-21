package practice12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task2 {
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
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int moves = 0;

        for (int i = 0; i < 5; i++) {
            queue1.offer(Character.getNumericValue(player1.charAt(i)));
            queue2.offer(Character.getNumericValue(player2.charAt(i)));
        }

        while (moves < 106) {
            moves++;
            int card1 = queue1.poll();
            int card2 = queue2.poll();

            if (card1 > card2) {
                queue1.offer(card2);
                queue1.offer(card1);
            } else {
                queue2.offer(card1);
                queue2.offer(card2);
            }

            if (queue1.isEmpty()) {
                return "second " + moves;
            } else if (queue2.isEmpty()) {
                return "first " + moves;
            }
        }

        return "botva";
    }
}
