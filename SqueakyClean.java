//Exercise for converting a String

public class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder id = new StringBuilder(identifier);
        
        for (int i = 0; i != id.length(); i++) {
            char c = id.charAt(i);
            if (c == ' ') {
                id.setCharAt(i, '_');
            } else if (c == '0') {
                id.setCharAt(i, 'o');
            } else if (c == '1') {
                id.setCharAt(i, 'l');
            } else if (c == '3') {
                id.setCharAt(i, 'e');
            } else if (c == '4') {
                id.setCharAt(i, 'a');
            } else if (c == '7') {
                id.setCharAt(i, 't');
            } else if (Character.isISOControl(c)) {
                id.replace(i, i + 1, "CTRL");
                i += 3;
            } else if (c == '-' && i + 1 != id.length()) {
                char n = id.charAt(i + 1);
                if (!Character.isLetter(n)) {
                    id.delete(i, i + 2);
                    i--;
                } else {
                    id.replace(i, i + 2,
                                Character.toString(Character.toUpperCase(n)));
                }
            } else if (!Character.isLetter(c) || c >= 'α' && c <= 'ω') {
                id.deleteCharAt(i);
                i--;
            }
        }
        return id.toString();
    }
}