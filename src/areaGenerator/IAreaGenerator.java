package areaGenerator;

import java.util.List;

/**
 * Created by mariya.chernyshova on 14.09.2016.
 */
public interface IAreaGenerator {
    public double interval = 1;
    List<PointBase> generateArea();
    void fillPositionsPoints();
    void fillNumbers();
    List<PointBase> openEmptyArea(List<PointBase> points, PointBase currPoint);
}
