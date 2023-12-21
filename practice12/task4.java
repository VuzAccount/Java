package practice12;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleList {
    private Node head;
    private Node tail;

    public DoubleList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public int removeFromFront() {
        if (isEmpty()) {
            return -1;
        }
        int removedData = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removedData;
    }

    public void addToBack(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int removeFromBack() {
        if (isEmpty()) {
            return -1;
        }
        int removedData = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return removedData;
    }
}

public class task4 {
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
        DoubleList list1 = new DoubleList();
        DoubleList list2 = new DoubleList();
        int moves = 0;

        for (int i = 0; i < 5; i++) {
            list1.addToBack(Character.getNumericValue(player1.charAt(i)));
            list2.addToBack(Character.getNumericValue(player2.charAt(i)));
        }

        while (moves < 106) {
            moves++;
            int card1 = list1.removeFromFront();
            int card2 = list2.removeFromFront();

            if (card1 > card2) {
                list1.addToBack(card2);
                list1.addToBack(card1);
            } else {
                list2.addToBack(card1);
                list2.addToBack(card2);
            }

            if (list1.isEmpty()) {
                return "second " + moves;
            } else if (list2.isEmpty()) {
                return "first " + moves;
            }
        }

        return "botva";
    }
}

