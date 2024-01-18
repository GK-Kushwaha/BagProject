import java.util.Comparator;

public class ColorSort implements Comparator<Bag> {

    @Override
    public int compare(Bag o1, Bag o2) {
       if(o1.getcolor() == o2.getcolor())
       return 1;
       return 0;
    }
    
}