import java.util.Comparator;

public class DiscountSort implements Comparator<Bag>{
    @Override
    public int compare(Bag o1, Bag o2)
    {
       return o1.getdiscount()-o2.getdiscount();
    }
}
