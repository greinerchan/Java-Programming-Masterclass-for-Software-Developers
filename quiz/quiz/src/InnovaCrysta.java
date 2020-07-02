public class InnovaCrysta extends Car {
    private Integer mileage;
    private String carName;
    public InnovaCrysta(Integer mileage) {
        super(false, "6");
        this.mileage = mileage;
        this.carName = "InnovaCrysta";
    }
    public String getMileage(){
        return this.mileage.toString();
    }
    public String getName(){
        return this.carName;
    }
}
