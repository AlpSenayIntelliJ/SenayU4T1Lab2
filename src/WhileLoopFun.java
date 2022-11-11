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


    public int countLetter(String word, String letter) {
        int count = 0;
        int idx = 0;
        while (idx < word.length()) {
            String nextLetter = word.substring(idx, idx+1);
            if (nextLetter.equals(letter)) {
                count++;
            }
            idx++;
        }
        return count;
    }


    public int maxDoubles(int number, int threshold) {
        int count = 0;
        while (threshold > number) {
            if (number * 2 <= threshold) {
                count++;
            }
            number = number * 2;
        }
        return count;
    }

    /**Returns true if number is prime (i.e. it has exactly two divisors: 1 and itself) and false
     if it is not prime (i.e. it has at least one other divisor); however, if number is 1, return false, as 1 is
     actually considered non-prime*
     Example:  If number is 2, return true (it can only be divided by 1 and 2)
     Example:  If number is 13, return true (it can only be divided by 1 and 13)
     Example:  If number is 14, return false (in addition to 1 and 14, it can be divided by 2 and 7)
     Example:  If number is 30, return false (in addition to 1 and 30, it can be divided by 2, 3, 5, 6, 10, 15)
     Example:  If number is 1, return false (it has only a single divisor: 1*)

     */
    public boolean isPrime(int number) {
        int divisor = 1;
        int countFactors = 0;
        if (number == 1) {
            return false;
        }
        while (countFactors <= 2) {
            if (number % divisor == 0) {
                countFactors++;
            }
            divisor++;
        }
        if (countFactors > 2) {
            return false;
        }
        else {
            return true;
        }
    }
}

