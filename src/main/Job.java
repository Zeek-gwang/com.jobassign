package main;

abstract class Job {

    private int jobIdx;
    private int jobType;
    private int time;
    private Location start;
    private Location end;
    private int qty;

    public Job(int jobIdx, int time, Location start, Location end, int qty) {
        this.jobIdx = jobIdx;
        this.time = time;
        this.start = start;
        this.end = end;
        this.qty = qty;
    }

    public int getJobIdx() {
        return jobIdx;
    }

    public void setJobIdx(int jobIdx) {
        this.jobIdx = jobIdx;
    }

    public int getJobType() {
        return jobType;
    }

    public void setJobType(int jobType) {
        this.jobType = jobType;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Location getStart() {
        return start;
    }

    public void setStart(Location start) {
        this.start = start;
    }

    public Location getEnd() {
        return end;
    }

    public void setEnd(Location end) {
        this.end = end;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
