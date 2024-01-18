import java.util.Comparator;

public class TypeSort implements Comparator<Bag>{
    
    @Override
    public int compare(Bag o1, Bag o2)
    {
        if(o1.gettype() == o2.gettype())
        return 1;
        return 0;
    }
}
