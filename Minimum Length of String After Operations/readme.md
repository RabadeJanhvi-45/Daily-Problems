# Minimum Length of String After Operations

## Problem Statement

You are given a string `s`. You can perform the following process on `s` any number of times:

1. Choose an index `i` in the string such that:
   - There is at least one character to the left of index `i` that is equal to `s[i]`.
   - There is at least one character to the right of index `i` that is also equal to `s[i]`.
2. Delete the closest character to the left of index `i` that is equal to `s[i]`.
3. Delete the closest character to the right of index `i` that is equal to `s[i]`.

Return the minimum length of the final string `s` that you can achieve.

### Examples

#### Example 1:
**Input:**  
`s = "abaacbcbb"`

**Output:**  
`5`

**Explanation:**
- Choose index `2` and remove characters at indices `0` and `3`. Resulting string: `"bacbcbb"`.
- Choose index `3` and remove characters at indices `0` and `5`. Resulting string: `"acbcb"`.
- The final string has a length of `5`.

#### Example 2:
**Input:**  
`s = "aa"`

**Output:**  
`2`

**Explanation:**
No operations can be performed. The length of the original string is returned.

---

## Constraints

- `1 <= s.length <= 2 * 10^5`
- `s` consists only of lowercase English letters.

---

## Solution

This solution leverages the following algorithm:

1. Count the frequency of each character in the string using an array.
2. For each character count:
   - Add `1` if the count is odd.
   - Add `2` if the count is even.
3. Sum the contributions to compute the minimum length of the final string.
