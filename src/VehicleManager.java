import java.util.HashMap;

public class VehicleManager {

    HashMap<String, Vehicle> vehicles;

    public VehicleManager(){
        vehicles = new HashMap<String, Vehicle>();
    }

    public HashMap<String, Vehicle> getVehicles() {
        return vehicles;
    }

    public int addVehicle(Vehicle vehicle) {
        if (vehicles.containsKey(vehicle.getName())){
            System.out.println("[ERROR] Adding vehicle is failed. Duplicated key");
            return 0;
        }

        vehicles.put(vehicle.getName(), vehicle);
        return 1;
    }

    public int removeVehicle(Vehicle vehicle) {
        if (!vehicles.containsKey(vehicle.getName())){
            System.out.println("[ERROR] Removing vehicle is failed. Not exist key");
            return 0;
        }

        vehicles.remove(vehicle.getName());
        return 1;
    }

}
