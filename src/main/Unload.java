package main;

public class Unload extends Job{

    public Unload(int jobIdx, int time, Location start, Location end, int qty) {
        super(jobIdx, time, start, end, qty);
        setJobType(1);
    }
}
