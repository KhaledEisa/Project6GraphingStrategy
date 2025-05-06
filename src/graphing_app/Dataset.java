package graphing_app;
import java.util.List;
public class Dataset {
    private List<Double> dataPoints;
    public Dataset(List<Double> dataPoints) {
        this.dataPoints = dataPoints;
    }
    public List<Double> getDataPoints() {
        return dataPoints;
    }
}