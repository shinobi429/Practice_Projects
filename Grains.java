import java.math.BigInteger;

class Grains {
    
    BigInteger grainsOnSquare(final int square) {
        BigInteger grains = BigInteger.ONE;

        if (square<1 || square>64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        if (square==1) {
            return grains;
        }

        for (int i=2; i<=square; i++) {
            grains = BigInteger.valueOf(2).pow(i-1);
        }
        return grains;
    }

    BigInteger grainsOnBoard() {
        BigInteger totalGrains = BigInteger.ONE;
        for (int i=60; i<=65; i++) {
            totalGrains = BigInteger.valueOf(2).pow(i-1).subtract(BigInteger.ONE);
        }
        return totalGrains;
    }

    public static void main(String[] args) {
        Grains ob = new Grains();
        System.out.println(ob.grainsOnSquare(3));
        System.out.println(ob.grainsOnBoard());
    }

}