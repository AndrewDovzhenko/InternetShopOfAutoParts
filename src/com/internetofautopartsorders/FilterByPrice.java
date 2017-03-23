import java.util.ArrayList;
import java.util.List;

public class FilterByPrice implements Filter {


    private final long from;
    private final long to;

    public FilterByPrice(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean filter(Item item) {
        return item.getPrice() >= from && item.getPrice() <= to;
    }
}
