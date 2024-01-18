import java.util.Comparator;
import java.util.Scanner;

public class RatingSort implements Comparator<Bag>{
    static Scanner sc=new Scanner(System.in);

    @Override
    public int compare(Bag r1, Bag r2) {

        if(r1.getrating()>r2.getrating())
        return 1;
        else if(r1.getrating()<r2.getrating())
        return -1;
        return 0;
}
}
