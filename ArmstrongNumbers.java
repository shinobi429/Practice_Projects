class ArmstrongNumbers {
    
    boolean isArmstrongNumber(int numberToCheck) {
        String numberAsString = Integer.toString(numberToCheck);
        int totalDigits = String.valueOf(numberToCheck).length();
        double sum = 0;
        
            for(int i = 0; i < numberAsString.length(); i++) {
                char digit = numberAsString.charAt(i);
                    int digitValue = Character.getNumericValue(digit);
            sum += Math.pow(digitValue, totalDigits);
            }
        return sum==numberToCheck;
    }

    public static void main(String[] args) {
    ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();
    System.out.println(armstrongNumbers.isArmstrongNumber(9));
    }

}

/*
 * Instructions
An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.

For example:

9 is an Armstrong number, because 9 = 9^1 = 9
10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190
Write some code to determine whether a number is an Armstrong number.

For more help on how to solve this exercise, please refer to the tutorial provided as part of the hello world exercise: instructions.append.md
 */