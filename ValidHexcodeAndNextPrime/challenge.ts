
/*
a) Create a function that determines whether a string is a valid hex code.

A hex code must begin with a pound key # and is exactly 6 characters in length. 
Each character must be a digit from 0-9 or an alphabetic character from A-F. 
All alphabetic characters may be uppercase or lowercase.

Examples:
IsValidHexCode("#CD5C5C") ➞ true

IsValidHexCode("#EAECEE") ➞ true

IsValidHexCode("#eaecee") ➞ true

IsValidHexCode("#CD5C58C") ➞ false
// Length exceeds 6

IsValidHexCode("#CD5C5Z") ➞ false
// Not all alphabetic characters in A-F

IsValidHexCode("#CD5C&C") ➞ false
// Contains unacceptable character

IsValidHexCode("CD5C5C") ➞ false
// Missing #
*/
const IsValidHexCode = (code: string) => {
    const regex = /^#[0-9a-fA-F]{6}$/;
    return regex.test(code);
}
console.log("========IsValidHexCode=======")
console.log("True: ", IsValidHexCode("#CD5C5C"))
console.log("True: ",IsValidHexCode("#EAECEE"))
console.log("True: ",IsValidHexCode("#eaecee"))
console.log("False: ",IsValidHexCode("#CD5C58C"))
console.log("False: ",IsValidHexCode("#CD5C5Z"))
console.log("False: ",IsValidHexCode("#CD5C&C"))
console.log("False: ",IsValidHexCode("CD5C5C"))


/*
b) Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

Examples:
NextPrime(12) ➞ 13

NextPrime(24) ➞ 29

NextPrime(11) ➞ 11
// 11 is a prime, so we return the number itself.
*/
const isPrime = (num) => {
    if (num == 1) {
        return false;
    }
    for (let i=2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) return false;
    }
    return true;
}

const NextPrime = (num: number) => {
    if(isPrime(num)) return num;
    return NextPrime(num + 1);
}

console.log("==========NextPrime==========")
console.log(13, NextPrime(12))
console.log(29, NextPrime(24))
console.log(11, NextPrime(11))