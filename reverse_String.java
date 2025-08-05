class Solution {
    public int reverse(int x) {
        int originalNumber = Math.abs(x);
        int reversedNumber = 0;

        while(originalNumber != 0) {
            int remainder = originalNumber % 10;
            if(reversedNumber > (Integer.MAX_VALUE - remainder) / 10)
                return 0;
            reversedNumber = reversedNumber * 10 + remainder;
            originalNumber = originalNumber / 10;
        }
        
        return (x < 0) ? (-reversedNumber) : reversedNumber;
    }
}