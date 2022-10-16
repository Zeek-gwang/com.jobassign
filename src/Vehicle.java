public class Vehicle {

    private String name;
    private Location loc;
    private double charge;

    public Vehicle(String name) {
        this.name = name;
        this.loc = new Location(0, 0);
        this.charge = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}
