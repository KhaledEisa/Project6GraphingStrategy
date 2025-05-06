package graphing_app;
import java.util.List;
public class BarChartStrategy implements GraphStrategy {
    @Override
    public void draw(Dataset data) {
        System.out.println("--- Drawing Bar Chart ---");
        List<Double> points = data.getDataPoints();
        if (points == null || points.isEmpty()) {
            System.out.println("No data to draw.");
            return;
        }
        System.out.println("Data points: " + points);
        System.out.println("--- Bar Chart Visualization ---");
        for (double value : points) {
            int barLength = (int) (value / 5);
            System.out.print(String.format("%-5.1f | ", value));
            for (int i = 0; i < barLength; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("Bar chart visualization completed.");
    }
}