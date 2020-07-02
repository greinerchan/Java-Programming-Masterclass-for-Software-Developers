/**
 *   WagonR class
 **/
public class WagonR extends Car {
    private Integer mileage;
    private String carName;
    public WagonR(Integer mileage) {
        super(false, "4");
        this.mileage = mileage;
        this.carName = "WagonR";
    }
    public String getMileage(){
        return this.mileage.toString();
    }
    public String getName(){
        return this.carName;
    }
}
