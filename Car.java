// Interitance
public class Car extends Vechile{

    private int wheels = 2;
    public String carCompany;
    public int carMillage;
    public String carmodel;

    // Paramterised Constructor
    public  Car(int maxSpeed, String carCompany, String carmodel, int millage){
         super(maxSpeed); // inorder to acess the parent class constructor
       
        this.carCompany = carCompany;
        this.carMillage = millage;
        this.carmodel = carmodel;

        System.out.println("CarModel: "+this.carmodel+"Car-Company: "+this.carCompany+"Millage: "+this.carMillage+"MaxSpeed: "+super.maxSpeed);

       


    }

    // class methods which overides parents method (Polymorphism)
    public void print(){
        System.out.println("Hello this is car's Print");
    }

    @Override
    public boolean motorized() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
