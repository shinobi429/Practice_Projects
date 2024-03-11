import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Say {

    private static final String[] UNITS = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TEENS = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] SCALES = {"", "thousand", "million", "billion"};

    List<Integer> chunks = new ArrayList<>();

    public String say(long number) {
        if (number < 0 || number > 999_999_999_999L) {
            throw new IllegalArgumentException("Number out of range");
        }

        if (number == 0) {
            return "zero";
        }

        // Clear the chunks list before populating it
        chunks.clear();

        // Split the numbers into chunks of three digits and store them in a list.
        while (number > 0) {
            int chunk = (int) (number % 1000);
            chunks.add(chunk);
            number /= 1000;
        }

        // Reverse the chunks list once after populating it
        Collections.reverse(chunks);

        // Convert chunks to text representation
        List<String> chunkStrings = new ArrayList<>();
        int scaleIndex = chunks.size() - 1;
        for (int i = 0; i < chunks.size(); i++) {
            int chunk = chunks.get(i);
            chunkStrings.add(convert(chunk, scaleIndex));
            scaleIndex--;
        }

        // Join the chunk strings with spaces and add appropriate scale
        return String.join(" ", chunkStrings).trim();
    
    }

    public String convert(int chunk, int scaleIndex) {

        StringBuilder chunkResult = new StringBuilder();        

        if (chunk < 10) {
            chunkResult.append(UNITS[chunk]);
        } else if (chunk < 20) {
            chunkResult.append(TEENS[chunk % 10]);
        } else if (chunk < 100) {
            chunkResult.append((chunk / 10 != 0 ? TENS[chunk / 10] : "") + (chunk % 10 != 0 ? "-" + UNITS[chunk % 10] : ""));
        } else {
            chunkResult.append(UNITS[chunk / 100] + " hundred ");
            if (chunk % 100 != 0) {
                int remainder = chunk % 100;
                chunkResult.append(TENS[remainder / 10] + (remainder % 10 != 0 ? "-" + UNITS[remainder % 10] : ""));
            }
        }
    // Apply the appropriate scale only if the chunk is not zero
    if (chunk != 0) {
        chunkResult.append(" " + SCALES[scaleIndex]);
    }

    return chunkResult.toString().trim();   
    }
}