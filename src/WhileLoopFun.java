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


    public boolean isPrime(int number) {
        int divisor = 1;
        int countFactors = 0;
        if (number == 1) {
            return false;
        }
        while (divisor < number) {
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

