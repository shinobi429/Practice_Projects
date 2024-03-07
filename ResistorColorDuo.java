import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
    
    int value(String[] colors) {
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

        // Decode resistor colors and return a two-digit number
        int result = 0;
        for (int i = 0; i < Math.min(colors.length, 2); i++) {
            String colorAt = colors[i].toLowerCase();
            if (colorMap.containsKey(colorAt)) {
                result = result * 10 + colorMap.get(colorAt);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ResistorColorDuo resistorColorDuo = new ResistorColorDuo();
        String[] resistorColors = {"brown", "green", "violet"};
        int result = resistorColorDuo.value(resistorColors);
        System.out.println("Result: " + result);
    }

}
