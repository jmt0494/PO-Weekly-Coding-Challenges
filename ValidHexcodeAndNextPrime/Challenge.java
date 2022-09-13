package ValidHexcodeAndNextPrime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("========IsValidHexCode=======");
        System.out.println("True: " + IsValidHexCode("#CD5C5C"));
        System.out.println("True: " + IsValidHexCode("#EAECEE"));
        System.out.println("True: " + IsValidHexCode("#eaecee"));
        System.out.println("False: " + IsValidHexCode("#CD5C58C"));
        System.out.println("False: " + IsValidHexCode("#CD5C5Z"));
        System.out.println("False: " + IsValidHexCode("#CD5C&C"));
        System.out.println("False: " + IsValidHexCode("CD5C5C"));
        System.out.println();
        System.out.println("==========NextPrime==========");
        System.out.println("13: " + NextPrime(12));
        System.out.println("29: " + NextPrime(24));
        System.out.println("11: " + NextPrime(11));
    }

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
public static Boolean IsValidHexCode(String code) {
    Pattern regex = Pattern.compile("^#[0-9A-Fa-f]{6}$");
    Matcher matcher = regex.matcher(code);
    return matcher.find();
}

public static int NextPrime(int num) {
    if (isPrime(num)) return num;
    return NextPrime(num + 1);
}

public static boolean isPrime(int num){
    if (num == 1) return false;
    for (int i =2; i < Math.sqrt(num); i++) {
        if (num % i == 0)return false;
    }
    return true;
}
}
