/* IN JAVA A HEAP IS REPRESENTED BY A PRIORITY QUEUE */
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

// Construct an empty Min Heap
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Construct an empty Max Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// Construct a Heap with initial elements. 
// This process is named "Heapify".
// The Heap is a Min Heap
PriorityQueue<Integer> heapWithValues= new PriorityQueue<>(Arrays.asList(3, 1, 2));



/* INSERTING AN ELEMENT */
// Insert an element to the Min Heap
minHeap.add(5);

// Insert an element to the Max Heap
maxHeap.add(5);



/* GETTING THE TOP ELEMENT */
// Get top element from the Min Heap
// i.e. the smallest element
minHeap.peek();
// Get top element from the Max Heap
// i.e. the largest element
maxHeap.peek();



/* DELETING TOP ELEMENT */
// Delete top element from the Min Heap
minHeap.poll();

// Delete top element from the Max Heap
maxheap.poll();



/* GETTING THE LENGTH */
// Length of the Min Heap
minHeap.size();

// Length of the Max Heap
maxHeap.size();

// Note, in Java, apart from checking if the length of the Heap is 0, we can also use isEmpty()
// If there are no elements in the Heap, isEmpty() will return true;
// If there are still elements in the Heap, isEmpty() will return false;



/* SPACE AND TIME COMPLEXITY */ /*
HEAP METHOD                |   TIME COMPLEXITY     |   SPACE COMPLEXITY

Construct a Heap                O(N)                    O(N)
Insert an element               O(logN)                 O(1)
Get the top element             O(1)                    O(1)
Delete the top element          O(logN)                 O(1)
Get the size of a Heap          O(1)                    O(1)
*/