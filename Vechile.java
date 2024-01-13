
//actually this indicates the class is incomplete beacuse of that method
public abstract class  Vechile {
    private String color ="blue";
    int maxSpeed;

    public Vechile() {
        System.out.println(this.color);
        this.maxSpeed= 70;
    }

    public Vechile(int maxSpeed){
        this.maxSpeed=maxSpeed;

    }

    public void print (){
        System.out.println("India");
    }

    public abstract boolean motorized ();
    // which abstract is used i dont the body of the method later child class let modify it

    public abstract String getCompanydetails();


}

