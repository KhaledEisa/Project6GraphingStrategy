package graphing_app;
import java.util.List;

public class LineGraphStrategy implements GraphStrategy {
    @Override
    public void draw(Dataset data) {
        System.out.println("--- Drawing Line Graph ---");
        List<Double> points = data.getDataPoints();
        if (points == null || points.isEmpty()) {
            System.out.println("No data to draw.");
            return;
        }
        System.out.println("Data points: " + points);
        // Simulate detailed line drawing logic here
        System.out.println("Line graph visualization completed.");
    }
}