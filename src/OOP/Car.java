package OOP;

public class Car {
    //practice on encapsulation
    private String make;
    private String model;
    private int year;
    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }


    //how to copy object in java.
    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.model);
        this.setYear(x.year);
    }


}
