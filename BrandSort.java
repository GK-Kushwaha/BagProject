import java.util.Comparator;

public class BrandSort implements Comparator<Bag>{

    @Override
    public int compare(Bag b1, Bag b2)
    {
        if(b1.getbrand().equals(b2.getbrand()))
        return 1;
        return 0;
    }
    
}