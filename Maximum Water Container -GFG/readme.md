# Maximum Water Container

## Problem Description

You are given an array `arr[]` of non-negative integers, where each element `arr[i]` represents the height of a vertical line. The task is to find the maximum amount of water that can be contained between any two lines, together with the x-axis.

### Example

#### Example 1:
**Input**: `arr = [1, 5, 4, 3]`  
**Output**: `6`  
**Explanation**: The two lines at indices 1 (height 5) and 3 (height 3) form the container.  
- Distance between lines: 2.  
- Height of the container: `min(5, 3) = 3`.  
- Area: `3 * 2 = 6`.

#### Example 2:
**Input**: `arr = [3, 1, 2, 4, 5]`  
**Output**: `12`  
**Explanation**: The two lines at indices 0 (height 3) and 4 (height 5) form the container.  
- Distance between lines: 4.  
- Height of the container: `min(3, 5) = 3`.  
- Area: `4 * 3 = 12`.

---

## Approach: Two-Pointer Technique

This algorithm efficiently computes the maximum container area using two pointers:

1. Initialize two pointers:
   - `left` at the start of the array.
   - `right` at the end of the array.

2. Calculate the area between the two pointers:
   \[
   \text{Area} = (\text{right} - \text{left}) \times \min(\text{arr[left]}, \text{arr[right]})
   \]

3. Update the maximum area found so far.

4. Move the pointer pointing to the smaller height inward:
   - If `arr[left] < arr[right]`, increment `left`.
   - Otherwise, decrement `right`.

5. Repeat until the pointers meet.

---