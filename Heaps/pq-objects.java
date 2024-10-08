import java.util.PriorityQueue;

public class Main {

    public static class Student implements Comparable<Student> {
        private String name;
        private int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.rank, other.rank); // Use Integer.compare for clarity
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            Student topStudent = pq.poll();
            System.out.println(topStudent.name + "->" + topStudent.rank);
        }
    }
}


//////////
java -cp /tmp/rOhctjq30u/Main
C->2
A->4
B->5
D->12

=== Code Execution Successful ===