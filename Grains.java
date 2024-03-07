import java.math.BigInteger;

class Grains {
    
    BigInteger grainsOnSquare(final int square) {

        //keeping the default value of BigInteger as one in the start
        BigInteger grains = BigInteger.ONE;

        if (square<1 || square>64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        if (square==1) {
            return grains;
        }

        //We start from 2 and stop till i=square 
        for (int i=2; i<=square; i++) {

            //2^(i-1)
            grains = BigInteger.valueOf(2).pow(i-1);
        }
        return grains;
    }

    BigInteger grainsOnBoard() {
        BigInteger totalGrains = BigInteger.ZERO;
        for (int i=1; i<=64; i++) {            
            /*here add function is the most important at first we take the value of totalGrain=0 at first 
            and add the grains at 2^(i-1) in it say for ex we look in i=1 so (0 + 2^0) = 0 + 1 = 1
            so we perform it 64 times.
            */
            totalGrains = totalGrains.add(BigInteger.valueOf(2).pow(i-1));
        }
        return totalGrains;
    }

    public static void main(String[] args) {
        Grains ob = new Grains();
        System.out.println(ob.grainsOnSquare(3));
            System.out.println(ob.grainsOnBoard());
    }

}
