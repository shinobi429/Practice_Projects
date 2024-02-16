public class CarsAssemble {
    
    private int speed;
    public static double prod;

    public double LessThan4(int speed) {
        prod = speed * 221;
        return prod;
    }

    public double Between5to8(int speed) {
        prod = speed * 221 * 0.9;
        return prod;
    }
    
    public double At9(int speed) {
        prod = speed * 221 * 0.8;
        return prod;
    }

    public double At10(int speed) {
        prod = speed * 221 * 0.77;
        return prod;
    }

    public static CarsAssemble carobj = new CarsAssemble();

    public double productionRatePerHour(int speed) {
        
        if(speed>=1 && speed<=4){
            LessThan4(speed);
        }else if(speed>=5 && speed<=8){
            Between5to8(speed);
        }else if(speed==9){
            At9(speed);
        }else if(speed==10){
            At10(speed);
        }else{
            // return 0.0;
            throw new IllegalArgumentException("Invalid speed value. Speed must be between 1 and 10.");
        }
    
    return prod;
    }

    public int workingItemsPerMinute(int speed) {
        return  (int) (productionRatePerHour(speed)/60);
    }

    public static void main(String[] args) {
        carobj.productionRatePerHour(0);
        System.err.println(prod);
    }
}
