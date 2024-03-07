import java.util.HashMap;
import java.util.Map;

public class ResistorColorTrio {

    String label(String[] colors) {

        Map<String, Integer> colorMap = new HashMap<>();
            colorMap.put("black", 0);
            colorMap.put("brown", 1);
            colorMap.put("red", 2);
            colorMap.put("orange", 3);
            colorMap.put("yellow", 4);
            colorMap.put("green", 5);
            colorMap.put("blue", 6);
            colorMap.put("violet", 7);
            colorMap.put("grey", 8);
            colorMap.put("white", 9);
        
        int AtIndex0 = colorMap.get(colors[0]);
        int AtIndex1 = colorMap.get(colors[1]);
        int multiplier = colorMap.get(colors[2]);
        
        long totalValue = (10*AtIndex0 + AtIndex1)*((long) Math.pow(10, multiplier));
        
        if (totalValue >= 1000000000) {
            return String.format("%d %s", totalValue/1000000000, "gigaohms");
        }
        if (totalValue >= 1000000) {
            return String.format("%d %s",totalValue/1_000_000, "megaohms");
        }
        if (totalValue >= 1000) {
            return String.format("%d %s", totalValue/1000, "kiloohms");
        }

        return String.format("%d %s", totalValue, "ohms");
    }
    
    public static void main(String[] args) {
        ResistorColorTrio trioObj = new ResistorColorTrio();
        String[] trioColors = {"orange", "orange", "black"};
        System.out.println(trioObj.label(trioColors));
    }
}

/*
 * If you want to build something using a Raspberry Pi, you'll probably use resistors. For this exercise, you need to know only three things about them:

Each resistor has a resistance value.

Resistors are small - so small in fact that if you printed the resistance value on them, it would be hard to read. To get around this problem, manufacturers print color-coded bands onto the resistors to denote their resistance values.

Each band acts as a digit of a number. For example, if they printed a brown band (value 1) followed by a green band (value 5), it would translate to the number 15. In this exercise, you are going to create a helpful program so that you don't have to remember the values of the bands. The program will take 3 colors as input, and outputs the correct value, in ohms. The color bands are encoded as follows:

Black: 0

Brown: 1

Red: 2

Orange: 3

Yellow: 4

Green: 5

Blue: 6

Violet: 7

Grey: 8

White: 9

In Resistor Color Duo you decoded the first two colors. For instance: orange-orange got the main value 33. The third color stands for how many zeros need to be added to the main value. The main value plus the zeros gives us a value in ohms. For the exercise it doesn't matter what ohms really are. For example:

orange-orange-black would be 33 and no zeros, which becomes 33 ohms.
orange-orange-red would be 33 and 2 zeros, which becomes 3300 ohms.
orange-orange-orange would be 33 and 3 zeros, which becomes 33000 ohms.
(If Math is your thing, you may want to think of the zeros as exponents of 10. If Math is not your thing, go with the zeros. It really is the same thing, just in plain English instead of Math lingo.)

This exercise is about translating the colors into a label:

"... ohms"

So an input of "orange", "orange", "black" should return:

"33 ohms"

When we get to larger resistors, a metric prefix is used to indicate a larger magnitude of ohms, such as "kiloohms". That is similar to saying "2 kilometers" instead of "2000 meters", or "2 kilograms" for "2000 grams".

For example, an input of "orange", "orange", "orange" should return:

"33 kiloohms"
 */