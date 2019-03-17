import java.util.List;
import java.util.Map;

public class PrinterContext {

    private Printer strategy;

    public void setStrategy(Printer strategy) {
        this.strategy = strategy;
    }

    public void print(Map<String, List<String>> items) {
        strategy.print(items);
    }
}
