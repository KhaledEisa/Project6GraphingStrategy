package graphing_app;
public class GraphContext {
    private GraphStrategy graphStrategy;
    private Dataset dataset;
    public void setGraphStrategy(GraphStrategy graphStrategy) {
        this.graphStrategy = graphStrategy;
    }
    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }
    public void displayGraph() {
        if (graphStrategy == null) {
            System.out.println("Error: No graph strategy set.");
            return;
        }
        if (dataset == null) {
            System.out.println("Error: No dataset provided.");
            return;
        }
        graphStrategy.draw(dataset);
        System.out.println("--------------------------\n"); // Separator for clarity
    }
}