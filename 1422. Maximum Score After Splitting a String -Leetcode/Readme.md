# Maximum Score After Splitting a Binary String

## Problem Statement
Given a binary string `s` (composed of `0`s and `1`s), the goal is to split the string into two non-empty substrings:
1. A **left substring** and a **right substring**.
2. Compute the **score** as the sum of:
   - The number of `0`s in the **left substring**.
   - The number of `1`s in the **right substring**.

The task is to find the **maximum score** among all possible ways to split the string.

---

## Example Scenarios

### Example 1
**Input:**  
`s = "011101"`  
**Output:**  
`5`  
**Explanation:**  
Possible splits and their scores:
- `left = "0"`, `right = "11101"`, score = `1 + 4 = 5`
- `left = "01"`, `right = "1101"`, score = `1 + 3 = 4`
- `left = "011"`, `right = "101"`, score = `1 + 2 = 3`
- `left = "0111"`, `right = "01"`, score = `1 + 1 = 2`
- `left = "01110"`, `right = "1"`, score = `2 + 1 = 3`

The maximum score is **5**.

---

### Example 2
**Input:**  
`s = "00111"`  
**Output:**  
`5`  
**Explanation:**  
Split as `left = "00"` and `right = "111"`. Score = `2 + 3 = 5`.

---

### Example 3
**Input:**  
`s = "1111"`  
**Output:**  
`3`  
**Explanation:**  
Split as `left = "111"` and `right = "1"`. Score = `0 + 3 = 3`.

---

## Pseudo Code for Approaches

### Approach 1: Using a Difference-Based Strategy
1. Initialize:
   - `zeros = 0` to count `0`s in the left substring.
   - `ones = 0` to count `1`s in the right substring.
   - `maxDiff = -1` to track the maximum difference between `zeros` and `ones`.

2. Iterate through the string `s`:
   - For every character:
     - Increment `zeros` if the character is `0`.
     - Otherwise, increment `ones`.
   - Update `maxDiff` as the maximum of the current difference between `zeros` and `ones`.

3. Account for the last `1` in the string:
   - Increment `ones` if the last character is `1`.

4. Compute the result as:
   - `maxDiff + ones`.

---

### Approach 2: Sliding Window Strategy
1. Count the total number of `1`s in the string (`totalOnes`).

2. Initialize:
   - `currentZeros = 0` for `0`s in the left substring.
   - `currentOnes = 0` for `1`s in the right substring.
   - `maxScore = 0`.

3. Iterate through the string up to `n-1` (to ensure the right substring is non-empty):
   - If the character is `0`, increment `currentZeros`.
   - If the character is `1`, increment `currentOnes`.
   - Calculate the current score as:
     - `currentZeros + (totalOnes - currentOnes)`.
   - Update `maxScore`.

4. Return `maxScore` as the final result.

---

## Time Complexity
- **Both Approaches:**  
  - **O(n)**: One traversal of the string to compute the result.

## Space Complexity
- **Both Approaches:**  
  - **O(1)**: Only a few variables used for computation.
