public class Car extends Vechile{

    private int wheels = 2;
    public String carCompany;
    public int carMillage;
    public String carmodel;


    public  Car(int maxSpeed, String carCompany, String carmodel, int millage){
         super(maxSpeed);
       
        this.carCompany = carCompany;
        this.carMillage = millage;
        this.carmodel = carmodel;

        System.out.println("CarModel: "+this.carmodel+"Car-Company: "+this.carCompany+"Millage: "+this.carMillage+"MaxSpeed: "+super.maxSpeed);

       


    }
    
}
