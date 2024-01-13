public abstract class Bike implements BikeInterface {

    public String bike; 
    int released_year;
    String model;

   

    public Bike(String bike, int year,String model){
        this.bike = bike;
        this.released_year =year;
        this.model = model;

        System.out.println("Bike: "+this.bike+"Released year : "+this.released_year+ "Model  "+this.model);
    }
    
}
