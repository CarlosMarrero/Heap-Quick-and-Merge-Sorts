
import java.util.*;

@SuppressWarnings("hiding")
public class HeapSort<Person extends Comparable<? super Person>> {

    private int N;

    public <Person extends Comparable<? super Person>> void sort(
            Vector<Person> theVector) {
        heapify(theVector);
        for (int i = N; i > 0; i--) {
            swap(theVector, 0, i);
            N = N - 1;
            maxheap(theVector, 0);
        }
    }

    /* Function to build a heap */
    public <Person extends Comparable<? super Person>> void heapify(
            Vector<Person> theVector) {
        N = theVector.size() - 1;
        for (int i = N / 2; i >= 0; i--) {
            maxheap(theVector, i);
        }
    }

    /* Function to swap largest element in heap */
    public <Person extends Comparable<? super Person>> void maxheap(
            Vector<Person> theVector, int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && theVector.get(left).compareTo(theVector.get(i)) > 0) {
            max = left;
        }
        if (right <= N
                && theVector.get(right).compareTo(theVector.get(max)) > 0) {
            max = right;
        }
        if (max != i) {
            swap(theVector, i, max);
            maxheap(theVector, max);
        }
    }

    /* Function to swap two numbers in the vector */
    public <Person extends Comparable<? super Person>> void swap(
            Vector<Person> theVector, int i, int j) {
        Person tmp = theVector.get(i);
        theVector.setElementAt(theVector.get(j), i);
        theVector.setElementAt(tmp, j);
    }
}
