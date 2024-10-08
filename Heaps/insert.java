import java.util.ArrayList;

public class Main {

    public static class Heap {
        private ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add element to the end of the ArrayList
            arr.add(data);

            // Heapify (move element upwards to maintain min-heap property)
            int childIndex = arr.size() - 1;
            int parentIndex = (childIndex - 1) / 2;

            while (childIndex > 0 && arr.get(childIndex) < arr.get(parentIndex)) {
                // Swap child and parent elements
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(10);
        heap.add(20);
        heap.add(5);
        heap.add(30);

        // Access elements (assuming you have methods for removal or peeking)
        // ...
    }
}