package main;

public class Load extends Job{

    public Load(int jobIdx, int time, Location start, Location end, int qty) {
        super(jobIdx, time, start, end, qty);
        setJobType(0);
    }
}
