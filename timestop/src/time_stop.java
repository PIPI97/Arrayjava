
public class time_stop {
    private double start, stop;

    public time_stop() {
        this.setStart();
        this.setStop();
    }

    public double getStart() {
        return start;
    }

    public void setStart() {
        this.start = System.currentTimeMillis();
    }

    public double getStop() {
        return stop;
    }

    public void setStop() {
        this.stop = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return  this.getStop() - this.getStart();
    }

}
