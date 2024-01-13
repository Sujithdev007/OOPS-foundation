public interface BikeInterface {

    double Pi =3.14; // by default its public static in interface

    boolean motorized();

    String companyDetails();

    String getBatteryDetails(); // see you wont get error when the same methods is used in different interface
    // loook on Carinterface

    
} 