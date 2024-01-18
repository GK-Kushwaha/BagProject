import java.util.Comparator;

public class AppBagSort implements Comparator<Bag>{

    @Override
    public int compare(Bag o1, Bag o2) {
        return o1.getprice()-o2.getprice();
    }
    
}