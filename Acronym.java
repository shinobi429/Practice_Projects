import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {
    private String Phrase;

    Acronym(String phrase) {
        // String ch = " ";
        // int indexOfSpace = phrase.indexOf(ch);
        // int a = phrase.charAt(indexOfSpace + 1);
        // String subString = phrase.substring(indexOfSpace, a);
        this.Phrase = phrase;
    }

    String get() {
        return Arrays.stream(Phrase.split("[- _]+"))
            .map(s -> Character.toString(s.toUpperCase().charAt(0)))
            .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Acronym ob = new Acronym("As Soon As Possible.");
        System.out.println(ob);
    }

}

// String ch = " ";
        // int indexOfSpace = phrase.indexOf(ch);
        // int a = phrase.charAt(indexOfSpace + 1);
        // String subString = phrase.substring(indexOfSpace, a);