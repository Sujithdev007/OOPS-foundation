public class Bike implements BikeInterface {

    public String bike; 
    int released_year;
    String model;

    @Override
    public boolean motorized() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String companyDetails() {
        // TODO Auto-generated method stub

        return this.bike;
    }

    public Bike(String bike, int year,String model){
        this.bike = bike;
        this.released_year =year;
        this.model = model;

        System.out.println("Bike: "+this.bike+"Released year : "+this.released_year+ "Model  "+this.model);
    }
    
}
