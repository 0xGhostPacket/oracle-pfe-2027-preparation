# Java HackerRank Preparation — Day 1
## Remaining Coding Challenges

**Language:** Java 17  
**IDE:** IntelliJ IDEA  
**Input:** Scanner  
**Rule:** Try to solve each problem independently before checking hints.

---

## Problem 3 — Linear Search

**Difficulty:** Easy

### Problem statement

Given an array of N integers and a target number X, find the index of the first occurrence of X.

If the number does not exist, return -1.

### Example 1

Input:
```text
6
10 20 30 40 50 60
40
```

Output:
```text
3
```

### Example 2

Input:
```text
5
1 2 3 4 5
9
```

Output:
```text
-1
```

### Requirements
- Create a method `linearSearch(int[] numbers, int target)`.
- Use a loop to search the array.
- Return the index if found.
- Return -1 if not found.

### Hint
Array indexes start at zero.

---

## Problem 4 — Count Vowels in a String

**Difficulty:** Easy

### Problem statement

Given a string, count how many vowels it contains.

Vowels: a, e, i, o, u.

Your solution must work with uppercase and lowercase letters.

### Example 1

Input:
```text
Hello World
```

Output:
```text
3
```

### Example 2

Input:
```text
JAVA PROGRAMMING
```

Output:
```text
5
```

### Requirements
- Create a method `countVowels(String text)`.
- Use a loop.
- Check each character.
- Return the number of vowels.

### Hint
Use `charAt(i)` and `toLowerCase()`.

---

## Problem 5 — Reverse an Array

**Difficulty:** Medium

### Problem statement

Given an array of N integers, reverse its elements.

### Example 1

Input:
```text
5
1 2 3 4 5
```

Output:
```text
5 4 3 2 1
```

### Example 2

Input:
```text
4
10 20 30 40
```

Output:
```text
40 30 20 10
```

### Requirements
- Create a method `reverseArray(int[] numbers)`.
- Reverse the array in place.
- Do not create another array.
- Print the resulting array.

### Hint
Use two pointers:
- One starts at index 0.
- The other starts at the last index.
- Swap their values.
- Move both pointers toward the center.

---

## Problem 6 — Check Palindrome

**Difficulty:** Medium

### Problem statement

Given a string, determine whether it is a palindrome.

A palindrome reads the same forward and backward.

### Example 1

Input:
```text
madam
```

Output:
```text
Palindrome
```

### Example 2

Input:
```text
hello
```

Output:
```text
Not Palindrome
```

### Requirements
- Create a method `isPalindrome(String text)`.
- Return a boolean.
- Compare characters from both ends.
- Ignore uppercase/lowercase differences.
- For this exercise, ignore spaces and punctuation.

### Hint
You can use two pointers or reverse the string with StringBuilder.

---

## Problem 7 — Find the Second-Largest Distinct Number

**Difficulty:** Medium

### Problem statement

Given an array of integers, find the second-largest distinct number.

If there is no second-largest distinct number, report that no answer exists.

### Example 1

Input:
```text
6
10 5 20 8 20 15
```

Output:
```text
15
```

### Example 2

Input:
```text
5
4 4 4 4 4
```

Output:
```text
No second largest number
```

### Requirements
- Create a method `findSecondMax(int[] numbers)`.
- Do not sort the array.
- Do not count duplicate maximum values.
- Aim for one loop.
- Handle arrays with fewer than two distinct values.

### Hint
Maintain two variables:
- `max`
- `secondMax`

Think carefully about what happens when a new maximum is found.

---

## Problem 8 — Find the Most Frequent Number

**Difficulty:** Medium

### Problem statement

Given an array of integers, find the number that appears most frequently.

If two or more numbers have the same highest frequency, return the smallest number among them.

### Example 1

Input:
```text
7
1 2 2 3 3 3 4
```

Output:
```text
3
```

### Example 2

Input:
```text
6
5 5 2 2 8 8
```

Output:
```text
2
```

Explanation: All three numbers appear twice. The smallest is 2.

### Requirements
- Create a method `mostFrequent(int[] numbers)`.
- Count how many times each number appears.
- Find the highest frequency.
- Apply the tie-breaking rule.
- Do not assume that the array is sorted.

### Hint
You can initially solve this using nested loops. Later, we'll learn how to solve it more efficiently using HashMap.

---

# Progress Tracker

- [x] Problem 1 — Sum of Even Numbers
- [x] Problem 2 — Count Positive, Negative and Zero
- [ ] Problem 3 — Linear Search
- [ ] Problem 4 — Count Vowels
- [ ] Problem 5 — Reverse an Array
- [ ] Problem 6 — Check Palindrome
- [ ] Problem 7 — Second-Largest Distinct Number
- [ ] Problem 8 — Most Frequent Number

# Rules for Every Challenge

1. Use Java 17.
2. Write a complete program with `public class Main`.
3. Use `Scanner` for input.
4. Separate problem logic into methods whenever requested.
5. Don't print unnecessary prompts.
6. Test normal cases and edge cases.
7. Write down the time and space complexity.
8. Don't look for solutions before attempting the problem.

**Recommended order:** Follow Problems 3 → 8. Don't skip ahead.

**Goal:** Understand the logic, not just make the code compile.
