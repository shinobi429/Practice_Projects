//Exercise for method creation

public class Lasagna {

    public static int expectedMinutesInOven(){
        return 40;
    }

    public static int remainingMinutesInOven(int minutes){
        return Lasagna.expectedMinutesInOven() - minutes;
    }
    
    public static int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
    
    public static int totalTimeInMinutes(int layers, int minutes){
        return preparationTimeInMinutes(layers) + minutes;
    }

}






















// int expectedMinutesInOven(){
    //     int expectedMinutesInOven=40;
    //     return expectedMinutesInOven;
    // }
    
    // int remainingMinutesInOven(int actualMinutesInOven){
    //     int remainTime = expectedMinutesInOven()-actualMinutesInOven;
    //     return remainTime;
    // }

    // int preparationTimeInMinutes(int numberOfLayers){
    //     int minutesSpent = numberOfLayers * 2;
    //     return minutesSpent;
    // }

    // int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven){
    //     int totalTime = (numberOfLayers*2) + actualMinutesInOven;
    //     return totalTime;
    // }

    // public static void main(String[] args) {

    //     Lasagna lasagna = new Lasagna();
        
    //     lasagna.expectedMinutesInOven();
    //     lasagna.remainingMinutesInOven(25);
    //     lasagna.preparationTimeInMinutes(2);
    //     lasagna.totalTimeInMinutes(2, 5);
        
    // }
