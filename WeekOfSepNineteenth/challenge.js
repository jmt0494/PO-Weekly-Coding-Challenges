/*
Problem Statement
Write a program that accepts sets of three numbers and prints the second-maximum number among the three.

Input

    
First line contains the number of triples, N.
    
The next N lines which follow each have three space separated integers.

Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.

Constraints


    
1 ≤ N ≤ 6
    
1 ≤ every integer ≤ 10000
    
The three integers in a single triplet are all distinct. That is, no two of them are equal.

Sample Input
3
1 2 3
10 15 5
100 999 500
Sample Output
2
10
500
*/
// solution
// time: O(1), space: O(1)
var secondMax = function (nums) {
    return Math.max(Math.min(nums[0], nums[1]), Math.min(nums[1], nums[2]));
};
// Test cases
console.log(secondMax([1, 2, 3])); // 2
console.log(secondMax([10, 15, 5])); // 10
console.log(secondMax([100, 99, 500])); // 500
/*
Problem statement
Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.


Input
    
The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
    
Each test case is described with a single line containing a string S, the alphanumeric string.


Output

For each test case, output a single line containing the sum of all the digit characters in that string.


Constraints
    
1 ≤ T ≤ 1000
    
1 ≤ |S| ≤ 1000, where |S| is the length of the string S.

Example
Input:
1
ab1231da
Output:
7
*/
var sumNumsInString = function (str) {
    var reg = /[0-9]/g;
    var nums = str.match(reg);
    return nums ? 0 : nums.map(n => Number(n)).reduce((a, n) => a + n);
};
//Test cases
console.log(sumNumsInString("ab1231da")); // 7
