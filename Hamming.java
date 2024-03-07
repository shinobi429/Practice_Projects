public class Hamming {

    private int difference = 0;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("Strnds must be of the same lenght");
        }
        for(int i=0; i < leftStrand.length(); i++){
            if (leftStrand.charAt(i)!=rightStrand.charAt(i)) {
                difference++;
            }
        }
    }

    public int getHammingDistance() {
        return difference;
    }
}

/*
 * Instructions
Calculate the Hamming Distance between two DNA strands.

Your body is made up of cells that contain DNA. Those cells regularly wear out and need replacing, which they
achieve by dividing into daughter cells. In fact, the average human body experiences about 10 quadrillion cell
divisions in a lifetime!

When cells divide, their DNA replicates too. Sometimes during this process mistakes happen and single pieces of
DNA get encoded with the incorrect information. If we compare two strands of DNA and count the differences between
them we can see how many mistakes occurred. This is known as the "Hamming Distance".

We read DNA using the letters C,A,G and T. Two strands might look like this:

GAGCCTACTAACGGGAT
CATCGTAATGACGGCCT
^ ^ ^  ^ ^    ^^
They have 7 differences, and therefore the Hamming Distance is 7.

The Hamming Distance is useful for lots of things in science, not just biology, so it's a nice phrase to be familiar
with :)

Implementation notes
The Hamming distance is only defined for sequences of equal length, so an attempt to calculate it between sequences
of different lengths should not work.

This is the first exercise with tests that require you to throw an Exception. Exceptions are typically thrown to indicate
    that a program has encountered an unexpected input or state.

Tests throughout the track will verify that the exceptions you throw are:

1-->instances of a specified Java type;
2-->(optionally) initialized with a specified message.
 */