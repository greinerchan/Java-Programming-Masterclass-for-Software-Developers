public class HondaCity extends Car {
    private Integer mileage;
    private String carName;
    public HondaCity(Integer mileage) {
        super(true, "4");
        this.mileage = mileage;
        this.carName = "HondaCity";
    }
    public String getMileage(){
        return this.mileage.toString();
    }
    public String getName(){
        return this.carName;
    }
}