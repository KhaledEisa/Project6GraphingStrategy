package graphing_app;
import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 1. Create a Dataset
        List<Double> sampleData = Arrays.asList(10.0, 25.0, 15.0, 30.0, 20.0, 5.0, 35.0);
        Dataset dataset = new Dataset(sampleData);
        // 2. Create the Graph Context
        GraphContext context = new GraphContext();
        context.setDataset(dataset);
        // 3. Create Strategies instances
        GraphStrategy lineStrategy = new LineGraphStrategy();
        GraphStrategy barStrategy = new BarChartStrategy();

        // Demonstrate Line Graph
        System.out.println("Displaying Line Graph");
        context.setGraphStrategy(lineStrategy);
        context.displayGraph();

        // Demonstrate Bar Chart
        System.out.println("Displaying Bar Chart");
        context.setGraphStrategy(barStrategy);
        context.displayGraph();

        //Question 4: Additional Graphs
        GraphStrategy pieStrategy = new PieChartStrategy();
        // Demonstrate Pie Chart
        context.setDataset(dataset);
        System.out.println("Displaying Pie Chart");
        context.setGraphStrategy(pieStrategy);
        context.displayGraph();

    }
}