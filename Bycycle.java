

public abstract class Bycycle extends Vechile{

    public String gearType;
    public String cycleCompany;
    
    public Bycycle(int maxSpeed,String Company, String gearType){
        super(maxSpeed);
        this.cycleCompany = Company;
        this.gearType = gearType;

        System.out.println("Comapny is : "+this.cycleCompany+" gear-type is "+this.gearType);

    }

    @Override // abstract method of class
    public boolean motorized() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
