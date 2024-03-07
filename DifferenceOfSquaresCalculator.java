class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int result = input * (input + 1) / 2;
        return result * result;
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquare =  (input*(input+1)*((2* input)+1) )/6;
        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        DifferenceOfSquaresCalculator objCalculator = new DifferenceOfSquaresCalculator();
        int difference = objCalculator.computeSquareOfSumTo(input) - objCalculator.computeSumOfSquaresTo(input);
        return difference;
    }

}

/*
 * Instructions
Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.
sum = n⋅(n+1)/2

The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.
sum = n⋅(n+1)⋅(2n+1)/6

Hence the difference between the square of the sum of the first ten natural numbers and the sum of the squares of the first
ten natural numbers is 3025 - 385 = 2640.

You are not expected to discover an efficient solution to this yourself from first principles; research is allowed,
indeed, encouraged. Finding the best algorithm for the problem is a key skill in software engineering.
 */