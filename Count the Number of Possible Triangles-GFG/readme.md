## 2. Count the Number of Possible Triangles

### Problem Statement

Given an integer array `arr[]`, find the number of triangles that can be formed with three different elements as sides. A triangle is valid if the sum of any two sides is greater than the third side.

### Example Input and Output

#### Example 1
**Input**: `arr = [4, 6, 3, 7]`  
**Output**: `3`  
Explanation: Possible triangles are `[3, 4, 6]`, `[4, 6, 7]`, and `[3, 6, 7]`.

---

### Approach 1: Brute Force

Use three nested loops to iterate through all triplets and check the triangle inequality.

#### Time Complexity
- **O(n³)**

---

### Approach 2: Optimized with Sorting

Sort the array and use the two-pointer technique to count valid triangles.

#### Time Complexity
- **O(n²)**  
Sorting takes \(O(n \log n)\) and finding valid pairs takes \(O(n²)\).

---

### Code

For the complete implementation, refer to `count_triangles.cpp` in this repository.

---

## How to Run

### Prerequisites
- C++ compiler (e.g., g++)

### Steps
1. Clone this repository.
2. Navigate to the folder containing the problem code.
3. Compile and run the program:
   ```bash
   g++ -o prefix_suffix prefix_suffix.cpp
   ./prefix_suffix