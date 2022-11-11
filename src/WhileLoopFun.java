public class WhileLoopFun {


    public WhileLoopFun() { }


    public void printDigits(int number) {
        int count = 0;
        int length = (int)(Math.log10(number)+1);
        if (number > 0) {
            while (count < length) {
                int lastDigit = number % 10;
                number = number/10;
                System.out.println(lastDigit);
                count++;
            }
        }
    }

    /** Returns the number of times letter occurs in word.
     Example:  If word is "apple" and letter is "p",  this methods returns 2
     Example:  If word is "excellente" and letter is "e",  this methods returns 4

     PRECONDITION: letter has length 1
     Note!  This could arguably be done easier with a for loop, so if you already know how to use for loops,
     try it this time using a while loop!
     */
    public int countLetter(String word, String letter) {

    }

    /**Returns the maximum number of times that number can be doubled before it exceeds threshold
     Example:  If number is 4 and threshold is 20, return 2, since 4 can be doubled a maximum of two
     times, 4 → 8 → 16, without exceeding the threshold value of 20.

     Example:  If number is 2 and threshold is 65, return 5, since 2 can be doubled a maximum of five
     times, 2 → 4 → 8 → 16 → 32 → 64, without exceeding the threshold value of 65.

     Example:  If number is 2 and threshold is 64, return 5, since 2 can be doubled a maximum of five
     times, 2 → 4 → 8 → 16 → 32 → 64, without exceeding the threshold value of 64.

     Example:  If number is 2 and threshold is 63, return 4, since 2 can be doubled a maximum of four
     times, 2 → 4 → 8 → 16 → 32, without exceeding the threshold value of 63.

     Example:  If number is 5 and threshold is 500, return 6, since 5 can be doubled a maximum of six
     times, 5 → 10 → 20 → 40 → 80 → 160 → 320, without exceeding the threshold value of 500.

     Example:  If number is 8 and threshold is 10, return 0, since 8 cannot be doubled without
     exceeding threshold.

     Precondition: number > 0, threshold > 0
     */
    //public int maxDoubles(int number, int threshold) {
    //}

    /**Returns true if number is prime (i.e. it has exactly two divisors: 1 and itself) and false
     if it is not prime (i.e. it has at least one other divisor); however, if number is 1, return false, as 1 is
     actually considered non-prime*
     Example:  If number is 2, return true (it can only be divided by 1 and 2)
     Example:  If number is 13, return true (it can only be divided by 1 and 13)
     Example:  If number is 14, return false (in addition to 1 and 14, it can be divided by 2 and 7)
     Example:  If number is 30, return false (in addition to 1 and 30, it can be divided by 2, 3, 5, 6, 10, 15)
     Example:  If number is 1, return false (it has only a single divisor: 1*)

     * 1 is considered non-prime because prime numbers have exactly two divisors - the number and itself -
     but 1 has only a single divisor! (don’t believe it? Google it!)
     */
    //public boolean isPrime(int number) {
    //}
}

