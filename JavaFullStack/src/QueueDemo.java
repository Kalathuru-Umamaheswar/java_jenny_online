import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class QueueDemo {
    public static void main(String[] args) {

        // =========================================================================
        // 1. LINKEDLIST IMPLEMENTATION (Standard FIFO Queue behavior)
        // =========================================================================
        System.out.println("--- 1. LinkedList as a Standard Queue (FIFO) ---");
        Queue<String> standardQueue = new LinkedList<>();

        // Set A: Methods that throw exceptions on failure
        System.out.println("[Set A] Adding elements using add()...");
        standardQueue.add("Alice");
        standardQueue.add("Bob");
        System.out.println("Queue: " + standardQueue);
        System.out.println("Examining head using element(): " + standardQueue.element());

        // Set B: Methods that return special values (true/false/null)
        System.out.println("\n[Set B] Offering elements using offer()...");
        standardQueue.offer("Charlie");
        System.out.println("Queue: " + standardQueue);
        System.out.println("Peeking head using peek(): " + standardQueue.peek());

        // Removing elements
        System.out.println("\n[Set A] Removing element using remove(): " + standardQueue.remove());
        System.out.println("[Set B] Polling element using poll(): " + standardQueue.poll());
        System.out.println("Final LinkedList Queue: " + standardQueue);
        System.out.println();


        // =========================================================================
        // 2. PRIORITYQUEUE IMPLEMENTATION (Sorted / Priority behavior)
        // =========================================================================
        System.out.println("--- 2. PriorityQueue Implementation (Natural Ordering) ---");
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Elements are inserted in arbitrary order but retrieved in ascending order
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println("Internal Heap representation (might look unsorted): " + priorityQueue);

        // Items are retrieved strictly in sorted order (lowest value = highest priority)
        System.out.println("Peeking highest priority item: " + priorityQueue.peek());
        System.out.println("Polling items in order of priority:");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println("\n");


        // =========================================================================
        // 3. ARRAYDEQUE IMPLEMENTATION (Double-Ended Queue behavior)
        // =========================================================================
        System.out.println("--- 3. ArrayDeque Implementation (Double-Ended Queue) ---");
        Deque<String> deque = new ArrayDeque<>();

        // Set A: Exception-throwing Double-Ended Methods
        System.out.println("[Set A] Adding elements to ends...");
        deque.addFirst("Middle");   // [Middle]
        deque.addFirst("Front");    // [Front, Middle]
        deque.addLast("Back");      // [Front, Middle, Back]
        System.out.println("Deque: " + deque);
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // Set B: Special-value Double-Ended Methods
        System.out.println("\n[Set B] Offering elements to ends...");
        deque.offerFirst("New Front");
        deque.offerLast("New Back");
        System.out.println("Deque: " + deque);
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // Removing from both ends
        System.out.println("\n[Set A] Removing from front: " + deque.removeFirst());
        System.out.println("[Set A] Removing from back: " + deque.removeLast());
        System.out.println("[Set B] Polling from front: " + deque.pollFirst());
        System.out.println("[Set B] Polling from back: " + deque.pollLast());
        System.out.println("Final Deque State: " + deque);
    }
}