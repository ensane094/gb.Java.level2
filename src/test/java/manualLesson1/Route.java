package manualLesson1;

public class Route implements Barrier{
    private double distance;

    public Route(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(RunJump runJump) {
        if(runJump.run()>distance){
            return true;
        }
        return false;
    }
}
