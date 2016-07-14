package hello;

/**
 * Created by Hicham on 14-07-16.
 */
public class VehiclePosition {

    public long directionId;
    public long distanceFromPoint;
    public long pointId;

    public VehiclePosition() {
    }

    public long getDirectionId() {
        return directionId;
    }

    public void setDirectionId(long directionId) {
        this.directionId = directionId;
    }

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public long getDistanceFromPoint() {
        return distanceFromPoint;
    }

    public void setDistanceFromPoint(long distanceFromPoint) {
        this.distanceFromPoint = distanceFromPoint;
    }
}