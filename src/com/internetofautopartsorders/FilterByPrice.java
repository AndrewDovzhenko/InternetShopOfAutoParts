import java.util.ArrayList;
import java.util.List;

public class FilterByPrice implements Filter {


    private final double from;
    private final double to;

    public FilterByPrice(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean filter(Item item) {
        return item.getPrice() >= from && item.getPrice() <= to;
    }
}
