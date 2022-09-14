/*
a) Create a function that determines whether a number is Oddish or Evenish. 
A number is Oddish if the sum of all of its digits is odd, and a number is Evenish if the sum of all of its digits is even.
If a number is Oddish, return "Oddish". Otherwise, return "Evenish".

For example, oddishOrEvenish(121) should return "Evenish", since 1 + 2 + 1 = 4. oddishOrEvenish(41) should return "Oddish", since 4 + 1 = 5.

Examples:
oddishOrEvenish(43) ➞ "Oddish"
// 4 + 3 = 7
// 7 % 2 = 1

oddishOrEvenish(373) ➞ "Oddish"
// 3 + 7 + 3 = 13
// 13 % 2 = 1

oddishOrEvenish(4433) ➞ "Evenish"
// 4 + 4 + 3 + 3 = 14
// 14 % 2 = 0
*/
const oddishOrEvenish = (num) => {
    const sumOfDigits = num.toString()
        .split("")
        .map(n => Number.parseInt(n))
        .reduce((a, n) => a + n);
    return sumOfDigits % 2 == 0 ? "Evenish" : "Oddish";
}
console.log("============oddishOrEvenish=============")
console.log("Oddish: " + oddishOrEvenish(43))
console.log("Oddish: " + oddishOrEvenish(373))
console.log("Evenish: " + oddishOrEvenish(4433))

/*
b) Write a function to replace all instances of character c1 with character c2 and vice versa.

Examples:
doubleSwap( "aabbccc", "a", "b") ➞ "bbaaccc"

doubleSwap("random w#rds writt&n h&r&", "#", "&")
➞ "random w&rds writt#n h#r#"

doubleSwap("128 895 556 788 999", "8", "9")
➞ "129 985 556 799 888"

Notes:
Both characters will show up at least once in the string.
*/

const doubleSwap = (word, c1, c2) => {
    return word.split("")
        .map(l => l == c1 ? c2 : l == c2 ? c1 : l)
        .join('')
    
}
console.log("===============doubleSwap===================")
console.log("bbaaccc: " + doubleSwap( "aabbccc", "a", "b"))
console.log("random w&rds writt#n h#r#: " + doubleSwap( "random w#rds writt&n h&r&", "#", "&"))
console.log("129 985 556 799 888: " + doubleSwap( "128 895 556 788 999", "8", "9"))