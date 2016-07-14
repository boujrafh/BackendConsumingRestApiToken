package hello;

import java.util.List;

/**
 * Created by Hicham on 14-07-16.
 */
public class PassingTimeByPoint {

    List<Points>points;
    public long pointId;

    public PassingTimeByPoint() {
    }

    public List<Points> getPoints() {
        return points;
    }

    public void setPoints(List<Points> points) {
        this.points = points;
    }

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }
}
