public class BIKEupdated extends Bike implements BikeInterface , carInterface {

    public BIKEupdated(String bike, int year, String model) {
        super(bike, year, model);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean motorized() {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public String companyDetails() {
        // TODO Auto-generated method stub
        return    "Hyndai";
    }

    @Override
    public String getAclevel() {
        // TODO Auto-generated method stub
        return "18^c";
    }

    @Override
    public String getMusicPlayer() {
        // TODO Auto-generated method stub
        return  "Spotify";  }

    @Override
    public String getBatteryDetails() {
        // TODO Auto-generated method stub
        return "its full";
    }
    
}
