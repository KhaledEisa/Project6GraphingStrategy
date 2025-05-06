package graphing_app;
import java.util.List;
public class PieChartStrategy implements GraphStrategy {
    @Override
    public void draw(Dataset data) {
        System.out.println("--- Drawing Pie Chart ---");
        List<Double> points = data.getDataPoints();
        if (points == null || points.isEmpty()) {
            System.out.println("No data to draw.");
            return;
        }
        System.out.println("Data points: " + points);
        double total = points.stream().mapToDouble(Double::doubleValue).sum();
        if (total == 0) {
            System.out.println("Cannot draw pie chart: Total data value is zero.");
            return;
        }
        System.out.println("--- Pie Chart Visualization ---");
        for (int i = 0; i < points.size(); i++) {
            double value = points.get(i);
            double percentage = (value / total) * 100;
            System.out.printf("Slice %d (Value: %.2f): %.2f%%\n", (i + 1), value, percentage);
        }
        System.out.println("Pie chart visualization completed.");
    }
}