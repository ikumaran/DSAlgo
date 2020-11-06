package ik.app;

/**
 * Purpose of this class - is to build a mini cricket scorecard.
 * Score should display runs scored for last n balls.
 *
 * In other words - this is nothing but a queue - with fixed size.
 */
public class LiveCricketScore {

    private Node head;
    private Node tail;

    // define current size of the queue
    private int size;

    // define last n balls;
    private final int maxNumberOfBalls;

    LiveCricketScore(int maxNumberOfBalls) {
        this.maxNumberOfBalls = maxNumberOfBalls;
    }

    /**
     * Every score is stored as part of a node.
     */
    private static class Node {
        private final int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /**
     * Add score to the queue.
     * @param score
     */
    public void addScore(int score) {
        Node currentScore = new Node(score);
        if (this.tail != null) {
            this.tail.next = currentScore;
        }
        // new score is part of my tail node.
        this.tail = currentScore;

        if (this.head == null) {
            this.head = this.tail;
        }
        this.size++;
        this.refresh();
    }

    /**
     * Pop the first element.
     */
    private void pop() {
        if (this.tail == null || this.head == null) {
            //nothing to pop
            return;
        }
        this.head = this.head.next;
        this.size--;
    }

    /**
     * Refresh the queue size to limit with maxNumberOfBalls.
     */
    private void refresh() {
        while (size > maxNumberOfBalls) {
            this.pop();
        }
    }

    /**
     * Get scores based on number of balls.
     * @param index
     * @return
     */
    public int getRunsByIndex(int index) {
        if (this.head == null || this.tail ==null) {
            return -1;
        }
        Node currentNode = this.head;
        int indexCounter = 0;
        while (currentNode != null) {
            if (indexCounter == index) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            indexCounter++;
        }
        throw new IllegalArgumentException("Wrong input");
    }

}
