//Exercise for access modifiers

public class ElonsToyCar {

    private int distanceDriven;
    private int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar newCar = new ElonsToyCar();
        return newCar;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters",distanceDriven);
    }

    public String batteryDisplay() {
        if(batteryPercentage==0){
           return "Battery empty";
        }
            return String.format("Battery at %d%%", batteryPercentage);    
    }

    public void drive() {
        if(this.batteryPercentage != 0) {
    		this.distanceDriven += 20;
            this.batteryPercentage--;
        }
    }
}
