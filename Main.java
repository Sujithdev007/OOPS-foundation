


public class Main {
    public static void main(String aegs[]){

        // Vechile v = new Vechile();
        // Vechile v ;
        // v.print();
        // Car C = new Car(300, "Hyundai", "Verna", 30);
        // C.print();
        // Bycycle B = new Bycycle(40, "Hercules", "6*3 gearon");

        //abstract
        Benz BZ = new Benz(300, "Benz", "Verna", 30);
       System.out.println(BZ.getCompanydetails()); 

       // interface
       Bike B = new Bike("yamaha", 1998, "rx-100");
       BikeInterface B1;
       B1 = new Bike("yamaha", 1998, "rx-100");
       System.out.println(B1.companyDetails());


    }
}
