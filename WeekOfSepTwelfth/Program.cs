using System.Text.RegularExpressions;
using System;

namespace WeekOfSepTwelfth
{
    class Challenge
    {
        static void Main(string[] args)
        {
            Console.WriteLine("========IsValidHexCode=======");
            Console.WriteLine("True: " +  IsValidHexCode("#CD5C5C"));
            Console.WriteLine("True: " + IsValidHexCode("#EAECEE"));
            Console.WriteLine("True: " + IsValidHexCode("#eaecee"));
            Console.WriteLine("False: " + IsValidHexCode("#CD5C58C"));
            Console.WriteLine("False: " + IsValidHexCode("#CD5C5Z"));
            Console.WriteLine("False: " + IsValidHexCode("#CD5C&C"));
            Console.WriteLine("False: " + IsValidHexCode("CD5C5C"));
            Console.WriteLine("==========NextPrime==========");
            Console.WriteLine(13 + ": " + NextPrime(12));
            Console.WriteLine(29 + ": " + NextPrime(24));
            Console.WriteLine(11 + ": " + NextPrime(11));
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
        static bool IsValidHexCode(string str) 
        {
            Regex reg = new Regex("^#[0-9a-fA-F]{6}$");
            return reg.IsMatch(str);
        }
        /*
        b) Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

        Examples:
        NextPrime(12) ➞ 13

        NextPrime(24) ➞ 29

        NextPrime(11) ➞ 11
        // 11 is a prime, so we return the number itself.
        */

        static bool IsPrime(int num) 
        {
            if (num == 1) {
                return false;
            }
            for (int i=2; i <= Math.Sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        static int NextPrime(int num) 
        {
            if(IsPrime(num)) return num;
            return NextPrime(num + 1);
        }

    }
}