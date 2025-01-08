## 1. Counting Prefix-Suffix Pairs

### Problem Statement

You are given a 0-indexed string array `words`. Define a boolean function `isPrefixAndSuffix(str1, str2)` that returns true if `str1` is both a prefix and suffix of `str2`. Return the number of index pairs `(i, j)` such that `i < j` and `isPrefixAndSuffix(words[i], words[j])` is true.

### Example Input and Output

#### Example 1
**Input**: `words = ["a","aba","ababa","aa"]`  
**Output**: `4`  

#### Example 2
**Input**: `words = ["pa","papa","ma","mama"]`  
**Output**: `2`

---

### Approach 1: Brute Force

The brute force approach iterates through all possible `(i, j)` pairs and checks if `words[i]` is a prefix and suffix of `words[j]`.

#### Time Complexity
- **O(n² \* m)**, where `n` is the number of words, and `m` is the length of the longest string.

---

### Approach 2: Optimized

Sort the array of words by length and use string operations efficiently. Check prefix and suffix properties directly with substrings.

#### Time Complexity
- **O(n²)** with optimized substring comparison.

---

### Code

For the complete implementation, refer to `prefix_suffix.cpp` in this repository.

---