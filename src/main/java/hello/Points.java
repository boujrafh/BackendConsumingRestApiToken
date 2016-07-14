package hello;

import java.util.List;

/**
 * Created by Hicham on 14-07-16.
 */
public class Points {

    public long pointId;
    List<String> passingTimes;

    public Points() {
    }

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public List<String> getPassingTimes() {
        return passingTimes;
    }

    public void setPassingTimes(List<String> passingTimes) {
        this.passingTimes = passingTimes;
    }
}
