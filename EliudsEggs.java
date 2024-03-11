public class EliudsEggs {

    private static int binary;

    public int binaryToDecimal(String binary) {
        // Use parseInt with base 2 to convert binary to decimal
        return this.binary = Integer.parseInt(binary, 2);

    }
    public int eggCount(int number) {
        int count = 0;        
        //Iterate through each bit and count the set bits (1s)
        while (number > 0) {
            count += number & 1;
            number >>=1;//Right shift to check the next bit
        }
        return count;
    }
}

/*Introduction
Your friend Eliud inherited a farm from her grandma Tigist. Her granny was an inventor and had a tendency to build things in an overly complicated manner. The chicken coop has a digital display showing an encoded number representing the positions of all eggs that could be picked up.

Eliud is asking you to write a program that shows the actual number of eggs in the coop.

The position information encoding is calculated as follows:

Scan the potential egg-laying spots and mark down a 1 for an existing egg or a 0 for an empty spot.
Convert the number from binary to decimal.
Show the result on the display.
Example 1:

Chicken Coop:
 _ _ _ _ _ _ _
|E| |E|E| | |E|

Resulting Binary:
 1 0 1 1 0 0 1

Decimal number on the display:
89

Actual eggs in the coop:
4
Example 2:

Chicken Coop:
 _ _ _ _ _ _ _ _
| | | |E| | | | |

Resulting Binary:
 0 0 0 1 0 0 0 0

Decimal number on the display:
16

Actual eggs in the coop:
1
Instructions
Your task is to count the number of 1 bits in the binary representation of a number.

Restrictions
Keep your hands off that bit-count functionality provided by your standard library! Solve this one yourself using other basic tools instead.

 */