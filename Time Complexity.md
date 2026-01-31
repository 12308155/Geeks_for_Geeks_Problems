

1\. What is Time Complexity?



* Time Complexity measures how the execution time of an algorithm grows as the input size (n) increases.
* Time complexity tells us how fast (or slow) an algorithm runs as the input size (n) grows.



👉 It does NOT measure actual time (seconds).

👉 It measures number of operations.



Big-O → upper bound (worst case)



Big-Ω → lower bound (best case)



Big-Θ → tight bound (exact growth)





###### Rules to Calculate Time Complexity

Rule 1: Ignore constants

&nbsp;              O(5n) → O(n)

&nbsp;              O(100) → O(1)



Rule 2: Sequential statements → Add

&nbsp;         for(int i=0;i<n;i++) {}   // O(n)

&nbsp;         for(int j=0;j<n;j++) {}   // O(n)



👉 Total = O(n + n) = O(n)



Rule 3: Nested loops → Multiply

&nbsp;           for(int i=0;i<n;i++) {

&nbsp;             for(int j=0;j<n;j++) {

&nbsp;              }

&nbsp;           }



👉 O(n × n) = O(n²)



Rule 4: Drop lower order terms -->O(n² + n + 1) → O(n²)



##### &nbsp;                                           Time Complexity of Common Algorithms



|                                    Algorithm|        Time Complexity|
|-|-|
|Binary Search| O(log n)|
|Bubble Sort| O(n²)|
|Selection Sort| O(n²)|
|Insertion Sort| O(n²)|
|Merge Sort| O(n log n)|
|Quick Sort|O(n log n) (avg)|
|Hashing|O(1) (avg)|
|Linear Search|O(n)|
|||
|||

&nbsp;



What is Space Complexity?



Space Complexity measures how much memory an algorithm uses as the input size (n) increases.



👉 Includes:



Memory for variables



Arrays / data structures



Function calls (recursion stack)









