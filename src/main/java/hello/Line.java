package hello;

import java.util.List;

/**
 * Created by Hicham on 14-07-16.
 */
public class Line {

    public long lineId;
    public List<VehiclePosition> vehiclePositions;

    public Line() {
    }

    public List<VehiclePosition> getVehiclePositions() {
        return vehiclePositions;
    }

    public void setVehiclePositions(List<VehiclePosition> vehiclePositions) {
        this.vehiclePositions = vehiclePositions;
    }

    public long getLineId() {
        return lineId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }
}
