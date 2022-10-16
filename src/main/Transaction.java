package main;

import java.util.ArrayList;

public class Transaction {
    ArrayList<Load> loads;
    ArrayList<Unload> unloads;

    public ArrayList<Load> getLoads() {
        return loads;
    }

    public void addLoad(Load load) {
        loads.add(load);
    }

    public ArrayList<Unload> getUnloads() {
        return unloads;
    }

    public void addUnload(Unload unload) {
        unloads.add(unload);
    }
}
