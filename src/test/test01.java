package test;

import main.*;

public class test01 {

    VehicleManager vehicleManager;

    public test01(){
        vehicleManager = new VehicleManager();
        vehicleManager.addVehicle(new Vehicle("V1"));
        vehicleManager.addVehicle(new Vehicle("V2"));

        Transaction trans1 = new Transaction();
//        trans1.addLoad(new Load(0, ))
    }
}
