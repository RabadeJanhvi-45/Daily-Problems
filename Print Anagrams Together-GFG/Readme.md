# Print Anagrams Together

## Problem Statement
Given an array of strings, return all groups of strings that are anagrams. The groups must be created in the order of their appearance in the original array. The final output should be in lexicographic order.

### Example 1:
**Input:**  
`arr[] = ["act", "god", "cat", "dog", "tac"]`  

**Output:**  
`[["act", "cat", "tac"], ["god", "dog"]]`

**Explanation:**  
- Group 1: `["act", "cat", "tac"]`  
- Group 2: `["god", "dog"]`  
These are grouped because their characters can be rearranged to match each other.

---

## Approach

### Steps to Solve:
1. **Use a HashMap**:
   - Create a `HashMap` where the key is a sorted version of the string, and the value is a list of strings that are anagrams of that key.

2. **Iterate Through the Array**:
   - For each string in the array:
     - Convert it into a sorted string (this becomes the key).
     - Check if the key exists in the HashMap:
       - If it exists, append the string to the existing group.
       - If not, create a new group and add the string.

3. **Create the Result**:
   - Traverse the HashMap and collect all the grouped values.

4. **Return the Result**:
   - Ensure the output is in lexicographic order for each group and maintain the order of groups as they appeared in the array.

---

## Pseudocode
1. Initialize a `HashMap` with a key of type `String` (sorted string) and value of type `List<String>` (grouped anagrams).
2. For each string in the input array:
   - Sort the string to generate the key.
   - Check if the key exists in the map:
     - If yes, add the string to the corresponding value list.
     - If no, create a new list and add the string.
3. Traverse the map and collect all grouped lists into a result list.
4. Sort each group in lexicographic order.
5. Return the final result.

---

## Constraints
- The array contains `n` strings where `1 <= n <= 10^5`.
- The length of each string is between `1` and `100`.
- All strings consist of lowercase English letters.

---

## Complexity Analysis
- **Time Complexity:**  
  - Sorting each string: `O(k log k)` where `k` is the average length of the strings.
  - For all strings: `O(n * k log k)`.
  - Inserting into the HashMap and retrieving values: `O(n)`.
  - Overall: `O(n * k log k)`.

- **Space Complexity:**  
  - `O(n * k)` for storing strings in the HashMap.

---
